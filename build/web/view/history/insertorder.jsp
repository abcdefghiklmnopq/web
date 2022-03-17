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
        <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand" href="viewServlet"><h2>Finance Business</h2></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item ">
                        <a class="nav-link" href="viewServlet">Markets
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="search">history</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="view/login.jsp">login</a>
                    </li>
            </div>
        </div>
    </nav>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="css/home.css" rel="stylesheet" type="text/css"/>
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Additional CSS Files -->
        <link rel="stylesheet" href="assets/css/fontawesome.css">
        <link rel="stylesheet" href="assets/css/templatemo-finance-business.css">
        <link rel="stylesheet" href="assets/css/owl.css">
    </head>
    <body>
        <h1>Wellcome <%=( a.getFirstname() + a.getLastname())%>!</h1>
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
