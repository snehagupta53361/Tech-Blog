<%-- 
    Document   : index
    Created on : Sep 25, 2023, 9:29:04 PM
    Author     : SNEHA GUPTA
--%>

<%@page import="com.techblog.entities.User"%>
<%@page import="com.techblog.dao.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techblog.entities.Posts"%>
<%@page import="com.techblog.dao.PostDao"%>
<%@page import="com.techblog.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>

        <!--bootstrap css-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .p-heading{
                font-weight: 100;
                font-size: 25px;
            }
            .p-code{
                font-size: 20px;
                font-weight: 100;
            }
            .p-content{
                font-size: 20px;
            }
            .user-info{
                border: 1px solid #e2e2e2;
                padding-top: 10px;
            }
        </style>

    </head>

    <body>

        <%@include file="navbar.jsp"%>

        <!--container-->

        <div class="container-fluid primary-background text-white pt-5 pb-5 banner">

            <div class="main">      
                <div class="container">

                    <h3 class="heading">Welcome To SnehaBlog</h3>
                    <p class="mt-3">Programming refers to a technological process for telling a computer which tasks to perform in order to solve problems. You can think of programming as a collaboration between humans and computers, in which humans create instructions for a computer to follow (code) in a language computers can understand.</p>

                    <p class="mt-3">When you browse a website to find information, contact a service provider, or make a purchase, programming allows you to interact with the site’s on-page elements, such as sign-up or purchase buttons, contact forms, and drop-down menus.

                    </p>
                </div>

            </div>


            <div class="buttons container">
                <a  class="btn btn-outline-light btn-lg" href="register.jsp"><i class="fa-solid fa-user-plus"></i>Start! Its free</a>
                <a class="btn btn-outline-light btn-lg" href="loginpage.jsp"><i class="fa-solid fa-user"></i>Login</a>
            </div>
        </div>


        <!--main-container, cards-->

        <div class="container mt-5">
            <div class="row my-3">
                <%                    PostDao postdao = new PostDao(ConnectionProvider.getConnection());
                    List<Posts> posts = postdao.getAllPosts();

                    for (Posts p : posts) {


                %>
                <div class="col-md-4">
                    <div class="card my-4">
                        <div class="card-header primary-background text-white">
                            <h3 class="p-heading"><%=p.getpTitle()%></h3>
                        </div>
                        <div class="card-body">
                            <div>
                                <img class="card-img-top" src="blog-pictures/<%=p.getpPic()%>" style="height: 300px; width: 300px;">
                            </div>

                            <div class="row my-3 user-info">
                                <%
                                    UserDao ud = new UserDao(ConnectionProvider.getConnection());
                                    
                                    int userId = p.getUserId();
                                    User user = ud.getUserByUserId(userId);
                                   
                                %>
                                <div class="col-md-8">
                                    <p><a href="#"><%=user.getName()%></a> has posted this:</p>
                                </div>

                            </div>
                            <div>
                                <p class="p-content"><%=p.getpContent()%></p>
                            </div>
                            <div>
                                <pre class="p-code"><%=p.getpCode()%></pre>
                            </div>
                        </div>
                        <div class="card-footer">
                            <a href="blog-post-details.jsp?post-id=<%=p.getPid()%>" class="btn btn-outline-light primary-background">Read More...</a>  
                            <a href="blog-post-details" class="btn btn-outline-light primary-background" ><i class="fa-solid fa-heart"></i>10</a>
                            <a href="blog-post-details" class="btn btn-outline-light primary-background" ><i class="fa-solid fa-comment"></i>20</a>
                        </div>
                    </div>
                </div>

                <%
                    }
                %>
            </div>
        </div>

        <!--Javascript-->

        <script
            src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="javascript/main.js" type="text/javascript"></script>
    </body>
</html>
