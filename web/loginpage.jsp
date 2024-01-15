<%-- 
    Document   : loginpage
    Created on : Oct 2, 2023, 8:50:41 PM
    Author     : SNEHA GUPTA
--%>

<%@page import="com.techblog.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .banner{
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 100%, 69% 94%, 38% 100%, 0 94%, 0 0);
            }
        </style>

    </head>
    <body>
        <!--navbar-->
        <%@include file="navbar.jsp"%>


        <main class="primary-background text-white d-flex align-items-center" style="height:70vh;">

            <div class="container">
                <div class="row">
                    <div class="col-md-4 offset-md-4">

                        <div class="card border">
                            <div class="card-header text-center primary-background text-white">
                                <i class="fa-solid fa-user-plus fa-3x"></i>
                                <p>Login Here</p>
                            </div> 


                            <!--error-message-->
                            <%

                                Message m = (Message) session.getAttribute("msg");

                                if (m != null) {


                            %>
                            <div class="alert <%= m.getCssClass()%> d-flex align-items-center" role="alert">
               
                                <div>
                                    <%= m.getContent()%>
                                </div>
                            </div>

                            <%                                
                            
                               session.removeAttribute("msg");
                                }

                            %>

                            <div class="card-body">
                                <form action="LoginServlet" method="POST">
                                    <div class="mb-3">
                                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                                        <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label">Password</label>
                                        <input name="password" type="password" class="form-control" id="exampleInputPassword1">
                                    </div>
                                    <div class="container text-center">
                                        <button type="submit" class="btn btn-outline-light primary-background text-white">Submit</button>
                                    </div>

                                </form>
                            </div>

                        </div>

                    </div>
                </div>
            </div>
        </main>

        <script
            src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="javascript/main.js" type="text/javascript"></script>
    </body>
</html>
