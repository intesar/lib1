<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:ui="http://www.sun.com/web/ui">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <ui:page binding="#{Staff.page1}" id="page1">
            <ui:html binding="#{Staff.html1}" id="html1">
                <ui:head binding="#{Staff.head1}" id="head1">
                    <ui:link binding="#{Staff.link1}" id="link1" url="/resources/stylesheet.css"/>
                </ui:head>
                <ui:body binding="#{Staff.body1}" id="body1" style="-rave-layout: grid">
                    <ui:form binding="#{Staff.form1}" id="form1">
                        <ui:tabSet binding="#{Staff.tabSet1}" id="tabSet1" lite="true" mini="true" selected="itemGroups" style="height: 526px; left: 96px; top: 0px; position: absolute; width: 838px; z-index: 500">
                            <ui:tab action="#{Staff.itemGroups_action}" binding="#{Staff.itemGroups}" id="itemGroups" text="Item Group">
                                <ui:panelLayout binding="#{Staff.layoutPanel13}" id="layoutPanel13" style="height: 526px; position: relative; width: 877px; -rave-layout: grid">
                                    <ui:label binding="#{Staff.label77}" id="label77" style="left: 24px; top: 96px; position: absolute" text="Group Name"/>
                                    <ui:label binding="#{Staff.label78}" id="label78" style="left: 24px; top: 144px; position: absolute" text="Description"/>
                                    <ui:label binding="#{Staff.label79}" id="label79" style="left: 24px; top: 192px; position: absolute" text="Issue Days"/>
                                    <ui:textField binding="#{Staff._possibleRenews}" converter="#{Staff.integerConverter2}" id="_possibleRenews" style="left: 120px; top: 240px; position: absolute; width: 120px"/>
                                    <ui:label binding="#{Staff.label80}" id="label80" style="left: 0px; top: 240px; position: absolute" text="Possible Renews"/>
                                    <ui:textField binding="#{Staff.textField46}" id="textField46" style="left: 120px; top: 24px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff._groupName}" id="_groupName" style="left: 120px; top: 96px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff._description1}" id="_description1" style="left: 120px; top: 144px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff._issueDays}" converter="#{Staff.integerConverter1}" id="_issueDays" style="left: 120px; top: 192px; position: absolute; width: 120px"/>
                                    <ui:dropDown binding="#{Staff.dropDown11}" id="dropDown11" items="#{Staff.dropDown11DefaultOptions.options}" style="left: 24px; top: 24px; position: absolute; width: 72px"/>
                                    <ui:listbox binding="#{Staff.listbox8}" id="listbox8" items="#{Staff.listbox8DefaultOptions.options}" style="height: 220px; left: 288px; top: 48px; position: absolute; width: 144px"/>
                                    <ui:button action="#{Staff.button1_action}" binding="#{Staff.button1}" id="button1"
                                        style="left: 215px; top: 312px; position: absolute; width: 71px" text="Submit"/>
                                    <ui:button action="#{Staff.button2_action}" binding="#{Staff.button2}" id="button2"
                                        style="left: -1px; top: 312px; position: absolute; width: 86px" text="Refresh"/>
                                    <ui:button binding="#{Staff.button4}" id="button4" style="left: 311px; top: 312px; position: absolute; width: 72px" text="Refresh"/>
                                    <ui:button action="#{Staff.button9_action}" binding="#{Staff.button9}" id="button9"
                                        style="left: 95px; top: 312px; position: absolute; width: 96px" text="Update"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab action="#{Staff.users_action}" binding="#{Staff.users}" id="users" text="Users">
                                <ui:panelLayout binding="#{Staff.layoutPanel6}" id="layoutPanel6" style="height: 590px; position: relative; width: 694px; -rave-layout: grid">
                                    <ui:label binding="#{Staff.label27}" id="label27" style="left: 24px; top: 120px; position: absolute" text="Password"/>
                                    <ui:label binding="#{Staff.label28}" id="label28" style="left: 24px; top: 144px; position: absolute" text="Confirm Password"/>
                                    <ui:label binding="#{Staff.label29}" id="label29" style="left: 360px; top: 144px; position: absolute" text="Sex"/>
                                    <ui:label binding="#{Staff.label30}" id="label30" style="height: 24px; left: 360px; top: 120px; position: absolute" text="Father Name"/>
                                    <ui:label binding="#{Staff.label31}" id="label31" style="left: 360px; top: 72px; position: absolute" text="Middle Name"/>
                                    <ui:label binding="#{Staff.label32}" id="label32" style="left: 72px; top: 216px; position: absolute" text="Type"/>
                                    <ui:label binding="#{Staff.label33}" id="label33" style="left: 360px; top: 192px; position: absolute" text="DOB"/>
                                    <ui:label binding="#{Staff.label34}" id="label34" style="left: 360px; top: 168px; position: absolute" text="Email"/>
                                    <ui:label binding="#{Staff.label36}" id="label36" style="left: 72px; top: 240px; position: absolute" text="Title"/>
                                    <ui:label binding="#{Staff.label37}" id="label37" style="left: 360px; top: 96px; position: absolute" text="Last Name"/>
                                    <ui:label binding="#{Staff.label38}" id="label38" style="left: 72px; top: 264px; position: absolute" text="Group Name"/>
                                    <ui:label binding="#{Staff.label39}" id="label39" style="left: 72px; top: 288px; position: absolute" text="ID"/>
                                    <ui:label binding="#{Staff.label40}" id="label40" style="left: 360px; top: 48px; position: absolute" text="First Name"/>
                                    <ui:label binding="#{Staff.label41}" id="label41" style="left: 24px; top: 96px; position: absolute" text="User Name"/>
                                    <ui:label binding="#{Staff.label42}" id="label42" style="left: 72px; top: 336px; position: absolute" text="Department"/>
                                    <ui:label binding="#{Staff.label43}" id="label43" style="left: 72px; top: 312px; position: absolute" text="Status"/>
                                    <ui:textField binding="#{Staff.textField14}" id="textField14" style="left: 144px; top: 96px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField15}" id="textField15" style="left: 144px; top: 120px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField16}" id="textField16" style="left: 144px; top: 144px; position: absolute; width: 120px"/>
                                    <ui:dropDown binding="#{Staff.dropDown4}" id="dropDown4" items="#{Staff.dropDown4DefaultOptions.options}" style="left: 168px; top: 264px; position: absolute"/>
                                    <ui:dropDown binding="#{Staff.dropDown5}" id="dropDown5" items="#{Staff.dropDown5DefaultOptions.options}" style="left: 456px; top: 144px; position: absolute"/>
                                    <ui:dropDown binding="#{Staff.dropDown7}" id="dropDown7" items="#{Staff.dropDown7DefaultOptions.options}" style="left: 168px; top: 216px; position: absolute; width: 120px"/>
                                    <ui:dropDown binding="#{Staff.dropDown8}" id="dropDown8" items="#{Staff.dropDown8DefaultOptions.options}" style="left: 168px; top: 312px; position: absolute"/>
                                    <ui:dropDown binding="#{Staff.dropDown9}" id="dropDown9" items="#{Staff.dropDown9DefaultOptions.options}" style="left: 168px; top: 336px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField17}" id="textField17" style="left: 456px; top: 72px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField18}" id="textField18" style="left: 456px; top: 48px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField19}" id="textField19" style="left: 456px; top: 96px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField20}" id="textField20" style="left: 456px; top: 120px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField21}" id="textField21" style="left: 456px; top: 168px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField22}" id="textField22" style="left: 168px; top: 240px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField23}" id="textField23" style="left: 168px; top: 288px; position: absolute; width: 120px"/>
                                    <ui:calendar binding="#{Staff.calendar2}" columns="10" id="calendar2" style="left: 456px; top: 192px; position: absolute"/>
                                    <ui:dropDown binding="#{Staff.dropDown6}" id="dropDown6" items="#{Staff.dropDown6DefaultOptions.options}" style="left: 24px; top: 48px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField24}" id="textField24" style="left: 96px; top: 48px; position: absolute; width: 120px"/>
                                    <ui:button binding="#{Staff.button20}" id="button20" style="left: 239px; top: 48px; position: absolute; width: 60px" text="Search"/>
                                    <ui:listbox binding="#{Staff.listbox3}" id="listbox3" items="#{Staff.listbox3DefaultOptions.options}" style="height: 218px; left: 384px; top: 264px; position: absolute; width: 168px"/>
                                    <ui:button binding="#{Staff.button29}" id="button29" style="left: 239px; top: 504px; position: absolute; width: 120px" text="Update Status"/>
                                    <ui:button binding="#{Staff.button30}" id="button30" style="left: 551px; top: 504px; position: absolute; width: 96px" text="Clear All"/>
                                    <ui:button binding="#{Staff.button31}" id="button31" style="left: 383px; top: 504px; position: absolute; width: 134px" text="Reset Password"/>
                                    <ui:button binding="#{Staff.button32}" id="button32" style="left: 455px; top: 552px; position: absolute; width: 78px" text="Phone"/>
                                    <ui:button binding="#{Staff.button33}" id="button33" style="left: 311px; top: 552px; position: absolute; width: 88px" text="Address"/>
                                    <ui:button binding="#{Staff.button34}" id="button34" style="left: 167px; top: 552px; position: absolute; width: 75px" text="Save"/>
                                    <ui:button binding="#{Staff.button35}" id="button35" style="left: 119px; top: 504px; position: absolute; width: 72px" text="Update "/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab action="#{Staff.addItem_action}" binding="#{Staff.addItem}" id="addItem" text="AddItem">
                                <ui:panelLayout binding="#{Staff.layoutPanel1}" id="layoutPanel1" style="background-color: #cc99ff; background-image: url( ); height: 464px; position: relative; width: 743px; -rave-layout: grid">
                                    <ui:dropDown binding="#{Staff.dropDown1}" id="dropDown1" items="#{Staff.dropDown1DefaultOptions.options}" style="border-width: 3px; border-style: ridge; left: 24px; top: 48px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff.textField1}" id="textField1" style="border-width: 3px; border-style: ridge; left: 24px; top: 96px; position: absolute; text-decoration: underline; width: 144px"/>
                                    <ui:button binding="#{Staff._search}" id="_search" style="left: 191px; top: 96px; position: absolute; width: 71px" text="search"/>
                                    <ui:listbox binding="#{Staff.listbox1}" id="listbox1" items="#{Staff.listbox1DefaultOptions.options}" style="border-width: 3px; border-style: ridge; height: 266px; left: 24px; top: 144px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff.textField2}" id="textField2" style="border-width: 3px; border-style: ridge; left: 480px; top: 48px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField3}" id="textField3" style="border-width: 3px; border-style: ridge; left: 480px; top: 192px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField4}" id="textField4" style="border-width: 3px; border-style: ridge; left: 480px; top: 168px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField5}" id="textField5" style="left: 480px; top: 264px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField6}" id="textField6" style="left: 480px; top: 288px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField7}" id="textField7" style="left: 480px; top: 240px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField9}" id="textField9" style="border-width: 3px; border-style: ridge; left: 480px; top: 192px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField10}" id="textField10" style="border-width: 3px; border-style: ridge; left: 480px; top: 72px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField11}" id="textField11" style="border-width: 3px; border-style: ridge; left: 480px; top: 144px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField12}" id="textField12" style="left: 480px; top: 312px; position: absolute"/>
                                    <ui:textField binding="#{Staff.textField8}" id="textField8" style="left: 480px; top: 336px; position: absolute"/>
                                    <ui:dropDown binding="#{Staff.dropDown2}" id="dropDown2" items="#{Staff.dropDown2DefaultOptions.options}" style="left: 480px; top: 96px; position: absolute; width: 216px"/>
                                    <ui:dropDown binding="#{Staff.dropDown3}" id="dropDown3" items="#{Staff.dropDown3DefaultOptions.options}" style="left: 480px; top: 120px; position: absolute; width: 216px"/>
                                    <ui:button binding="#{Staff._enable}" id="_enable" style="left: 239px; top: 432px; position: absolute; width: 72px" text="Enable"/>
                                    <ui:button binding="#{Staff.button3}" id="button3" style="left: 431px; top: 432px; position: absolute; width: 71px" text="Save"/>
                                    <ui:button binding="#{Staff._clearall}" id="_clearall" style="left: 335px; top: 432px; position: absolute; width: 71px" text="Update"/>
                                    <ui:button binding="#{Staff.button5}" id="button5" style="left: 527px; top: 432px; position: absolute; width: 71px" text="Clear Id"/>
                                    <ui:button binding="#{Staff._disable}" id="_disable" style="left: 143px; top: 432px; position: absolute; width: 71px" text="Disable"/>
                                    <ui:button binding="#{Staff.button7}" id="button7" style="left: 623px; top: 432px; position: absolute; width: 71px" text="Clear All"/>
                                    <ui:label binding="#{Staff._title}" id="_title" requiredIndicator="true" style="left: 384px; top: 72px; position: absolute" text="Title"/>
                                    <ui:label binding="#{Staff._type}" id="_type" requiredIndicator="true" style="left: 384px; top: 96px; position: absolute" text="Type"/>
                                    <ui:label binding="#{Staff._group}" id="_group" requiredIndicator="true" style="left: 384px; top: 120px; position: absolute" text="Group"/>
                                    <ui:label binding="#{Staff._description}" id="_description" style="left: 384px; top: 144px; position: absolute" text="Description"/>
                                    <ui:label binding="#{Staff._isbn}" id="_isbn" style="left: 384px; top: 168px; position: absolute" text="ISBN"/>
                                    <ui:label binding="#{Staff._edition}" id="_edition" style="left: 384px; top: 192px; position: absolute" text="Edition"/>
                                    <ui:label binding="#{Staff._status}" id="_status" style="left: 384px; top: 216px; position: absolute" text="Status"/>
                                    <ui:label binding="#{Staff._availability}" id="_availability" style="left: 384px; top: 240px; position: absolute" text="Availability"/>
                                    <ui:label binding="#{Staff._authors}" id="_authors" style="left: 384px; top: 288px; position: absolute" text="Authors"/>
                                    <ui:label binding="#{Staff._location}" id="_location" style="left: 384px; top: 264px; position: absolute" text="Location"/>
                                    <ui:label binding="#{Staff._cost}" id="_cost" style="left: 384px; top: 312px; position: absolute" text="Cost"/>
                                    <ui:label binding="#{Staff._publisher}" id="_publisher" style="left: 384px; top: 336px; position: absolute" text="Publisher"/>
                                    <ui:label binding="#{Staff._yearofpublish}" id="_yearofpublish" style="left: 384px; top: 360px; position: absolute" text="Year of Publish"/>
                                    <ui:calendar binding="#{Staff.calendar1}" id="calendar1" style="left: 480px; top: 360px; position: absolute"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab binding="#{Staff.departments}" id="departments" text="Department">
                                <ui:panelLayout binding="#{Staff.layoutPanel8}" id="layoutPanel8" style="height: 516px; width: 100%">
                                    <ui:label binding="#{Staff.label45}" id="label45" requiredIndicator="true" style="left: 48px; top: 24px; position: absolute" text="Department Name"/>
                                    <ui:textField binding="#{Staff.textField25}" id="textField25" style="left: 336px; top: 120px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField26}" id="textField26" style="left: 336px; top: 96px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField27}" id="textField27" style="left: 192px; top: 24px; position: absolute; width: 120px"/>
                                    <ui:label binding="#{Staff.label48}" id="label48" requiredIndicator="true"
                                        style="left: 216px; top: 96px; position: absolute" text="Department Name"/>
                                    <ui:label binding="#{Staff.label55}" id="label55" requiredIndicator="true"
                                        style="left: 216px; top: 120px; position: absolute" text="Description"/>
                                    <ui:listbox binding="#{Staff.listbox4}" id="listbox4" items="#{Staff.listbox4DefaultOptions.options}" style="height: 120px; left: 24px; top: 72px; position: absolute; width: 127px"/>
                                    <ui:button binding="#{Staff.button41}" id="button41" style="left: 335px; top: 24px; position: absolute; width: 72px" text="Button"/>
                                    <ui:button binding="#{Staff.button42}" id="button42" style="left: 383px; top: 264px; position: absolute; width: 72px" text="Save"/>
                                    <ui:button binding="#{Staff.button43}" id="button43" style="left: 287px; top: 264px; position: absolute; width: 72px" text="Update"/>
                                    <ui:button binding="#{Staff.button44}" id="button44" style="left: 167px; top: 264px; position: absolute; width: 88px" text="Clear All"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab binding="#{Staff.phones}" id="phones" text="Phones">
                                <ui:panelLayout binding="#{Staff.layoutPanel10}" id="layoutPanel10" style="height: 420px; width: 100%">
                                    <ui:label binding="#{Staff.label56}" id="label56" style="left: 72px; top: 72px; position: absolute" text="Username"/>
                                    <ui:label binding="#{Staff.label62}" id="label62" style="left: 360px; top: 144px; position: absolute" text="Type"/>
                                    <ui:label binding="#{Staff.label63}" id="label63" style="left: 360px; top: 192px; position: absolute" text="Number"/>
                                    <ui:label binding="#{Staff.label64}" id="label64" style="left: 360px; top: 240px; position: absolute" text="Date of Creation"/>
                                    <ui:textField binding="#{Staff.textField32}" id="textField32" style="left: 168px; top: 72px; position: absolute; width: 168px"/>
                                    <ui:textField binding="#{Staff.textField33}" id="textField33" style="left: 456px; top: 144px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField34}" id="textField34" style="left: 456px; top: 192px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField35}" id="textField35" style="left: 456px; top: 240px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField36}" id="textField36" style="position: absolute; left: 456px; top: 216px; width: 24px; height: 0px"/>
                                    <ui:button binding="#{Staff.button49}" id="button49" style="left: 359px; top: 72px; position: absolute; width: 72px" text="Search"/>
                                    <ui:listbox binding="#{Staff.listbox5}" id="listbox5" items="#{Staff.listbox5DefaultOptions.options}" style="left: 168px; top: 120px; position: absolute; width: 168px"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab binding="#{Staff.userGroups}" id="userGroups" text="User Goups">
                                <ui:panelLayout binding="#{Staff.layoutPanel12}" id="layoutPanel12" style="height: 468px; position: relative; width: 829px; -rave-layout: grid">
                                    <ui:label binding="#{Staff.label71}" id="label71" style="left: 24px; top: 48px; position: absolute" text="Group Name"/>
                                    <ui:textField binding="#{Staff.textField41}" id="textField41" style="left: 120px; top: 96px; position: absolute; width: 120px"/>
                                    <ui:label binding="#{Staff.label73}" id="label73" style="left: 0px; top: 192px; position: absolute" text="Max Items Allowed"/>
                                    <ui:label binding="#{Staff.label74}" id="label74" style="left: 24px; top: 240px; position: absolute" text="Last Updated"/>
                                    <ui:label binding="#{Staff.label75}" id="label75" style="left: 24px; top: 144px; position: absolute" text="Description"/>
                                    <ui:textField binding="#{Staff.textField42}" id="textField42" style="left: 120px; top: 144px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField43}" id="textField43" style="left: 120px; top: 192px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField44}" id="textField44" style="left: 120px; top: 240px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField45}" id="textField45" style="left: 120px; top: 48px; position: absolute; width: 120px"/>
                                    <ui:label binding="#{Staff.label76}" id="label76" style="left: 24px; top: 96px; position: absolute" text="Group Name"/>
                                    <ui:listbox binding="#{Staff.listbox7}" id="listbox7" items="#{Staff.listbox7DefaultOptions.options}" style="position: absolute; left: 432px; top: 96px; width: 144px; height: 144px"/>
                                    <ui:button binding="#{Staff.button51}" id="button51" style="left: 480px; top: 48px; position: absolute; width: 71px" text="Home"/>
                                    <ui:button binding="#{Staff.button52}" id="button52" style="left: 455px; top: 432px; position: absolute; width: 72px" text="Save"/>
                                    <ui:button binding="#{Staff.button53}" id="button53" style="left: 311px; top: 432px; position: absolute; width: 72px" text="Update"/>
                                    <ui:button binding="#{Staff.button54}" id="button54" style="left: 167px; top: 432px; position: absolute; width: 72px" text="Clear All"/>
                                    <ui:button binding="#{Staff.button55}" id="button55" style="left: 263px; top: 48px; position: absolute; width: 72px" text="Search"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab binding="#{Staff.loans}" id="loans" text="Loans">
                                <ui:panelLayout binding="#{Staff.layoutPanel11}" id="layoutPanel11" style="height: 468px; width: 100%">
                                    <ui:label binding="#{Staff.label65}" id="label65" style="left: 48px; top: 96px; position: absolute" text="User Name"/>
                                    <ui:label binding="#{Staff.label66}" id="label66" style="left: 48px; top: 144px; position: absolute" text="Item"/>
                                    <ui:label binding="#{Staff.label67}" id="label67" style="left: 48px; top: 192px; position: absolute" text="Issue Date"/>
                                    <ui:label binding="#{Staff.label68}" id="label68" style="left: 48px; top: 240px; position: absolute" text="Due Date"/>
                                    <ui:label binding="#{Staff.label69}" id="label69" style="left: 48px; top: 288px; position: absolute" text="Due Days"/>
                                    <ui:label binding="#{Staff.label70}" id="label70" style="left: 48px; top: 336px; position: absolute" text="Return Date"/>
                                    <ui:textField binding="#{Staff.textField37}" id="textField37" style="left: 144px; top: 96px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField38}" id="textField38" style="left: 144px; top: 144px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField39}" id="textField39" style="left: 144px; top: 288px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff.textField40}" id="textField40" style="left: 240px; top: 24px; position: absolute; width: 120px"/>
                                    <ui:calendar binding="#{Staff.calendar3}" columns="10" id="calendar3" style="left: 144px; top: 192px; position: absolute" validator="#{Staff.calendar3_validate}"/>
                                    <ui:calendar binding="#{Staff.calendar4}" columns="10" id="calendar4" style="left: 144px; top: 240px; position: absolute"/>
                                    <ui:calendar binding="#{Staff.calendar5}" columns="10" id="calendar5" style="left: 144px; top: 336px; position: absolute"/>
                                    <ui:dropDown binding="#{Staff.dropDown10}" id="dropDown10" items="#{Staff.dropDown10DefaultOptions.options}" style="left: 120px; top: 24px; position: absolute"/>
                                    <ui:listbox binding="#{Staff.listbox6}" id="listbox6" items="#{Staff.listbox6DefaultOptions.options}" style="height: 96px; left: 456px; top: 120px; position: absolute; width: 120px"/>
                                    <ui:button binding="#{Staff.button50}" id="button50" style="left: 383px; top: 24px; position: absolute; width: 71px" text="Search"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab action="#{Staff.payment_action}" binding="#{Staff.payment}" id="payment" text="Payment">
                                <ui:panelLayout binding="#{Staff.layoutPanel9}" id="layoutPanel9" style="height: 564px; width: 100%">
                                    <ui:label binding="#{Staff.label57}" id="label57" style="left: 168px; top: 72px; position: absolute" text="Username"/>
                                    <ui:label binding="#{Staff.label58}" id="label58" style="left: 168px; top: 120px; position: absolute" text="Present Fine"/>
                                    <ui:label binding="#{Staff.label59}" id="label59" style="left: 168px; top: 168px; position: absolute" text="Amount"/>
                                    <ui:label binding="#{Staff.label60}" id="label60" style="left: 168px; top: 216px; position: absolute" text="Days Covered"/>
                                    <ui:label binding="#{Staff.label61}" id="label61" style="left: 168px; top: 264px; position: absolute" text="Comment"/>
                                    <ui:button binding="#{Staff.button45}" id="button45" style="left: 263px; top: 384px; position: absolute; width: 72px" text="Save"/>
                                    <ui:button binding="#{Staff.button46}" id="button46" style="left: 383px; top: 384px; position: absolute; width: 72px" text="Clear All"/>
                                    <ui:button binding="#{Staff.button47}" id="button47" style="left: 503px; top: 120px; position: absolute; width: 144px" text="EnForce Remove Hold"/>
                                    <ui:button binding="#{Staff.button48}" id="button48" style="left: 527px; top: 72px; position: absolute; width: 96px" text="Show Fine"/>
                                    <ui:textField binding="#{Staff.textField28}" id="textField28" style="left: 264px; top: 72px; position: absolute; width: 192px"/>
                                    <ui:textField binding="#{Staff.textField29}" id="textField29" style="left: 264px; top: 120px; position: absolute; width: 192px"/>
                                    <ui:textField binding="#{Staff.textField30}" id="textField30" style="left: 264px; top: 168px; position: absolute; width: 192px"/>
                                    <ui:textField binding="#{Staff.textField31}" id="textField31" style="left: 264px; top: 216px; position: absolute; width: 192px"/>
                                    <ui:textArea binding="#{Staff.textArea1}" id="textArea1" style="height: 48px; left: 264px; top: 264px; position: absolute; width: 216px"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab action="#{Staff.address_action}" binding="#{Staff.address}" id="address" text="Addresses">
                                <ui:panelLayout binding="#{Staff.layoutPanel3}" id="layoutPanel3" style="height: 492px; width: 100%">
                                    <ui:label binding="#{Staff.label18}" id="label18" style="left: 0px; top: 48px; position: absolute" text="User Name"/>
                                    <ui:label binding="#{Staff.label19}" id="label19" style="left: 0px; top: 288px; position: absolute" text="City"/>
                                    <ui:label binding="#{Staff.label20}" id="label20" style="left: 0px; top: 336px; position: absolute" text="State"/>
                                    <ui:label binding="#{Staff.label21}" id="label21" style="left: 0px; top: 384px; position: absolute" text="Zipcode"/>
                                    <ui:label binding="#{Staff.label22}" id="label22" style="left: 0px; top: 432px; position: absolute" text="Country"/>
                                    <ui:label binding="#{Staff.label23}" id="label23" style="left: 0px; top: 240px; position: absolute" text="Street"/>
                                    <ui:label binding="#{Staff.label24}" id="label24" style="left: 0px; top: 144px; position: absolute" text="Status"/>
                                    <ui:label binding="#{Staff.label25}" id="label25" style="left: 0px; top: 192px; position: absolute" text="Creation Date"/>
                                    <ui:label binding="#{Staff.label26}" id="label26" style="left: 0px; top: 96px; position: absolute" text="Type"/>
                                    <ui:textField binding="#{Staff._country}" id="_country" style="left: 96px; top: 432px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._userName1}" id="_userName1" style="left: 96px; top: 48px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._city}" id="_city" style="left: 96px; top: 288px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._street}" id="_street" style="left: 96px; top: 240px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._status1}" id="_status1" style="left: 96px; top: 144px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._zipcode}" id="_zipcode" style="left: 96px; top: 384px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._state}" id="_state" style="left: 96px; top: 336px; position: absolute; width: 144px"/>
                                    <ui:textField binding="#{Staff._type2}" id="_type2" style="left: 96px; top: 96px; position: absolute; width: 144px"/>
                                    <ui:calendar binding="#{Staff._creationDate}" id="_creationDate" style="left: 96px; top: 192px; position: absolute"/>
                                    <ui:listbox binding="#{Staff.listbox2}" id="listbox2" items="#{Staff.listbox2DefaultOptions.options}" style="left: 504px; top: 72px; position: absolute; width: 151px"/>
                                    <ui:button binding="#{Staff.button6}" id="button6" style="left: 287px; top: 48px; position: absolute; width: 72px" text="Search"/>
                                    <ui:button binding="#{Staff.button8}" id="button8" style="left: 599px; top: 456px; position: absolute; width: 72px" text="Home"/>
                                </ui:panelLayout>
                            </ui:tab>
                            <ui:tab binding="#{Staff.myAccount}" id="myAccount" text="My Account">
                                <ui:panelLayout binding="#{Staff.layoutPanel7}" id="layoutPanel7" style="height: 516px; width: 100%">
                                    <ui:label binding="#{Staff.label35}" id="label35" style="left: 72px; top: 72px; position: absolute" text="Email"/>
                                    <ui:label binding="#{Staff.label44}" id="label44" style="left: 72px; top: 216px; position: absolute" text="Due Date"/>
                                    <ui:label binding="#{Staff.label46}" id="label46" style="left: 72px; top: 264px; position: absolute" text="Issue Date"/>
                                    <ui:label binding="#{Staff.label47}" id="label47" style="left: 48px; top: 336px; position: absolute" text="No of Renews"/>
                                    <ui:label binding="#{Staff.label49}" id="label49" style="left: 24px; top: 120px; position: absolute" text="Current Password"/>
                                    <ui:label binding="#{Staff.label50}" id="label50" style="left: 96px; top: 192px; position: absolute" text="Item"/>
                                    <ui:label binding="#{Staff.label51}" id="label51" style="left: 24px; top: 144px; position: absolute; width: 96px" text="New Password"/>
                                    <ui:label binding="#{Staff.label53}" id="label53" style="left: 72px; top: 312px; position: absolute" text="Due Days"/>
                                    <ui:label binding="#{Staff.label54}" id="label54" style="left: 24px; top: 168px; position: absolute" text="Confirm Password"/>
                                    <ui:textField binding="#{Staff._duedays}" id="_duedays" style="left: 144px; top: 312px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff._noofrenews}" id="_noofrenews" style="left: 144px; top: 336px; position: absolute; width: 120px"/>
                                    <ui:textField binding="#{Staff._email2}" id="_email2" style="left: 144px; top: 72px; position: absolute; width: 120px"/>
                                    <ui:passwordField binding="#{Staff._currentpass}" id="_currentpass" style="left: 144px; top: 120px; position: absolute; width: 120px"/>
                                    <ui:passwordField binding="#{Staff._newpass}" id="_newpass" style="left: 144px; top: 138px; position: absolute; width: 120px"/>
                                    <ui:passwordField binding="#{Staff._newpass1}" id="_newpass1" style="left: 144px; top: 159px; position: absolute; width: 120px"/>
                                    <ui:button binding="#{Staff.button36}" id="button36" style="left: 311px; top: 144px; position: absolute; width: 72px" text="Save"/>
                                    <ui:button binding="#{Staff.button37}" id="button37" style="left: 287px; top: 72px; position: absolute; width: 96px" text="Show"/>
                                    <ui:button binding="#{Staff.button38}" id="button38" style="left: 407px; top: 72px; position: absolute; width: 96px" text="Update"/>
                                    <ui:dropDown binding="#{Staff._item}" id="_item" items="#{Staff._itemDefaultOptions.options}" style="left: 144px; top: 192px; position: absolute; width: 132px"/>
                                    <ui:calendar binding="#{Staff._issuedate}" columns="10" id="_issuedate" style="left: 144px; top: 264px; position: absolute"/>
                                    <ui:calendar binding="#{Staff._duedate}" columns="10" id="_duedate" style="left: 144px; top: 216px; position: absolute"/>
                                    <ui:label binding="#{Staff.label52}" id="label52" style="position: absolute; left: 336px; top: 24px" text="Total Fine Days "/>
                                    <ui:textField binding="#{Staff._totalfine}" id="_totalfine" style="left: 432px; top: 24px; position: absolute; width: 96px"/>
                                    <ui:button binding="#{Staff.button39}" id="button39"
                                        style="height: 44px; left: 359px; top: 240px; position: absolute; width: 72px" text="Renew"/>
                                    <ui:button binding="#{Staff.button40}" id="button40" style="left: 551px; top: 24px; position: absolute; width: 72px" text="Show"/>
                                </ui:panelLayout>
                            </ui:tab>
                        </ui:tabSet>
                    </ui:form>
                </ui:body>
            </ui:html>
        </ui:page>
    </f:view>
</jsp:root>
