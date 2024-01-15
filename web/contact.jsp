<%-- 
    Document   : contact
    Created on : Oct 20, 2023, 9:35:24 PM
    Author     : SNEHA GUPTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Me</title>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <main>
            
            <div class="container my-3">
                <div class="row">
                    <div class="col-md-8 offset-md-2">
                        <div class="card">
                            <div class="card-header primary-background text-white">
                                <h3>Contact Me</h3>
                            </div>
                            <div class="card-body">

                                <form id="reg-form" action="RegisterServlet" method="POST">
                                    <div class="mb-3">
                                        <label for="username" class="form-label">Username</label>
                                        <input name="username" type="text" class="form-control" id="username" aria-describedby="emailHelp">
                                    </div>

                                    <div class="mb-3">
                                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                                        <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                                        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                    </div>


                                    <div class="mb-3">
                                        <label for="text-box" class="form-label"></label>
                                        <textarea name="about" id="text-box" class="form-control" placeholder="Enter something about yourself" style="height:200px"></textarea>
                                    </div>

                                    <div class="text-center">
                                        <button id="submit-btn" type="submit" class="btn btn-outline-light btn-lg text-center primary-background">Submit</button>
                                    </div>
                                </form>


                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </body>
</html>
