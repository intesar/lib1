$(function() {

	$("#tab li").wrapInner("<div class='inner01'></div>");
	$("#tab li div.inner01").wrapInner("<div class='inner02'></div>");

	$("#tab li").click(function() {
        var num = $("#tab li").index(this);
        $(".content_wrap").addClass('disnon');
        $(".content_wrap").eq(num).removeClass('disnon');
        $("#tab li").removeClass('select');
        $(this).addClass('select')
    });
    	
	$("#tab li.select").click();
	
});