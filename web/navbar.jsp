<%-- 
    Document   : navbar
    Created on : Sep 25, 2023, 9:40:41 PM
    Author     : SNEHA GUPTA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.techblog.entities.Categories"%>
<%@page import="com.techblog.dao.PostDao"%>
<%@page import="com.techblog.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css" integrity="sha512-siarrzI1u3pCqFG2LEzi87McrBmq6Tp7juVsdmGY1Dr8Saw+ZBAzDzrGwX3vgxX1NkioYNCFOVC0GpDPss10zQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>
        
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
              <%
                  PostDao pdao = new PostDao(ConnectionProvider.getConnection());
                  
                  ArrayList<Categories> catg = new ArrayList();
                  
                  catg = pdao.getCategories();
                  for(Categories c: catg){
                      
                      %>
              <li><a class="dropdown-item " href="#"><%=c.getcName()%></a></li>
              <%
                  }
              %>
            
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white" aria-disabled="true" href="contact.jsp"><i class="fa-regular fa-address-book"></i>Contact</a>
        </li>
         <li class="nav-item">
          <a class="nav-link text-white" aria-disabled="true" href="loginpage.jsp"><i class="fa-solid fa-user"></i>Login</a>
        </li>
          <li class="nav-item">
          <a class="nav-link text-white" aria-disabled="true" href="register.jsp"><i class="fa-solid fa-user-plus"></i>Sign Up</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-light" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
        
    </body>
</html>
