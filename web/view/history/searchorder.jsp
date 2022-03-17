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
            Integer pageindex = (Integer) request.getAttribute("pageindex");
            Integer totalpage = (Integer) request.getAttribute("totalpage");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/searchorder.js" type="text/javascript"></script>
        <link href="css/searchorder.css" rel="stylesheet" type="text/css"/>
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
                    <li class="nav-item active">
                        <a class="nav-link" href="search">history</a>
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
    <h1>Wellcome <%=(a.getFirstname()  + a.getLastname())%>!</h1>
    <h1><a href="history"> View history on line chart!</a></h1>
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
                <td>&emsp;<a href="updateHistory?id=<%=h.getId()%>">Edit</a>&emsp;
                    <a href="#" onclick="deleteStudent(<%=h.getId()%>)">Delete</a>&emsp;
                </td>
            </tr>
            <%}%>

        </tbody>
    </table>
    <div id="paggerbot" class="pagger"> abcd</div>
    <script>
            function deleteStudent(id)
            {
                var result = confirm("Are you sure?");
                if(result)
                {
                    window.location.href = 'DeleteHistory?id='+ id;
                }
            }
            pagger("paggerbot",<%=pageindex%>,<%=totalpage%>, 3);
    </script>


</body>
</html>
