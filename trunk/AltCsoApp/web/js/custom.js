var customerArray = new Array();
var customer_ = null;
var profileArray = new Array();
var profile_ = null;
$(document).ready(function() {
        
    $( ".datepicker" ).datepicker({
        showOn: "button",	
        buttonImage: "images/calendar.gif",			
        buttonImageOnly: true
    });
    $("#help").click(function() {
        $("#dialog").dialog();
    });
    // Tab 1
    $("#goTab1").click(function() {
        AltCsoAjax.searchCustomerByName($("#searchTab1").val(), function(data){
            var html = '';
            $.each(data, function(i, v){
                customerArray[v.customerId] = v;
                html += '<div class="clickable tab1Result" id="tab1-'+ v.customerId +'">' + v.groupName +'</div>'
            })
            $("#resultTab1").html(html);
            $("#cancelTab1").click();
        })
    })
    $(".tab1Result").live("click",function() {
        customer_ = customerArray[this.id.substr(5)];
        $("#customerIdTab1").html(customer_.customerId);
        $("#createdDateTab1").html(customer_.formatedCreateDate);
        $("#customerNameTab1").val(customer_.groupName);
        $("#appKeyTab1").html(customer_.appkey);
        $("#expirationDateTab1").val(customer_.formatedExpiryDate);
        $("#maximumPriorityTab1").val(customer_.maxPriority);
        $("input[name='gtmx']").each(function() {
            if($(this).val() == customer_.tmx) {
                $(this).attr("checked","checked");
            }
        })
        updateTab1Dropdowns();
    })
    $("#cancelTab1").click(function() {
        customer_ = null;
        $("#customerIdTab1").html("");
        $("#createdDateTab1").html("");
        $("#customerNameTab1").val("");
        $("#appKeyTab1").html("");
        $("#expirationDateTab1").val("");
        $("#maximumPriorityTab1").val("");
        $("input[name='gtmx']").each(function() {
            if($(this).val() == "N") {
                $(this).attr("checked","checked");
            }
        })
    })
    $("#saveTab1").click(function() {
        if (customer_ == null ) {
            customer_ = {
                customerId:null, 
                formatedCreateDate:null, 
                groupName:null, 
                appkey:null, 
                formatedExpiryDate:null, 
                maxPriority:null, 
                tmx:null
            };
            updateCustomer()
            AltCsoAjax.persistCustomer(customer_);                
        } else {
            updateCustomer()
            AltCsoAjax.mergeCustomer(customer_);
        }
    })
    $("#deleteTab1").click(function(){
        AltCsoAjax.deleteCustomer(customer_.customerId);
    })
    $("#generateTab1").click(function(){
        AltCsoAjax.generateAppkey(function(key){
            $("#appKeyTab1").html(key);
            customer_.appkey = key;
        })
    })
    // End Tab 1
    // Tab 2
    $("#goTab2").click(function() {
        AltCsoAjax.searchCsoProfiles($("#searchTab2").val(), function(data){
            var html = '';
            $.each(data, function(i, v){
                profileArray[v.csoProfileId] = v;
                html += '<div class="clickable tab2Result" id="tab2-'+ v.csoProfileId +'">' + v.csoProfileName +'</div>'
            })
            $("#resultTab2").html(html);
        })
    })
    $(".tab2Result").live("click",function() {
        profile_ = profileArray[this.id.substr(5)];
        $("#profileNameTab2").val(profile_.csoProfileName);
        $("input[name='hyouka']").each(function() {
            if($(this).val() == profile_.defaultProfile) {
                $(this).attr("checked","checked");
            }
        })
    })
    $("#saveTab2").click(function(){
        profile_.csoProfileName = $("#profileNameTab2").val();
        profile_.defaultProfile = $("input[name='hyouka']:checked").val();
        AltCsoAjax.mergeCsoProfile(profile_, function(){
            alert("saved");
        })
    })
    $("#deleteTab2").click(function(){
        AltCsoAjax.deleteCsoProfile(profile_.csoProfileId, function(){
            alert("deleted");
        })
    })
    // End Tab2
    // Tab 3
    $("#userCancelBtn").click(function() {
        putUserData("","","");
        user = null;
    })
    $("#userSaveBtn").click(function() {
        saveUserData();
    })
    $("#userDeleteBtn").click(function() {
        deleteUserData();
    })
    $("#goUserBtn").click(function() {
        searchUser();
    })
    $(".user-name").live("click",function() {
        var userId = this.id.substr(5);
        $.each(userArray, function(index, value) { 
            if ( value.userId == userId ) {
                user = value;
                putUserData(value.userId,value.firstName,value.lastName);
            }
        })
                
    })
    // End Tab 3
    // Tab 4
    AltCsoAjax.getAllCutomers(function(data){
        $.each(data, function(index, value) { 
            $("#tab4customerId").append('<option value="' + value.customerId +'" >'+ value.groupName +'</option>');  
        })
    });
    $("#tab4GoBtn").click(function(){
        displayTab4();
    })
    oTable4 = $('#requestDataTable').dataTable( {	
        "bFilter": false,
        "sScrollY": "260px",
        "aLengthMenu": [10, 20, 40],
        "iDisplayLength": 10
    });	
    $("#export").click(function(){
        popup($('#requestDataTable').table2CSV({
            delivery:'value',
            header:['Request','Customer Name','Job Size','Finished','Transaction ID']
        }));
    })
    // End Tab 4
    // Tab 5
    oTable = $('#queueInfoDataTable').dataTable( {		
        "bFilter": false,
        "sScrollY": "410px",
        "aLengthMenu": [25, 50, 100],
        "iDisplayLength": 25
    });
    $("#refreshOTable").click(function() {
        displayTab5();
    })
    displayTab5();
// End Tab 5
});
// Tab 1
function updateCustomer() {
    customer_.groupName = $("#customerNameTab1").val();
    customer_.formatedExpiryDate = $("#expirationDateTab1").val();
    customer_.maxPriority = $("#maximumPriorityTab1").val();
    customer_.tmx = $("input[name='gtmx']:checked").val();
}
function updateTab1Dropdowns() {
    var postFix = '';//'<option>default</option>'; -- incase we wanna fix it at UI
    var enes = '';
    $.each(customer_.enes, function(i, v){
        enes += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_enes").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    enes += postFix;
    $("#enes").html(enes);
    var enfr = '';
    $.each(customer_.enfr, function(i, v){
        enfr += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_enfr").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    enfr += postFix;
    $("#enfr").html(enfr);
    var enjp = '';
    $.each(customer_.enjp, function(i, v){
        enjp += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_enjp").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    enjp += postFix;
    $("#enjp").html(enjp);
    var enpt = '';
    $.each(customer_.enpt, function(i, v){
        enpt += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_enpt").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    enpt += postFix;
    $("#enpt").html(enpt);
    var enzh = '';
    $.each(customer_.enzh, function(i, v){
        enzh += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_enzh").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    enzh += postFix;
    $("#enzh").html(enzh);
    var esen = '';
    $.each(customer_.esen, function(i, v){
        esen += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_esen").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    esen += postFix;
    $("#esen").html(esen);
    var fren = '';
    $.each(customer_.fren, function(i, v){
        fren += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_fren").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    fren += postFix;
    $("#fren").html(fren);
    var jpen = '';
    $.each(customer_.jpen, function(i, v){
        jpen += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_jpen").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    jpen += postFix;
    $("#jpen").html(jpen);
    var pten = '';
    $.each(customer_.pten, function(i, v){
        pten += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_pten").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    pten += postFix;
    $("#pten").html(pten);
    var zhen = '';
    $.each(customer_.zhen, function(i, v){
        zhen += '<option value="'+ v.csoProfileId +'">'+ v.csoProfileName +'</option>'
        $(".mt_zhen").html(v.transEngineProfileMapId.transEngineProfileName);
    })
    zhen += postFix;
    $("#zhen").html(zhen);
}
// End Tab 1
// Tab 2
    
// End Tab 2
// Tab 3
var userArray = new Array();
var user;
function searchUser() {        
    AltCsoAjax.getByUserIds($("#user_q").val(),function(data){
        userArray = data;
        var html = '';
        $.each(data, function(index, value) { 
            html += '<div class="clickable user-name" id="user-'+ value.userId+'">' + value.firstName + ' ' + value.lastName +'</div>';
        })
        console.log(html)
        $("#user_result").html(html);
        putUserData("","","");
    })
}
function putUserData(id, fn, ln) {
    $("#user_Id").val(id);
    $("#user_fn").val(fn);
    $("#user_ln").val(ln);
}
function saveUserData() {
    var id = $("#user_Id").val();
    var fn = $("#user_fn").val();
    var ln = $("#user_ln").val();
    if ( user == null  ) {
        AltCsoAjax.persistUsers(id,fn,ln,function(){
            alert("Created");
        })
    } else {
        user.firstName = fn;
        user.lastName = ln;
        AltCsoAjax.mergeUsers(user,function() {
            alert("Updated");
        })
    }
    putUserData("","","");
}
function deleteUserData() {
    if ( user != null ) {
        AltCsoAjax.deleteUsers(user.userId,function(){
            putUserData("","","");
            user = null;
            alert("Deleted");
                
        })
    }
        
}
// end Tab 3
// Tab 4
var oTable4;
function displayTab4() {
    var startTime = $("#tab4st").val();
    var endTime = $("#tab4et").val();
    var customerId = $("#tab4customerId").attr('value');
    AltCsoAjax.getTranslationStatusesBetween(startTime, endTime, customerId, function(data){
        var arr = new Array();
        var time = 0;
        //var queue = 0;
        var words = 0;
        $.each(data, function(index, value) { 
            arr[index] = [value.formatedStartTime, value.customerId.groupName, value.sourceLength+"KB", value.formatedEndTime, value.requestId];
            words += value.sourceWordCount;
            time += value.time;
        })
        $("#tab4TotalReq").html(data.length);
        $("#tab4AvgTime").html(time/data.length + " Mins");
        $("#tab4AvgQueueTime").html(time/data.length + " Mins");
        $("#tab4AvgWords").html(words/data.length);
        oTable4.fnClearTable();
        oTable4.fnAddData( arr );
    })
}
function popup(data) {
    window.location='data:text/xsl;charset=utf8,' + encodeURIComponent(data);
    return true; 
}
// End Tab 4
// Tab 5
var oTable;
function displayTab5(){
    AltCsoAjax.getActiveTranslationStatuses(function(data){
        var arr = new Array();
        $.each(data, function(index, value) { 
            arr[index] = [value.requestId, value.customerId.groupName, value.sourceLength+"MB", value.formatedStartTime]
        })
        oTable.fnClearTable();
        oTable.fnAddData( arr );
    })
}
// Tab 5