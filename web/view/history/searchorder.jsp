<%-- 
    Document   : searchorder
    Created on : Mar 11, 2022, 10:17:08 PM
    Author     : thand
--%>

<%@page import="model.Account"%>
<%@page import="model.History"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ArrayList<History> historys = (ArrayList<History>) request.getAttribute("historys");
            Account a = (Account) request.getSession().getAttribute("account");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello <%=(a.getLastname()+"&nbsp;"+a.getFirstname())%>!</h1>
        <h1><a href="insertorder"> Add Order</a></h1>
        <br>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Type</th>
                    <th>Time</th>
                    <th>Comment</th>
                    <th>Symbol</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <%for (History h : historys) {%>
                <tr>
                    <td><%=h.getId()%></td>
                    <td><%=h.getType()%></td>
                    <td><%=h.getTime()%></td>
                    <td><%=h.getSymbol()%></td>
                    <td><%=h.getAmount()%></td>
                    <td><%=h.getComment()%></td>
                </tr>
                <%}%>

            </tbody>
        </table>


    </body>
</html>
