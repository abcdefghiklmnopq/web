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
            float amount=0;
        %>
    </head>
    <body>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
        <canvas id="myChart" width="500" height="200" style="border:1px solid #d3d3d3;">
            Your browser does not support the HTML canvas tag.</canvas>

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
                                            "<%=(amount+=historys.get(i).getAmount())%>"
                                            <%} else {%>
                                                    "<%=(amount+=historys.get(i).getAmount())%>",
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
