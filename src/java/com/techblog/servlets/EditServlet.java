/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.servlets;

import com.techblog.dao.UserDao;
import com.techblog.entities.Message;
import com.techblog.entities.User;
import com.techblog.helper.ConnectionProvider;
import com.techblog.helper.ProfileSaver;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author SNEHA GUPTA
 */
@MultipartConfig
public class EditServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EditServlet</title>");
            out.println("</head>");
            out.println("<body>");

            //fetch all data from form
            String userName = request.getParameter("user_name");
            String userEmail = request.getParameter("user_email");
            String userPassword = request.getParameter("user_password");
            String userAbout = request.getParameter("about");

            Part part = request.getPart("image"); //fetching file
            
            
            String imageName = (String)part.getSubmittedFileName();
            //get the user from the session
            HttpSession session = request.getSession(); //object of session

            User user = (User) session.getAttribute("currentUser");
            String oldFileName = user.getProfile();
            
            System.out.println(oldFileName);
           
//            if(imageName.equals("")){
//                imageName = oldFileName;
//            }
            
            //updating details of the user
            user.setName(userName);
            user.setAbout(userAbout);
            user.setEmail(userEmail);
            user.setPassword(userPassword);
            user.setAbout(userAbout);                            
            user.setProfile(imageName);

            //storing in data base
            UserDao userDao = new UserDao(ConnectionProvider.getConnection());

            boolean f = userDao.updateUserInDatabase(user);

            if (f) {
                //updated to database

                String path = request.getRealPath("/") + "profile_pictures" + File.separator + user.getProfile();

                //delete code
               String oldFilePath = request.getRealPath("/") + "profile_pictures" + File.separator + oldFileName;
//                if(!oldFileName.equals("default.png")){
                    ProfileSaver.deleteFile(oldFilePath);
//                }
                

                //saving file code
                if (ProfileSaver.saveFile(part.getInputStream(), path)) {
                    out.println("Profle Updated");
                    

                    Message msg = new Message("Profile updated successfully", "success", "alert-success");

                    session.setAttribute("msg", msg);
                    response.sendRedirect("profile.jsp");
                } else {
                    out.println("profle not updated");
                    Message msg = new Message("Something Went wrong!", "danger", "alert-danger");
                    response.sendRedirect("profile.jsp");
                    
                    session.setAttribute("msg", msg);

                }
            } else {
                out.println("not updated");
                out.println("profile not updated");
                Message msg = new Message("Something Went wrong!", "danger", "alert-danger");
                response.sendRedirect("profile.jsp");
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
