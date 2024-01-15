package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.techblog.dao.LikeDao;
import com.techblog.dao.UserDao;
import com.techblog.entities.Message;
import java.util.ArrayList;
import com.techblog.entities.Categories;
import com.techblog.entities.User;
import com.techblog.dao.PostDao;
import com.techblog.entities.Posts;
import com.techblog.helper.ConnectionProvider;

public final class blog_002dpost_002ddetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    User user = (User) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("loginpage.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("        ");

            int postId = Integer.parseInt(request.getParameter("post-id"));
            
            PostDao post = new PostDao(ConnectionProvider.getConnection());
            
            Posts p = post.getPostInfoByPostId(postId);
            
        
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print(p.getpTitle());
      out.write("</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css\" integrity=\"sha512-siarrzI1u3pCqFG2LEzi87McrBmq6Tp7juVsdmGY1Dr8Saw+ZBAzDzrGwX3vgxX1NkioYNCFOVC0GpDPss10zQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    \n");
      out.write("        <style>\n");
      out.write("            .p-title{\n");
      out.write("                font-size: 30px;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .p-content{\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("            .p-code{\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .p-user{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .p-date{\n");
      out.write("                font-size: 15px;\n");
      out.write("                font-style: italic;\n");
      out.write("            }\n");
      out.write("            .user-info{\n");
      out.write("                border: 1px solid #e2e2e2;\n");
      out.write("                padding-top: 15px;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background: url(images/bg.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <!--navbar-->   \n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg primary-background \">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand text-white\" href=\"index.jsp\"><i class=\"fa-solid fa-blog\"></i>SnehaBlog</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active text-white\" href=\"#\"><i class=\"fa-solid fa-code fa-flip\"></i>Learn code with me</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa-regular fa-square-check\"></i>\n");
      out.write("                            Categories\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu \">\n");
      out.write("                            <li><a class=\"dropdown-item \" href=\"#\">Programming Language</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Project Implementation</a></li>\n");
      out.write("                            <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Data Structures</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"#\"><i class=\"fa-regular fa-address-book\"></i>Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#addPostModal\"><i class=\"fa-regular fa-asterisk\"></i>Do post</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <ul class=\"navbar-nav mr-right\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#profileModal\"><i class=\"fa-solid fa-user-circle fa-1x\"></i>");
      out.print( user.getName());
      out.write("</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"LogoutServlet\"><i class=\"fa-solid fa-user-plus\"></i>Logout</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>                                \n");
      out.write("    <!--navbar end-->\n");
      out.write("    \n");
      out.write("        <!--message start-->\n");
      out.write("\n");
      out.write("    ");

        
        Message m = (Message) session.getAttribute("msg");

        if (m != null) {


    
      out.write("\n");
      out.write("    <div class=\"alert ");
      out.print( m.getCssClass());
      out.write(" d-flex align-items-center\" role=\"alert\">\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");
      out.print( m.getContent());
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");

//            Thread.sleep(3000);
            session.removeAttribute("msg");
        }
    
      out.write("\n");
      out.write("    <!--message end-->\n");
      out.write("\n");
      out.write("<!--main content of the body-->\n");
      out.write("\n");
      out.write("<div class=\"container mt-3\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8 offset-md-2\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-header primary-background text-white\">\n");
      out.write("                    <h3 class=\"p-title\">");
      out.print(p.getpTitle());
      out.write("</h3>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <img src=\"blog-pictures/");
      out.print(p.getpPic());
      out.write("\" class=\"img-fluid\" style=\"height: 300px;\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"row my-3 user-info\">\n");
      out.write("                        ");

                            UserDao ud = new UserDao(ConnectionProvider.getConnection());
                            
                            int userId = p.getUserId();
                                           
      out.write("\n");
      out.write("                        <div class=\"col-md-8 \">\n");
      out.write("                            <p class=\"p-user\"><a>");
      out.print((ud.getUserByUserId(userId)).getName());
      out.write("</a> has posted this:</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 p-date\">\n");
      out.write("                            <p class=\"p-date\">");
      out.print(p.getpDate().toString());
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"p-content my-4\">\n");
      out.write("                        <b>");
      out.print(p.getpContent());
      out.write("</b>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"p-code\">\n");
      out.write("                        <pre>");
      out.print(p.getpCode());
      out.write("</pre>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"card-footer primary-background text-white\">\n");
      out.write("                        ");

                            LikeDao ld = new LikeDao(ConnectionProvider.getConnection());
                        
      out.write("\n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-light primary-background\" onclick=\"like(");
      out.print(p.getPid());
      out.write(',');
      out.write(' ');
      out.print(user.getId());
      out.write(")\"><i class=\"fa-solid fa-heart\"></i><span class=\"like-button\">");
      out.print(ld.countLike(p.getPid()));
      out.write("</span></a> \n");
      out.write("                        <!--here countLike method is counting likes on that post-->\n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-light primary-background\" ><i class=\"fa-solid fa-comment\"></i>20</a>  \n");
      out.write("                        <a href=\"#\" class=\"btn btn-outline-light primary-background\" onclick=\"deletePost(");
      out.print(postId);
      out.write(")\">Delete Post</a>\n");
      out.write("                        <form action=\"UpdateServlet\" type=\"post\" class=\"mt-2\">\n");
      out.write("                            <a  class=\"btn btn-outline-light primary-background\" aria-disabled=\"true\" href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#addPostModal\">Update post</a>\n");
      out.write("                        </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--post modal start-->\n");
      out.write("    <div class=\"modal fade\" id=\"addPostModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header primary-background text-white\">\n");
      out.write("                    <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">SnehaBlog</h1>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"AddPostServlet\" method=\"post\" id=\"addPostForm\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <select class=\"form-control\" name=\"cid\">\n");
      out.write("                                <option disabled selected>--Select your category--</option> \n");
      out.write("                                ");

                                    ArrayList<Categories> list = post.getCategories();
                                    for (Categories c : list) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(c.getcId());
      out.write('"');
      out.write('>');
      out.print(c.getcName());
      out.write("</option>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter post title\" class=\"form-control\" name=\"ptitle\" />\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"form-control\" placeholder=\"Enter your content\" style=\"height: 200px\" name=\"pcontent\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"form-control\" placeholder=\"Enter your Code\" style=\"height: 200px\" name=\"pcode\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"file\">Select your pic:</label>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"file\" id=\"file\" class=\"mt-3\" name=\"file\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container text-center mt-5 form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-outline-light primary-background\" id=\"submit-btn\">POST</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<!--post modal end-->\n");
      out.write("    <!-- Modal -->\n");
      out.write("    <div class=\"modal fade\" id=\"profileModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header primary-background text-white\">\n");
      out.write("                    <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">SnehaBlog</h1>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <div class=\"container text-center\">\n");
      out.write("                        <img src=\"profile_pictures/");
      out.print(user.getProfile());
      out.write("\" class=\"img-fluid\" style=\"width: 150px; height: 150px; border-radius: 50%;\">\n");
      out.write("                        <h5>");
      out.print(user.getName());
      out.write("</h5>\n");
      out.write("\n");
      out.write("                        <div class=\"container text-center\" id=\"profile-details\">\n");
      out.write("                            <table class=\"table mt-3\">\n");
      out.write("\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>ID:</td>\n");
      out.write("                                        <td>");
      out.print(user.getId());
      out.write("</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Email</td>\n");
      out.write("                                        <td>");
      out.print(user.getEmail());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Gender</td>\n");
      out.write("                                        <td>");
      out.print(user.getGender());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Status</td>\n");
      out.write("                                        <td>");
      out.print(user.getAbout());
      out.write("</td>\n");
      out.write("                                    <tr>\n");
      out.write("                                    </tr>\n");
      out.write("                                <td>Registration Date</td>\n");
      out.write("                                <td>");
      out.print(user.getDate().toString());
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!--edit module-->\n");
      out.write("                        <div  class=\"container text-center mt-3\" id=\"profile-edit\" style=\"display: none;\">\n");
      out.write("                            <h4>Please edit carefully</h4>\n");
      out.write("                            <form action=\"EditServlet\" method=\"POST\" enctype=\"multipart/form-data\"><!-- means this data contains multiple types, images, audio, video-->\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>ID:</td>\n");
      out.write("                                            <td>");
      out.print(user.getId());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Name:</td>\n");
      out.write("                                            <td><input class=\"form-control\" type=\"text\" name=\"user_name\" value=\"");
      out.print(user.getName());
      out.write("\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Email:</td>\n");
      out.write("                                            <td><input class=\"form-control\" type=\"email\" name=\"user_email\" value=\"");
      out.print(user.getEmail());
      out.write("\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Password:</td>\n");
      out.write("                                            <td><input class=\"form-control\" type=\"password\" name=\"user_password\" value=\"");
      out.print(user.getPassword());
      out.write("\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>Gender:</td>\n");
      out.write("                                            <td>");
      out.print(user.getGender());
      out.write("</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>About:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <textarea rows=\"3\" class=\"form-control\" name=\"about\" >");
      out.print(user.getAbout());
      out.write("</textarea>\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>New Profile:</td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input type=\"file\" name=\"image\" class=\"form-control\">\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("\n");
      out.write("                                <div class=\"container\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-outline-light primary-background text-white\">Save</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\n");
      out.write("                    <button id=\"edit-profile-btn\" type=\"button\" class=\"btn btn-outline-dark primary-background text-white\">Edit</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--profile modal-end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--update post modal start--> \n");
      out.write("    <div class=\"modal fade\" id=\"addPostModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header primary-background text-white\">\n");
      out.write("                    <h1 class=\"modal-title fs-5\" id=\"exampleModalLabel\">SnehaBlog</h1>\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">\n");
      out.write("                    <form action=\"AddPostServlet\" method=\"post\" id=\"addPostForm\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <select class=\"form-control\" name=\"cid\">\n");
      out.write("                                <option disabled selected>--Select your category--</option> \n");
      out.write("                                ");

                                    for(Categories c: list){
                                        
      out.write("\n");
      out.write("                                        <option>");
      out.print(c.getcName());
      out.write("</option>\n");
      out.write("                                \n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter post title\" class=\"form-control\" name=\"ptitle\" />\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"form-control\" placeholder=\"Enter your content\" style=\"height: 200px\" name=\"pcontent\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <textarea class=\"form-control\" placeholder=\"Enter your Code\" style=\"height: 200px\" name=\"pcode\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"file\">Select your pic:</label>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"file\" id=\"file\" class=\"mt-3\" name=\"file\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container text-center mt-5 form-group\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-outline-light primary-background\" id=\"submit-btn\">POST</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--post modal end-->\n");
      out.write("    <!--javascript-->\n");
      out.write("    <script\n");
      out.write("        src=\"https://code.jquery.com/jquery-3.7.1.min.js\"\n");
      out.write("        integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\"\n");
      out.write("    crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"javascript/main.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\" integrity=\"sha512-AA1Bzp5Q0K1KanKKmvN/4d3IRKVlv9PYgwFPvm32nPO6QS8yH1HO7LbgB1pgiOxPtfeg5zEn2ba64MUcqJx6CA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        //edit button related javascript\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            let editStatus = false;\n");
      out.write("            $(\"#edit-profile-btn\").click(function () {\n");
      out.write("                if (editStatus === false) {\n");
      out.write("                    $(\"#profile-details\").hide();\n");
      out.write("                    $(\"#profile-edit\").show();\n");
      out.write("                    editStatus = true;\n");
      out.write("                    $(this).text(\"Back\");\n");
      out.write("                } else {\n");
      out.write("                    $(\"#profile-details\").show();\n");
      out.write("                    $(\"#profile-edit\").hide();\n");
      out.write("                    editStatus = false;\n");
      out.write("                    $(this).text(\"Edit\");\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <!--now add post js-->\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("        $(document).ready(function () {\n");
      out.write("\n");
      out.write("            $(\"#addPostForm\").on(\"submit\", function (event) {\n");
      out.write("                event.preventDefault();\n");
      out.write("                let form = new FormData(this);\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"AddPostServlet\",\n");
      out.write("                    type: \"post\",\n");
      out.write("                    data: form,\n");
      out.write("                    success: function (data, textStatus, jqXHR) {\n");
      out.write("                        if (data.trim() == \"done\") {\n");
      out.write("                            swal(\"Good Job\", \"You have successfully posted...\", \"success\");\n");
      out.write("                        } else {\n");
      out.write("                            swal(\"Sorry!\", \"Something went wrong try again...\", \"danger\");\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("\n");
      out.write("                    },\n");
      out.write("                    processData: false,\n");
      out.write("                    contentType: false,\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function deletePost(postId){\n");
      out.write("              console.log(postId);\n");
      out.write("              const d = {\n");
      out.write("                  pid: postId\n");
      out.write("              };\n");
      out.write("              $.ajax({\n");
      out.write("                  url: \"DeleteServlet\",\n");
      out.write("                  data: d,\n");
      out.write("              });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
