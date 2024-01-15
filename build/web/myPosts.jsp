<%-- 
    Document   : myPosts
    Created on : Nov 2, 2023, 9:50:25 PM
    Author     : SNEHA GUPTA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.techblog.entities.Categories"%>
<%@page import="com.techblog.dao.PostDao"%>
<%@page import="com.techblog.helper.ConnectionProvider"%>
<%@page import="com.techblog.entities.Message"%>
<%@page import="com.techblog.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Posts</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css" integrity="sha512-siarrzI1u3pCqFG2LEzi87McrBmq6Tp7juVsdmGY1Dr8Saw+ZBAzDzrGwX3vgxX1NkioYNCFOVC0GpDPss10zQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>
        <%
            User user = (User)session.getAttribute("currentUser");
            if(user==null){
                response.sendRedirect("loginpage.jsp");
            }
        %>
        
        <!--navbar Start-->   

        <nav class="navbar navbar-expand-lg primary-background ">
            <div class="container-fluid">
                <a class="navbar-brand text-white" href="index.jsp"><i class="fa-solid fa-blog"></i>SnehaBlog</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active text-white" href="#"><i class="fa-solid fa-code fa-flip"></i>Learn code with me</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fa-regular fa-square-check"></i>
                                Categories
                            </a>
                            <ul class="dropdown-menu ">
                                <li><a class="dropdown-item " href="#">Programming Language</a></li>
                                <li><a class="dropdown-item" href="#">Project Implementation</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Data Structures</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" aria-disabled="true" href="#"><i class="fa-regular fa-address-book"></i>Contact</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" aria-disabled="true" href="#" data-bs-toggle="modal" data-bs-target="#addPostModal"><i class="fa-regular fa-asterisk"></i>Do post</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" aria-disabled="true" href="myPosts.jsp">My Posts</a>
                        </li>

                    </ul>

                    <ul class="navbar-nav mr-right">
                        <li class="nav-item">
                            <a class="nav-link text-white" aria-disabled="true" href="#" data-bs-toggle="modal" data-bs-target="#profileModal"><i class="fa-solid fa-user-circle fa-1x"></i><%= user.getName()%></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white" aria-disabled="true" href="LogoutServlet"><i class="fa-solid fa-user-plus"></i>Logout</a>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>                                
        <!--navbar end-->
        
         <!--message start-->

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
    //            Thread.sleep(3000);
                session.removeAttribute("msg");
            }
        %>
        <!--message end-->

        <!--main content of the page-->


        <div class="container mt-4">
            <div class="row">

                <div class="col-md-4 mt-3">
                    <div class="list-group">
                        <!--categories column left part-->
                        <a href="#" class="list-group-item list-group-item-action primary-background cat-link" aria-current="true" onclick="getPosts(0, this)" id="all-posts">
                            All posts
                        </a>

                        <%
                            PostDao getCategories = new PostDao(ConnectionProvider.getConnection());
                            ArrayList<Categories> categories = getCategories.getCategories();

                            for (Categories cc : categories) {


                        %>
                        <a href="#" class="list-group-item list-group-item-action primary-background cat-link" onclick="getPosts(<%=cc.getcId()%>, this)"><%=cc.getcName()%></a>

                        <%
                            }
                        %>

                    </div>
                </div>
                <!--categories column right part-->

                <div class="col-md-8">
                    <div class="container text-center" id="loader">
                        <div class="d-flex justify-content-center">
                            <div class="spinner-border" role="status">
                                <span class="sr-only">Loading...</span>
                            </div>
                        </div>
                        <h3 class="mt-2">Loading...</h3>
                    </div>
                    <div id="post-container">

                    </div>
                </div>

            </div>
        </div>
        <!--main content end-->


        <!--modal-start-->



        <!-- Button trigger modal -->
        <!-- Profile Modal -->
        <div class="modal fade" id="profileModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header primary-background text-white">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">SnehaBlog</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">
                            <img src="profile_pictures/<%=user.getProfile()%>" class="img-fluid" style="width: 150px; height: 150px; border-radius: 50%;">
                            <h5><%=user.getName()%></h5>

                            <div class="container text-center" id="profile-details">
                                <table class="table mt-3">

                                    <tbody>
                                        <tr>
                                            <td>ID:</td>
                                            <td><%=user.getId()%></td>
                                        </tr>
                                        <tr>
                                            <td>Email</td>
                                            <td><%=user.getEmail()%></td>

                                        </tr>
                                        <tr>
                                            <td>Gender</td>
                                            <td><%=user.getGender()%></td>

                                        </tr>
                                        <tr>
                                            <td>Status</td>
                                            <td><%=user.getAbout()%></td>
                                        <tr>
                                        </tr>
                                    <td>Registration Date</td>
                                    <td><%=user.getDate().toString()%></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>

                            <!--edit module-->
                            <div  class="container text-center mt-3" id="profile-edit" style="display: none;">
                                <h4>Please edit carefully</h4>
                                <form action="EditServlet" method="POST" enctype="multipart/form-data"><!-- means this data contains multiple types, images, audio, video-->
                                    <table class="table">
                                        <tbody>
                                            <tr>
                                                <td>ID:</td>
                                                <td><%=user.getId()%></td>
                                            </tr>
                                            <tr>
                                                <td>Name:</td>
                                                <td><input class="form-control" type="text" name="user_name" value="<%=user.getName()%>"></td>
                                            </tr>

                                            <tr>
                                                <td>Email:</td>
                                                <td><input class="form-control" type="email" name="user_email" value="<%=user.getEmail()%>"></td>
                                            </tr>
                                            <tr>
                                                <td>Password:</td>
                                                <td><input class="form-control" type="password" name="user_password" value="<%=user.getPassword()%>"></td>
                                            </tr>
                                            <tr>
                                                <td>Gender:</td>
                                                <td><%=user.getGender()%></td>
                                            </tr>
                                            <tr>
                                                <td>About:</td>
                                                <td>
                                                    <textarea rows="3" class="form-control" name="about" ><%=user.getAbout()%></textarea>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>New Profile:</td>
                                                <td>
                                                    <input type="file" name="image" class="form-control">
                                                </td>
                                            </tr>
                                        </tbody>
                                    </table>

                                    <div class="container">
                                        <button type="submit" class="btn btn-outline-light primary-background text-white">Save</button>
                                    </div>
                                </form>
                            </div>

                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button id="edit-profile-btn" type="button" class="btn btn-outline-dark primary-background text-white">Edit</button>
                    </div>
                </div>
            </div>
        </div>
        <!--profile modal-end-->


        <!--post modal start--> 
        <div class="modal fade" id="addPostModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header primary-background text-white">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">SnehaBlog</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form action="AddPostServlet" method="post" id="addPostForm">
                            <div class="form-group">
                                <select class="form-control" name="cid">
                                    <option disabled selected>--Select your category--</option> 
                                    <%
                                        PostDao post = new PostDao(ConnectionProvider.getConnection());
                                        ArrayList<Categories> list = post.getCategories();
                                        for (Categories c : list) {
                                    %>
                                    <option value="<%=c.getcId()%>"><%=c.getcName()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                            <br>
                            <div class="form-group">
                                <input type="text" placeholder="Enter post title" class="form-control" name="ptitle" />
                            </div>
                            <br>
                            <div class="form-group">
                                <textarea class="form-control" placeholder="Enter your content" style="height: 200px" name="pcontent"></textarea>
                            </div>
                            <br>
                            <div class="form-group">
                                <textarea class="form-control" placeholder="Enter your Code" style="height: 200px" name="pcode"></textarea>
                            </div>
                            <br>
                            <div class="form-group">
                                <label for="file">Select your pic:</label>
                                <br>
                                <input type="file" id="file" class="mt-3" name="file">
                            </div>
                            <div class="container text-center mt-5 form-group">
                                <button type="submit" class="btn btn-outline-light primary-background" id="submit-btn">POST</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--post modal end-->
         <!--javascript-->
        <script
            src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="javascript/main.js" type="text/javascript"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js" integrity="sha512-AA1Bzp5Q0K1KanKKmvN/4d3IRKVlv9PYgwFPvm32nPO6QS8yH1HO7LbgB1pgiOxPtfeg5zEn2ba64MUcqJx6CA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>

        <script>
                            //edit button related javascript
                            $(document).ready(function () {
                                let editStatus = false;
                                $("#edit-profile-btn").click(function () {
                                    if (editStatus === false) {
                                        $("#profile-details").hide();
                                        $("#profile-edit").show();
                                        editStatus = true;
                                        $(this).text("Back");
                                    } else {
                                        $("#profile-details").show();
                                        $("#profile-edit").hide();
                                        editStatus = false;
                                        $(this).text("Edit");
                                    }

                                });

                            });

        </script>
        <!--now add post js-->
        <script>

            $(document).ready(function () {

                $("#addPostForm").on("submit", function (event) {
                    event.preventDefault();
                    let form = new FormData(this);
                    $.ajax({
                        url: "AddPostServlet",
                        type: "post",
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            if (data.trim() == "done") {
                                swal("Good Job", "You have successfully posted...", "success");
                            } else {
                                swal("Sorry!", "Something went wrong try again...", "danger");
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {

                        },
                        processData: false,
                        contentType: false,
                    });
                });

            });

        </script>

        <!--//get post-->
        <script>
            function getPosts(catId, temp) {
                $(".cat-link").removeClass("primary-background");
                $.ajax({
                    url: "loadUserPosts.jsp",
                    data: {cid: catId},
                    success: function (data, textStatus, jqXHR) {
                        $("#loader").hide();
                        $("#post-container").html(data);
                        $(temp).removeClass("list-group-item-action");
                        $(temp).addClass("primary-background");

                    }
                })
            }
            $(document).ready(function () {
                let getAllPostRef = $(".cat-link")[0];  //referance of all posts
                getPosts(0, getAllPostRef);
            })
        </script>
    </body>
</html>
