<%-- 
    Document   : home
    Created on : Feb 19, 2022, 1:55:12 PM
    Author     : thand
--%>

<%@page import="model.Account"%>
<%@page import="model.CEX"%>
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
            CEX x = (CEX) request.getSession().getAttribute("cexs");
            String markettype = x.getName();
            String cex = x.getCexname();
            String cratelv2 = (String) request.getSession().getAttribute("crate");
            String volumelv2 = (String) request.getSession().getAttribute("volume");
            String sendeail = (String) request.getSession().getAttribute("sendeail") + "";
            String elastedtime = (String) request.getSession().getAttribute("elastedtime") + "";
            Account account = (Account) request.getSession().getAttribute("account");


        %>
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
    <nav class="navbar navbar-expand-lg">
        <div class="container">
            <a class="navbar-brand" href="viewServlet"><h2>Finance Business</h2></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="viewServlet">Markets
                            <span class="sr-only">(current)</span>
                        </a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="search">history</a>
                    </li>
                    <li class="nav-item">
                        <%if(account==null){%>
                        <a class="nav-link" href="view/login.jsp">login</a>
                        <%}else{%>
                        <a class="nav-link" href="logout">logout</a>
                        <%}%>
                    </li>
            </div>
        </div>
    </nav>
</head>
<body <%        String a = (String) request.getAttribute("a") + "";
    if (a.equals("a")) {%>
    onload="Stat()"
    <%}%>
    >

    <div class="select">
        <form action="viewServlet" method="POST" >
            Market Type:&emsp;
            <select name="markettype">

                <option value="Spot" >Spot</option>
                <option value="Futures" 
                        <%if (markettype.equals("Futures")) {%>
                        selected="selected" 
                        <%}%>
                        >Futures</option>
            </select>
            &emsp;&emsp;&emsp;&emsp;&emsp;CEX:&emsp;
            <select name="cex">
                <option value="Binance">Binance</option>
                <option value="kukoin" 
                        <%if (cex.equals("kukoin")) {%>
                        selected="selected" 
                        <%}%>
                        > kukoin </option>
            </select>
                        &emsp;&emsp;<input type="submit"  value="Search" />
        </form>
    </div>
    <%if (list.size() != 0) {%>
    <div class="row">
        <div class="col-md-6 col-sm-12">
            <table border="1">
                <thead>
                    <tr>
                        <th> Name </th>
                        <th>&emsp; Price &emsp;</th>
                        <th>&ensp;(24h)ChangeRate &ensp;</th>
                        <th>&emsp; ChangePrice &emsp;</th>
                        <th>&emsp; Volume(USDT)&emsp; </th>
                    </tr>
                </thead>
                <tbody>
                    <%for (ticker t : list) {%>
                    <tr>
                        <td><%=t.getName()%></td>
                        <td > &emsp;<%=t.getPrice()%>&emsp;</td>
                        <td class="center"><%=t.getChangerate()%>&emsp;%</td>
                        <td class="txt"> <%=t.getChangeprice()%>&emsp;</td>
                        <td class="txt"><%=t.getVolume()%>&emsp;M&emsp;</td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <div class="col-md-6 col-sm-12" >
            <div class="form-container">
                <div class="form" >
                    <form action="viewServlet" method="POST"  >

                        Confguration<br>
                        Lever 1:<br>
                        <input type="text" placeholder="% Change Rate" name="changerate1">(%) Change Rate<br>
                        <input type="text" placeholder=" Volume24h" name="vol1">M&emsp;(USD) Volume 24h <br/>
                        <input type="submit"  value="Filter"  />
                    </form>
                </div>
                <%if (account != null) {%>
                <div class="form" >

                    <form action="list" method="POST" id="searchFrm"  >


                        Alert:<br>
                        <h6> Email: <%=account.getEmail()%> </h6>
                        Do you want to receive emails:
                        <input type="radio" name="sendeail"
                               <%=(sendeail.equals("yes")) ? "checked=\"checked\"" : ""%> 
                               value="yes" > YES 
                        <input type="radio" name="sendeail"
                               <%=(sendeail.equals("No")) ? "checked=\"checked\"" : ""%> 
                               value="No"/> NO <br>

                        <br>
                        Lever 2:<br>
                        <input type="text" placeholder="% Change Rate" name="changerate2"
                               <% if (cratelv2 != null && !cratelv2.trim().isEmpty()) {%>
                               value="<%=cratelv2%>"
                               <%}%>
                               >(%) Change Rate<br>
                        <input type="text" placeholder=" Volume24h" name="vol2"
                               <% if (volumelv2 != null && !volumelv2.trim().isEmpty()) {%>
                               value="<%=volumelv2%>"
                               <%}%>
                               >M&emsp;(USD) Volume 24h <br>
                        <select name="elastedtime" id="elastedtime" onchange="change()">
                            <option value="1" <%=elastedtime.equals("1") ? "selected=\"selected\"" : ""%>>1h</option>
                            <option value="2" <%=elastedtime.equals("2") ? "selected=\"selected\"" : ""%>>2h</option>
                            <option value="5" <%=elastedtime.equals("5") ? "selected=\"selected\"" : ""%>>5h</option>
                            <option value="10" <%=elastedtime.equals("10") ? "selected=\"selected\"" : ""%>>10h</option>
                            <option value="12" <%=elastedtime.equals("12") ? "selected=\"selected\"" : ""%>>12h</option>
                            <option value="24" <%=elastedtime.equals("24") ? "selected=\"selected\"" : ""%>>24h</option>
                        </select> &emsp;Elasted Time <br>
                        <input type="text"  value="0" id="number" /> so gio troi qua!<br>
                        <input type="submit"  value="Start" onclick="Stat();"/>&ensp;&ensp;&ensp;&ensp;
                        <input type="button"  value="End" onclick="Stop();"/>
                    </form>

                </div>
                <%}%>
            </div>
        </div>
    </div>
    <%}%>

    <script src="js/homejavascript.js" type="text/javascript"></script>

</body>
</html>
