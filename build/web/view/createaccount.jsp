<%-- 
    Document   : login
    Created on : Feb 11, 2022, 12:41:33 PM
    Author     : thand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>create account</title>
        <link href="../vendor/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="../vendor/bootstrap/js/bootstrap.js" type="text/javascript"></script>

        <style>
           .signin {
               text-align: center;
                font-size: 30px;
           }
        </style>

    </head>
    <body>
        <div class="container">

            <form class="well form-horizontal" action="createaccount" method="post"  id="contact_form">
                <fieldset>
                    <!-- Form Name -->
                    <legend><center><h2><b>Registration</b></h2></center></legend><br>
                    <!-- Text input-->

                    <div class="form-group row">
                        <label class="col-md-4 control-label">E-Mail</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                <input name="email" placeholder="E-Mail Address" class="form-control"  type="text">
                            </div>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-md-4 control-label">phone number</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                <input name="contact_no" placeholder="(639)" class="form-control" type="text">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group row">
                        <label class="col-md-4 control-label">First Name</label>  
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input  name="first_name" placeholder="First Name" class="form-control"  type="text">
                            </div>
                        </div>
                    </div>


                    <div class="form-group row">
                        <label class="col-md-4 control-label" >Last Name</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="last_name" placeholder="Last Name" class="form-control"  type="text">
                            </div>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label class="col-md-4 control-label" >Passport ID</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="last_name" placeholder="Passport ID" class="form-control"  type="text">
                            </div>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-md-4 control-label" >Gender </label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                &nbsp&nbsp<input type="radio" name="gender" value="male"/> Male
                                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp              
                                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                <input type="radio" name="gender" value="female"/> Female
                            </div>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label class="col-md-4 control-label" >Date of birth</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                Dob: <input type="date" name="dob"/> <br/>
                            </div>
                        </div>
                    </div>
                    

                    <div class="form-group row">
                        <label class="col-md-4 control-label" >Password</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="user_password" placeholder="Password" class="form-control"  type="password">
                            </div>
                        </div>
                    </div>
                    
                    <div class="form-group row">
                        <label class="col-md-4 control-label" >Confirm Password</label> 
                        <div class="col-md-4 inputGroupContainer">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                <input name="confirm_password" placeholder="Confirm Password" class="form-control"  type="password">
                            </div>
                        </div>
                    </div>

                    

                    

                    <!-- Button -->
                    <div class="form-group row">
                        <div class="col-md-4">
                        </div>
                        <div class="col-md-4"><br>
                            <button type="submit" class="btn btn-warning" >SUBMIT <span class="glyphicon glyphicon-send"></span></button>
                        </div>
                    </div>
                    
                    <div class="signin">
                        <p>Already have an account? <a href="login.jsp">Sign in</a>.</p>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</body>
</html>
