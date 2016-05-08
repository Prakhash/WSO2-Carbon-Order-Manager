<%@ page import="org.wso2.carbon.ui.CarbonUIMessage" %>
<%@ page import="org.wso2.carbon.order.ui.OrderManagementClient" %>
<%@ page import="com.org.beans.xsd.Item" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://wso2.org/projects/carbon/taglibs/carbontags.jar" prefix="carbon" %>
<%
        OrderManagementClient order;
        Item[] items;

        try {
            order = new OrderManagementClient();
            items = order.getAvailableItems();
        } catch (Exception e) {
            CarbonUIMessage.sendCarbonUIMessage(e.getMessage(), CarbonUIMessage.ERROR, request, e);
%>
            <script type="text/javascript">
                   location.href = "../admin/error.jsp";
            </script>
<%
            return;
    }
%>

<div id="middle">
    <h2>Order Management</h2>

    <div id="workArea">
        <table class="styledLeft" id="moduleTable">
                <thead>
                <tr>
                    <th width="20%">Name</th>
                    <th width="40%">Number</th>
                </tr>
                </thead>
                <tbody>
           <%
                   for(Item item:items){
           %>
                   <tr>
                     <td><%=item.getName()%></td>
                    <td><%=item.getNumber()%></td>
                </tr>
           <%
                   }
           %>
                </tbody>
         </table>
    </div>
</div>