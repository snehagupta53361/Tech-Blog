<%-- 
    Document   : register
    Created on : Oct 2, 2023, 9:21:55 PM
    Author     : SNEHA GUPTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

    </head>
    <body>
        <%@include file="navbar.jsp"  %>

        <main class="primary-background text-white d-flex align-items-center">

            <div class="container p-5">
                <div class="row">
                    <div class="col-md-6 offset-md-3">

                        <div class="card">

                            <div class="card-header text-center primary-background text-white">
                                <i class="fa-solid fa-user-plus fa-3x"></i>
                                <p>Register Here</p>
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
                                        <label for="exampleInputPassword1" class="form-label">Password</label>
                                        <input name="password" type="password" class="form-control" id="exampleInputPassword1">
                                    </div>

                                    <div class="mb-3">
                                        <label for="gender" class="form-label">Select Gender</label>
                                        <br>
                                        <input type="radio" name="gender" id="gender" value="Male">Male
                                        <input type="radio" name="gender" id="gender" value="Female">Female
                                    </div>


                                    <div class="mb-3">
                                        <label for="text-box" class="form-label"></label>
                                        <textarea name="about" id="text-box" class="form-control" placeholder="Enter something about yourself"></textarea>
                                    </div>

                                    <div class="mb-3 form-check">
                                        <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
                                        <label class="form-check-label" for="exampleCheck1">agree terms and conditions</label>
                                    </div>

                                    <div id="loader" class="container text-center"  style="display:none;">

                                        <i class="fa-solid fa-arrows-rotate fa-spin fa-4x"></i>
                                        <h4>Please Wait...</h4>
                                    </div>
                                    <div class="text-center">
                                        <button id="submit-btn" type="submit" class="btn btn-outline-light btn-lg text-center primary-background">Submit</button>
                                    </div>
                                </form>


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

        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

        <script>
            $(document).ready(function () {

                console.log("loaded");

                $("#reg-form").on("submit", function (event) {

                    event.preventDefault();

                    let form = new FormData(this);


                    //send on register servlet

                    $("#submit-btn").hide();
                    $("#loader").show();

                    $.ajax({
                        url: "RegisterServlet",
                        type: "POST",
                        data: form,

                        success: function (data, textStatus, jqXHR) {
                            console.log(data);
                            if (data.trim() === "done") {
                                swal("Registered Successful...we are redirecting you to login page")
                                        .then((value) => {
                                           window.location = "loginpage.jsp";
                                        });
                            }
                            else{
                                swal(data);
                                 $("#submit-btn").show();
                            $("#loader").hide();
                            }
                        },
                        error: function (jqXHR, textStatus, errotThrown) {
                            console.log(jqXHR);
                            swal(data);
                            $("#submit-btn").show();
                            $("#loader").hide();
                        },
                        processData: false,
                        contentType: false,
                    })
                })
            })
        </script>
    </body>
</html>
