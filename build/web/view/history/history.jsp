<%-- 
    Document   : history
    Created on : Mar 5, 2022, 10:56:51 PM
    Author     : thand
--%>

<%@page import="model.History"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>history Page</title>
        <%
            ArrayList<History> historys = (ArrayList<History>) request.getAttribute("historys");
            float amount = 0;
        %>
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
    <div>
        <h1><a href="history"> View history on table!</a></h1>
        <h1><a href="insertorder"> Add Order</a></h1>
    </div>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
    <canvas id="myChart" width="500" height="200" style="border:1px solid #d3d3d3;">
        Your browser does not support the HTML canvas tag.</canvas>
    <style>
        canvas{ margin-bottom:  8%;
                    margin-top:   5%
        }
    </style>
    <script>
        var ctx = document.getElementById('myChart').getContext('2d');
        var chart = new Chart(ctx, {
        // The type of chart we want to create
        type: 'line',
                // The data for our dataset
                data: {

                labels: [<%for (int i = 0; i < historys.size(); i++) {
                        if (i == historys.size() - 1) {%>
                "<%=historys.get(i).getTime()%>"
        <%} else if (i % 3 == 0 && i>0) {%>
                "<%=historys.get(i).getTime()%>",
        <%} else {%>
                "",
        <%}
            }%>],
                        datasets: [{
                        label: "My First dataset",
                                backgroundColor: 'rgba(255, 255, 255,0.1)',
                                borderColor: 'black',
                                fillColor: "#fff",
                                strokeColor: "#fff)",
                                pointColor: "#fff",
                                pointStrokeColor: "#fff",
                                data: [<%for (int i = 0; i < historys.size(); i++) {
                                        if (i == historys.size() - 1) {%>
                                "<%=(amount += historys.get(i).getAmount())%>"
        <%} else {%>
                                "<%=(amount += historys.get(i).getAmount())%>",
        <%}
            }%>]
                        }]
                },
                // Configuration options go here
                options: {
                }
        }
        );
    </script>

</body>
</html>
