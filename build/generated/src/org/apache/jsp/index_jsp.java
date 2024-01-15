package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.techblog.entities.User;
import com.techblog.dao.UserDao;
import java.util.List;
import java.util.ArrayList;
import com.techblog.entities.Posts;
import com.techblog.dao.PostDao;
import com.techblog.helper.ConnectionProvider;
import java.sql.*;
import java.util.ArrayList;
import com.techblog.entities.Categories;
import com.techblog.dao.PostDao;
import com.techblog.helper.ConnectionProvider;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("\n");
      out.write("        <!--bootstrap css-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .p-heading{\n");
      out.write("                font-weight: 100;\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            .p-code{\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 100;\n");
      out.write("            }\n");
      out.write("            .p-content{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .user-info{\n");
      out.write("                border: 1px solid #e2e2e2;\n");
      out.write("                padding-top: 10px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/fontawesome.min.css\" integrity=\"sha512-siarrzI1u3pCqFG2LEzi87McrBmq6Tp7juVsdmGY1Dr8Saw+ZBAzDzrGwX3vgxX1NkioYNCFOVC0GpDPss10zQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\" integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("                <nav class=\"navbar navbar-expand-lg primary-background \">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <a class=\"navbar-brand text-white\" href=\"index.jsp\"><i class=\"fa-solid fa-blog\"></i>SnehaBlog</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link active text-white\" href=\"#\"><i class=\"fa-solid fa-code fa-flip\"></i>Learn code with me</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("           <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fa-regular fa-square-check\"></i>\n");
      out.write("            Categories\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"dropdown-menu \">\n");
      out.write("              ");

                  PostDao pdao = new PostDao(ConnectionProvider.getConnection());
                  
                  ArrayList<Categories> catg = new ArrayList();
                  
                  catg = pdao.getCategories();
                  for(Categories c: catg){
                      
                      
      out.write("\n");
      out.write("              <li><a class=\"dropdown-item \" href=\"#\">");
      out.print(c.getcName());
      out.write("</a></li>\n");
      out.write("              ");

                  }
              
      out.write("\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"contact.jsp\"><i class=\"fa-regular fa-address-book\"></i>Contact</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"loginpage.jsp\"><i class=\"fa-solid fa-user\"></i>Login</a>\n");
      out.write("        </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-white\" aria-disabled=\"true\" href=\"register.jsp\"><i class=\"fa-solid fa-user-plus\"></i>Sign Up</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <form class=\"d-flex\" role=\"search\">\n");
      out.write("        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--container-->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid primary-background text-white pt-5 pb-5 banner\">\n");
      out.write("\n");
      out.write("            <div class=\"main\">      \n");
      out.write("                <div class=\"container\">\n");
      out.write("\n");
      out.write("                    <h3 class=\"heading\">Welcome To SnehaBlog</h3>\n");
      out.write("                    <p class=\"mt-3\">Programming refers to a technological process for telling a computer which tasks to perform in order to solve problems. You can think of programming as a collaboration between humans and computers, in which humans create instructions for a computer to follow (code) in a language computers can understand.</p>\n");
      out.write("\n");
      out.write("                    <p class=\"mt-3\">When you browse a website to find information, contact a service provider, or make a purchase, programming allows you to interact with the site’s on-page elements, such as sign-up or purchase buttons, contact forms, and drop-down menus.\n");
      out.write("\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"buttons container\">\n");
      out.write("                <a  class=\"btn btn-outline-light btn-lg\" href=\"register.jsp\"><i class=\"fa-solid fa-user-plus\"></i>Start! Its free</a>\n");
      out.write("                <a class=\"btn btn-outline-light btn-lg\" href=\"loginpage.jsp\"><i class=\"fa-solid fa-user\"></i>Login</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--main-container, cards-->\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row my-3\">\n");
      out.write("                ");
                    PostDao postdao = new PostDao(ConnectionProvider.getConnection());
                    List<Posts> posts = postdao.getAllPosts();

                    for (Posts p : posts) {


                
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"card my-4\">\n");
      out.write("                        <div class=\"card-header primary-background text-white\">\n");
      out.write("                            <h3 class=\"p-heading\">");
      out.print(p.getpTitle());
      out.write("</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div>\n");
      out.write("                                <img class=\"card-img-top\" src=\"blog-pictures/");
      out.print(p.getpPic());
      out.write("\" style=\"height: 300px; width: 300px;\">\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"row my-3 user-info\">\n");
      out.write("                                ");

                                    UserDao ud = new UserDao(ConnectionProvider.getConnection());
                                    
                                    int userId = p.getUserId();
                                    User user = ud.getUserByUserId(userId);
                                   
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-8\">\n");
      out.write("                                    <p><a href=\"#\">");
      out.print(user.getName());
      out.write("</a> has posted this:</p>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <p class=\"p-content\">");
      out.print(p.getpContent());
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div>\n");
      out.write("                                <pre class=\"p-code\">");
      out.print(p.getpCode());
      out.write("</pre>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-footer\">\n");
      out.write("                            <a href=\"blog-post-details.jsp?post-id=");
      out.print(p.getPid());
      out.write("\" class=\"btn btn-outline-light primary-background\">Read More...</a>  \n");
      out.write("                            <a href=\"blog-post-details\" class=\"btn btn-outline-light primary-background\" ><i class=\"fa-solid fa-heart\"></i>10</a>\n");
      out.write("                            <a href=\"blog-post-details\" class=\"btn btn-outline-light primary-background\" ><i class=\"fa-solid fa-comment\"></i>20</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!--Javascript-->\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-3.7.1.min.js\"\n");
      out.write("            integrity=\"sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"javascript/main.js\" type=\"text/javascript\"></script>\n");
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
