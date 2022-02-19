<%-- 
    Document   : home
    Created on : Feb 19, 2022, 1:55:12 PM
    Author     : thand
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.ticker"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home Page</title>
        <%
            ArrayList<ticker> list = (ArrayList<ticker>) request.getAttribute("list");
        %>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <style>
            .txt{
                text-align: center;
            }
            .form-container {
                background-color: #c8cbcf;
                border: none;
                border-radius: 10px;
                box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1), 0 8px 16px rgba(0, 0, 0, 0.1);
                margin-bottom: 10px;
                padding: 20px;
                max-width: 500px;

            }
            div{
                padding: 20px
            }
        </style>
    </head>
    <body>
        <div class="select">
            <form action="viewServlet" method="POST">
            &emsp;&emsp;Market Type:&emsp;<select name="markettype">
                <option value="1">Spot</option>
                <option value="2">Futures</option>
            </select>
            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;CEX:&emsp;<select name="cex">
                <option value="1">kukoin</option>
                <option value="2">binance</option>
            </select><br>
        </form>
        </div>
        
        <div class="row">
            <div class="col-md-6 col-sm-12">
                <table border="1">
                    <thead>
                        <tr>
                            <th> Name </th>
                            <th>&emsp; Price &emsp;</th>
                            <th>&ensp;(24h)ChangeRate &ensp;</th>
                            <th>&emsp; ChangePrice &emsp;</th>
                            <th>&emsp; Volume&emsp; </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%for (int i = 0; i < 10; i++) {%>
                        <tr>
                            <td><%=list.get(i).getSymbolName()%></td>
                            <td class="txt"> <%=list.get(i).getBuy()%></td>
                            <td class="txt"><%=list.get(i).getChangeRate()%></td>
                            <td class="txt"> <%=list.get(i).getChangePrice()%></td>
                            <td class="txt"><%=list.get(i).getVol()%></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
            <div class="col-md-6 col-sm-12" >
                <div class="form-container">
                    <form action="viewServlet" method="POST">
                        Alert:<br>
                        <input type="email" placeholder="Email address" name="email"><br>
                        Do you want to receive emails: <input type="radio" name="sendeail" value="yes"> YES 
                        <input type="radio" name="sendeail" value="No"/> NO <br>
                        <br>
                        Confguration<br>
                        Lever 1:<br>
                        <input type="text" placeholder="% Change Rate" name="changerate">(%) Change Rate<br>
                        <input type="text" placeholder=" Volume24h" name="vol">(USD) Volume 24h <br/>
                        <input type="submit"  value="Filter"/>
                    </form>
                    <form action="viewServlet" method="POST">
                        Lever 2:<br>
                        <input type="text" placeholder="% Change Rate" name="changerate">(%) Change Rate<br>
                        <input type="text" placeholder=" Volume24h" name="vol">(USD) Volume 24h <br>
                        Elasted Time: 
                        <select name="elastedtime">
                            <option value="1">1h</option>
                            <option value="2">2h</option>
                            <option value="5">5h</option>
                            <option value="10">10h</option>
                            <option value="12">12h</option>
                            <option value="24">24h</option>
                        </select><br>
                        <input type="submit"  value="Start"/>
                        <input type="submit"  value="End"/>
                    </form>
                </div>

            </div>
        </div>

    </body>
</html>
