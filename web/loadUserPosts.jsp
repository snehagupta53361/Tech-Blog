<%-- 
    Document   : loadUserPosts
    Created on : Nov 2, 2023, 10:29:29 PM
    Author     : SNEHA GUPTA
--%>

<%@page import="java.util.List"%>
<%@page import="com.techblog.dao.PostDao"%>
<%@page import="com.techblog.entities.User"%>
<%@page import="com.techblog.entities.Posts"%>
<%@page import="com.techblog.helper.ConnectionProvider"%>
<%@page import="com.techblog.dao.LikeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
    User user = (User)session.getAttribute("currentUser");
    if(user==null){
        response.sendRedirect("loginpage.jsp");
}
%>
<div class="row" class="mt-2">
        <%
    PostDao d = new PostDao(ConnectionProvider.getConnection());
    List<Posts> posts = null; 
    int cid = Integer.parseInt(request.getParameter("cid"));
    if(cid==0){
        posts = d.getAllUserPosts(user.getId());
    }
    else{
        posts = d.getAllUserPostsByCategories(cid, user.getId());
    }
    
    if(posts.size()==0){
        out.println("No Posts in this category");
        return ;  
    }
    for(Posts p: posts){
        %>

        
            <div class="col-md-6">
                <div class="card mt-3" style="width: 350px;">
             <img src="blog-pictures/<%=p.getpPic()%>" class="card-img-top" alt="..." style="height: 350px; width: 350px;">
            <div class="card-body"> 
                <b><%=p.getpTitle()%></b>
                <p><%=p.getpContent()%></p>
                <pre><%=p.getpCode()%></pre>
            </div>
            <div class="card-footer">
                <%
                    LikeDao ld = new LikeDao(ConnectionProvider.getConnection());
                    
                %>
                <a href="blogUserPostDetails.jsp?post-id=<%=p.getPid()%>" class="btn btn-outline-light primary-background">Read More...</a>  
                <a href="#" class="btn btn-outline-light primary-background" onclick="like(<%=p.getPid()%>, <%=user.getId()%>)"><i class="fa-solid fa-heart"></i><%=ld.countLike(p.getPid())%></a>
                <a href="#" class="btn btn-outline-light primary-background" ><i class="fa-solid fa-comment"></i></a>
   
            </div>
        </div>
            </div>

<%
    }
%>
    
        </div>
    </body>
</html>
