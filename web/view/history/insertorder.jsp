<%-- 
    Document   : insertorder
    Created on : Mar 11, 2022, 9:42:13 PM
    Author     : thand
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Account a = (Account) request.getSession().getAttribute("account");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1">

            <tbody>
            <form name="form" action="insertorder" method="POST">

                <tr>
                    <td>Type: </td>
                    <td><input type="text" name="Type"></td>
                </tr>
                <tr>
                    <td>Time</td>
                    <td><input type="date" name="Time"></td>
                </tr>
                <tr>
                    <td>Comment</td>
                    <td><input type="text" name="Comment"></td>
                </tr>
                <tr>
                    <td>Symbol</td>
                    <td><input type="text" name="Symbol"></td>
                </tr>
                <tr>
                    <td>Amount</td>
                    <td><input type="text" name="Amount"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="save"></td>
                </tr>
            </form>
        </tbody>
    </table>
</body>
</html>
