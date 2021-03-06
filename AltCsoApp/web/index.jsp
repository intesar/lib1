<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>ALT CSO Admin Console</title>

        <!--[if lt IE 9]>
                <script src="js/html5.js"></script>
                <script src="js/IE9.js"></script>
                <![endif]-->

        <link rel="stylesheet" href="css/html5reset.css" type="text/css" />

        <style type="text/css"></style>
        <link rel="stylesheet" href="./css/overcast/jquery-ui-1.8.13.custom.css">
        <style type="text/css" title="currentStyle">
            @import "./css/demo_page.css";
            @import "./css/demo_table.css";
        </style>
        <link rel="Stylesheet" href="css/toolStyle.css" />
        <script type="text/javascript" language="javascript" src="./js/jquery-1.5.2.min.js"></script>
        <script type="text/javascript" language="javascript" src="./js/jquery.dataTables.js"></script>
        <script type="text/JavaScript" language="javascript" src="./js/tool.js"></script>
        <script type="text/javascript" language="javascript" src="./js/jquery-ui-1.8.13.custom.min.js"></script>
        <!-- script src="./js/jquery-ui-1.8.13.custom.min.js"></script -->
        <!-- script type="text/javascript" language="javascript" src="data.js"></script -->
        <script type="text/javascript" charset="utf-8">
            $(document).ready(function() {
	
                $('#requestDataTable').dataTable( {	
                    "bFilter": false,
                    "sScrollY": "260px",
                    "aLengthMenu": [10, 20, 40],
                    "iDisplayLength": 10
                } );	
	
                $('#queueInfoDataTable').dataTable( {		
                    "bFilter": false,
                    "sScrollY": "410px",
                    "aLengthMenu": [25, 50, 100],
                    "iDisplayLength": 25
                } );
	
                $( ".datepicker" ).datepicker({
                    showOn: "button",	
                    buttonImage: "images/calendar.gif",			
                    buttonImageOnly: true
                });
                $("#help").click(function() {
                    $("#dialog").dialog();
                });
	
            });
        </script>
    </head>
    <body>
        <header>
            <div class="logoimg"></div>
            <h1>ALT CSO Admin Console</h1>
            <div id="help"></div>
        </header>
        <section id="main">
            <ul id="tab">
                <li class="select">Manage CSO Customers</li>
                <li>Manage CSO Profiles</li>
                <li>Manage Admin Users</li>
                <li>Translation Reports</li>
                <li>Queue Information</li>
            </ul>
            <div id="tabPanel"> 
                <!-- tab panel 1 =================================================================== -->
                <div class="content_wrap">
                    <h1>&nbsp;</h1>
                    <div class="pl-00" style="height:30px;">
                        <div class="sectionTitle" style="width:25%;">Search customer name&nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <input type="search" name="q" style="width:200px;">
                        </div>
                        <div class="pl-50 alignL">
                            <button>Go</button>
                        </div>
                    </div>
                    <div class="pl-00" style="height:100px; ">
                        <div class="sectionTitle" style="width:25%;">Search results&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL boxBorder" style="width:25%;height:100%; overflow-y:scroll" overflow-x;hidden;>
                             <div style="margin:3px;">
                                <div class="clickable">telepresence marketing</div>
                                <div class="clickable">vtg</div>
                                <div class="clickable">webex</div>
                                <div class="clickable">ic capture</div>
                                <div class="clickable">aaa</div>
                                <div class="clickable">bbb</div>
                                <div class="clickable">ccc</div>
                                <div class="clickable">ddd</div>
                                <div class="clickable">eee</div>
                                <div class="clickable">fff</div>
                            </div>  
                        </div>
                    </div>
                    <div class="pl-00" style="margin-top:10px;">
                        <div class="sectionTitle" style="width:25%;">Customer ID&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">000321</div>
                        </div>
                        <div class="pl-50" style="width:20%;height:100%;">
                            <div>Date created:&nbsp;&nbsp;</div>
                        </div>
                        <div class="pl-60 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">5/12/2011</div>
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Customer Name&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" name="customerID" width="210" />
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Appkey&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">12345</div>
                        </div>
                        <div class="pl-50 alignL">
                            <button>Generate</button>
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Expiration date&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" class="datepicker" style="margin-right:5px;">
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Maximum Priority&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" name="customerID" width="210" />
                        </div>
                        <div class="pl-50 alignL">
                            <button>Save</button>
                        </div>
                        <div class="pl-60 alignL">
                            <button>Cancel</button>
                        </div>
                        <div class="pl-70 alignL">
                            <button>Delete</button>
                        </div>
                    </div>

                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Generate TMX
                            &nbsp;&nbsp;</div>
                        <div class="pl-25 alignL">
                            <input type="radio" name="gtmx" value="yes" checked="checked">
                            Yes
                            <input type="radio" name="gtmx" value="no">
                            No </div>
                    </div>

                    <div class="section" id="csoProfilesSection">

                        <h2 style="margin:5px 20px;font-size:16px;">CSO Profiles</h2>

                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">ENES&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">ENFR&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">ENJP&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">ENPT&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">ENZH&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>default</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">ESEN&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">FREN&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">JPEN&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00">
                            <div class="sectionTitle" style="width:25%;">PTEN&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>CSO profilename 5</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                        <div class="pl-00" style="margin-bottom:7px;">
                            <div class="sectionTitle" style="width:25%;">ZHEN&nbsp;&nbsp; </div>
                            <div class="pl-25 alignL">
                                <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                    <option value="profile-1">CSO profilename 1</option>
                                    <option value="profile-2">CSO profilename 2</option>
                                    <option value="profile-3">CSO profilename 3</option>
                                    <option value="profile-4">CSO profilename 4</option>
                                    <option value="profile-5" selected>default</option>
                                    <option value="profile-6" style="width:110px">CSO profilename 6</option>
                                </select>
                            </div>
                            <div class="pl-50 alignL">
                                <div class="itemValue">mt engine profile name</div>
                            </div>
                        </div>
                    </div><!-- /csoProfilesSection -->
                </div>
                <!-- /div tab panel 1 ============================================================== --> 
                <!-- tab panel 2 =================================================================== -->

                <div class="content_wrap">
                    <h1>&nbsp;</h1>
                    <div class="pl-00" style="height:30px;">
                        <div class="sectionTitle" style="width:25%;">Search profile name
                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <input type="search" name="q" style="width:200px;">
                        </div>          
                        <div class="pl-50 alignL">
                            <button>Go</button>
                        </div>
                        <div class="pl-60 alignL" style="width:50%;">
                            <button style="white-space: nowrap;width:160px;">Update Profile Mapping</button>
                        </div>
                    </div>
                    <div class="pl-00" style="height:160px; ">
                        <div class="sectionTitle" style="width:25%;">Search results&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL boxBorder" style="width:50%;height:100%;"></div>
                    </div>
                    <div class="pl-00" style="margin-top:7px;">
                        <div class="sectionTitle" style="width:25%;">Profile name
                            &nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" name="customerID" />
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Default
                            &nbsp;&nbsp;</div>
                        <div class="pl-25 alignL">
                            <input type="radio" name="hyouka" value="Yes">
                            Yes
                            <input type="radio" name="hyouka" value="No" checked="checked">
                            No </div>
                    </div>
                    <div class="pl-00" style="margin-top:7px;">
                        <div class="sectionTitle" style="width:25%;">Customer name
                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                <option value="profile-1">profile-1</option>
                                <option value="profile-2">profile-2</option>
                                <option value="profile-3">profile-3</option>
                                <option value="profile-4">profile-4</option>
                                <option value="profile-5" selected>profile-5</option>
                                <option value="profile-6" style="width:110px">profile-6</option>
                            </select>
                        </div>
                    </div>
                    <div class="pl-00" style="margin-top:7px;">
                        <div class="sectionTitle" style="width:25%;">Translation engine URL
                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                <option value="profile-1">profile-1</option>
                                <option value="profile-2">profile-2</option>
                                <option value="profile-3">profile-3</option>
                                <option value="profile-4">profile-4</option>
                                <option value="profile-5" selected>profile-5</option>
                                <option value="profile-6" style="width:110px">profile-6</option>
                            </select>
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Translation engine profile name
                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                <option value="profile-1">profile-1</option>
                                <option value="profile-2">profile-2</option>
                                <option value="profile-3">profile-3</option>
                                <option value="profile-4">profile-4</option>
                                <option value="profile-5" selected>profile-5</option>
                                <option value="profile-6" style="width:110px">profile-6</option>
                            </select>
                        </div>
                    </div>
                    <div class="pl-00" style="margin-top:7px;">
                        <div class="sectionTitle" style="width:25%;">Translation engine profile ID

                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                <option value="profile-1">profile-1</option>
                                <option value="profile-2">profile-2</option>
                                <option value="profile-3">profile-3</option>
                                <option value="profile-4">profile-4</option>
                                <option value="profile-5" selected>profile-5</option>
                                <option value="profile-6" style="width:110px">profile-6</option>
                            </select>
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Language Pair 

                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <select id="Selectprofile" name="Selectprofile" style="width:200px">
                                <option value="profile-1">profile-1</option>
                                <option value="profile-2">profile-2</option>
                                <option value="profile-3">profile-3</option>
                                <option value="profile-4">profile-4</option>
                                <option value="profile-5" selected>profile-5</option>
                                <option value="profile-6" style="width:110px">profile-6</option>
                            </select>
                        </div>
                        <div class="pl-50 alignL"> </div>
                        <div class="pl-60 alignL">
                            <button>Save</button>
                        </div>
                        <div class="pl-70 alignL">
                            <button>Delete</button>
                        </div>
                    </div>
                    </form>
                </div>
                <!-- /tab panel 2 ================================================================== --> 
                <!-- tab panel 3 =================================================================== -->

                <div class="content_wrap">
                    <h1>&nbsp;</h1>
                    <div class="pl-00" style="height:30px;">
                        <div class="sectionTitle" style="width:25%;">Search user&nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <input type="search" name="q" size="28" />
                        </div>
                        <div class="pl-50 alignL">
                            <button>Go</button>
                        </div>
                    </div>
                    <div class="pl-00" style="height:160px;">
                        <div class="sectionTitle" style="width:25%;">Search results&nbsp;&nbsp;</div><div class="pl-25 alignL boxBorder" style="width:25%;height:100%; overflow-y:scroll" overflow-x;hidden;>
                                                                                                          <div style="margin:3px;">
                                <div class="clickable">Ambika Balakrishnan</div>
                                <div class="clickable"><span style="color: #930;">Carla Camargo</span></div>
                                <div class="clickable">Kenji Oka</div>
                            </div>  
                        </div>
                    </div>
                    <div class="pl-00" style="margin-top:50px;">
                        <div class="sectionTitle" style="width:25%;">CEC ID&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" name="customerID" size="28" value="ccamargo" />
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">First name
                            &nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" name="customerID" size="28" value="Carla"/>
                        </div>
                    </div>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Last name
                            &nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <input type="text" name="customerID" size="28" value="Camargo"/>
                        </div>
                    </div>
                    <div class="pl-00" style="position:absolute;top:70%;">
                        <div class="pl-25 alignL" style="left:25%;">
                            <button>Save</button>
                        </div>
                        <div class="pl alignL" style="left:35%;">
                            <button>Delete</button>
                        </div>
                        <div class="pl alignL" style="left:45%;">
                            <button>Cancel</button>
                        </div>
                    </div>
                </div>
                <!-- /tab panel 3 ================================================================== --> 
                <!-- tab panel 4 =================================================================== -->

                <div class="content_wrap">
                    <h1>&nbsp;</h1>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;height:100%;">Date &nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;"> from
                            <input type="text" class="datepicker" style="margin-right:5px;">
                        </div>
                        <div class="pl-50 alignL" style="width:25%;height:100%;">
                            to &nbsp;&nbsp;<input type="text" class="datepicker" style="margin-right:5px;">
                        </div>
                    </div>
                    <div class="pl-00" style="height:30px;">
                        <div class="sectionTitle" style="width:25%;">Customer Name
                            &nbsp;&nbsp; </div>
                        <div class="pl-25 alignL">
                            <select style="width:200px">
                                <option value="Customer-1">Customer-1</option>
                                <option value="Customer-2">Customer-2</option>
                                <option value="Customer-3">Customer-3</option>
                                <option value="Customer-4">Customer-4</option>
                                <option value="Customer-5" selected>Customer-5</option>
                                <option value="Customer-6" style="width:110px">Customer-6</option>
                            </select>
                        </div>
                    </div>
                    <div class="pl-00" style="height:16px; ">
                        <div class="sectionTitle" style="width:25%;">Summary&nbsp;&nbsp;</div>
                        <div class="pl-25 itemTitle" style="width:25%;height:100%;">Number of requests processed:&nbsp;&nbsp;</div>
                        <div class="pl-50 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">1234</div>
                        </div>
                    </div>
                    <div class="pl-00" style="height:16px; ">
                        <div class="pl-25 itemTitle" style="width:25%;height:100%;">Average length of time:&nbsp;&nbsp;</div>
                        <div class="pl-50 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">12:34:56</div>
                        </div>
                    </div>
                    <div class="pl-00" style="height:16px; ">
                        <div class="pl-25 itemTitle" style="width:25%;height:100%;">Average length of time in queue:&nbsp;&nbsp;</div>
                        <div class="pl-50 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">12:34:56</div>
                        </div>
                    </div>
                    <div class="pl-00" style="height:16px; ">
                        <div class="pl-25 itemTitle" style="width:25%;height:100%;">Average size of request:&nbsp;&nbsp;</div>
                        <div class="pl-50 alignL" style="width:25%;height:100%;">
                            <div class="itemValue">1234 words</div>
                        </div>
                    </div>
                    <div class="pl-00" style="height:360px; margin-top:20px;">
                        <div class="sectionTitle" style="width:25%;">Details&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:600px;height:100%;">
                            <table style="margin:5px 0" class="display dataTable" id="requestDataTable" cellpadding="0" cellspacing="0" border="0" bordercolor="#333399" width="100%">
                                <thead>
                                    <tr>
                                        <th><div style="width:60px;white-space:nowrap;">Request</div></th>
                                <th><div style="width:138px;white-space:nowrap;">Customer Name</div></th>
                                <th><div style="width:58px;white-space:nowrap;">Job size</div></th>
                                <th><div style="width:100px;white-space:nowrap;">Finished</div></th>
                                <th><div style="width:100px;white-space:nowrap;">Transaction ID</div></th>
                                </tr>
                                </thead>
                                <tbody>
                                    <tr><td style="width:60px;">5/17/2011</td><td style="width:150px;">WebEx ABC</a></td><td style="width:62px;">500KB</td><td style="width:102px;">	5/17/2011 12:01	</td><td style="width:100px;">	122330	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/18/2011 12:01	</td><td>	122331	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/19/2011 12:01	</td><td>	122331	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/20/2011 12:01	</td><td>	122331	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/21/2011 12:01	</td><td>	122331	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/22/2011 12:01	</td><td>	122331	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/23/2011 12:01	</td><td>	122332	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/24/2011 12:01	</td><td>	122333	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/25/2011 12:01	</td><td>	122334	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/26/2011 12:01	</td><td>	122335	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/27/2011 12:01	</td><td>	122336	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/28/2011 12:01	</td><td>	122337	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/29/2011 12:01	</td><td>	122338	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/30/2011 12:01	</td><td>	122339	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	5/31/2011 12:01	</td><td>	122340	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/1/2011 12:01	</td><td>	122341	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/2/2011 12:01	</td><td>	122342	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/3/2011 12:01	</td><td>	122343	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/4/2011 12:01	</td><td>	122344	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/5/2011 12:01	</td><td>	122345	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/6/2011 12:01	</td><td>	122346	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/7/2011 12:01	</td><td>	122347	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/8/2011 12:01	</td><td>	122348	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/9/2011 12:01	</td><td>	122349	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/10/2011 12:01	</td><td>	122350	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/11/2011 12:01	</td><td>	122351	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/12/2011 12:01	</td><td>	122352	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/13/2011 12:01	</td><td>	122353	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/14/2011 12:01	</td><td>	122354	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/15/2011 12:01	</td><td>	122355	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/16/2011 12:01	</td><td>	122356	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/17/2011 12:01	</td><td>	122357	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/18/2011 12:01	</td><td>	122358	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/19/2011 12:01	</td><td>	122359	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/20/2011 12:01	</td><td>	122360	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/21/2011 12:01	</td><td>	122361	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/22/2011 12:01	</td><td>	122362	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/23/2011 12:01	</td><td>	122363	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/24/2011 12:01	</td><td>	122364	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/25/2011 12:01	</td><td>	122365	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/26/2011 12:01	</td><td>	122366	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/27/2011 12:01	</td><td>	122367	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/28/2011 12:01	</td><td>	122368	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/29/2011 12:01	</td><td>	122369	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	6/30/2011 12:01	</td><td>	122370	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	7/1/2011 12:01	</td><td>	122371	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	7/2/2011 12:01	</td><td>	122372	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	7/3/2011 12:01	</td><td>	122373	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	7/4/2011 12:01	</td><td>	122374	</td></tr>
                                    <tr><td>5/17/2011</td><td>WebEx ABC</a></td><td>500KB</td><td>	7/5/2011 12:01	</td><td>	122375	</td></tr>


                                </tbody>
                            </table>
                        </div>
                    </div>
                    <div class="pl-00" style="position:absolute; top:515px; height:16px; ">
                        <div class="pl alignL" style="left:70%;">
                            <button>Export</button>
                        </div>
                        <div class="pl alignL" style="left:80%;">
                            <button>Clear</button>
                        </div>
                    </div>
                </div>
                <!-- /tab panel 4 ================================================================== --> 
                <!-- tab panel 5 =================================================================== -->

                <div class="content_wrap">
                    <h1>&nbsp;</h1>
                    <div class="pl-00">
                        <div class="sectionTitle" style="width:25%;">Current jobs in queue&nbsp;&nbsp;</div>
                        <div class="pl-25 alignL" style="width:25%;height:100%;">
                            <button>Refresh</button>
                        </div>
                    </div>
                    <div class="pl-00" style="height:auto;margin-top:5px;">
                        <div class="pl-25 alignL" style="width:600px;height:380px;">
                            <table style="margin:5px 0" class="display dataTable" id="queueInfoDataTable" cellpadding="0" cellspacing="0" border="0" bordercolor="#333399" width="600px;" >

                                <thead>
                                    <tr>
                                        <th><div style="width:100px;white-space:nowrap;">Transaction ID</div></th>
                                <th><div style="width:192px;white-space:nowrap;">Customer Name</div></th>
                                <th><div style="width:62px;white-space:nowrap;">Size</div></th>
                                <th><div style="width:122px;white-space:nowrap;">Date/Time Received</div></th>
                                </tr>
                                </thead>
                                <tbody>

                                    <tr><td style="width:100px;">	1201	</td><td style="width:192px;">WebEx</td><td style="width:62px;">1MB</td><td style="width:122px;">4/20/2011 0:13</td></tr>
                                    <tr><td>	1202	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1203	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1204	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1205	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1206	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1207	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1208	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1209	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1210	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1211	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1212	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1213	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1214	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1215	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1216	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1217	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1218	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1219	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1220	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1221	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1222	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1223	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1224	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1225	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1226	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1227	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1228	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1229	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1230	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1231	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1232	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1233	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1234	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1235	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1236	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1237	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1238	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1239	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1240	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1241	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1242	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1243	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1244	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1245	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1246	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1247	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1248	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1249	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1250	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1251	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1252	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1253	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1254	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1255	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1256	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1257	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1258	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1259	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>
                                    <tr><td>	1260	</td><td>WebEx</td><td>1MB</td><td>4/20/2011 0:13</td></tr>


                                </tbody>
                            </table>
                            <!-- /hidden data ========================== --> 
                        </div>
                    </div>
                </div>
            </div>
            <!-- /tab panel 5 ================================================================== -->
        </div>
    </section>
    <footer>
        <div id="footerNav">
            <nav>
                <ul>
                    <li><a href="">How To</a></li>
                    <li><a href="">ABCD Tool</a></li>
                    <li><a href="logout.jsp">Logout</a></li>
                </ul>
            </nav>
            <address>
                <a href="mailto:ccamargo@cisco.com">Contact Us</a>
            </address>
        </div>
        <p id="copyright">Copyright &copy; 2011 Cisco Systems, Inc. Cisco Confidential</p>
    </footer>

    <div id="dialog" title="  ALT CSO Admin Console - quick help" style="display: none;padding:10px;">

        <ul>

            <li>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed

                <ul>

                    <li>do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip </li>

                    <li>ex ea commodo consequat. Duis aute irure dolor in reprehenderit in </li>

                    <li>voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur </li>

                    <li>sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</li>

                </ul>

            </li>

            <li>Lorem ipsum dolor sit amet, </li>

            <li>consectetur adipisicing elit, sed</li>

        </ul>

        <p>&nbsp;</p>

    </div>

</body>
</html>
