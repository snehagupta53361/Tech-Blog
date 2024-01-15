/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techblog.servlets;

import com.techblog.dao.PostDao;
import com.techblog.entities.Posts;
import com.techblog.entities.User;
import com.techblog.helper.ConnectionProvider;
import com.techblog.helper.ProfileSaver;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import javax.websocket.Session;

@MultipartConfig
public class AddPostServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            Thread.sleep(3000);
            /* TODO output your page here. You may use following sample code. */
            
            
            int cid = Integer.parseInt(request.getParameter("cid"));
            String ptitle = request.getParameter("ptitle");
            String pContent = request.getParameter("pcontent");
            String pcode = request.getParameter("pcode");
            Part part = request.getPart("file");
            
            String fileName = part.getSubmittedFileName();
            
            //getting user from the session for userId
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("currentUser");
            
            int id = user.getId();
            //making post object so that we can set attributes in post attributes
            Posts post = new Posts(ptitle, pContent, pcode, fileName, cid, id);
            
            PostDao dao = new PostDao(ConnectionProvider.getConnection());
            
            boolean f = dao.savePostToDatabase(post);
            
            String path = request.getRealPath("/") + "blog-pictures" + File.separator + fileName;
                
            boolean save = ProfileSaver.saveFile(part.getInputStream(), path);
            
            if(f==true && save==true){
                
           
                out.println("done");
            }
            else{
                out.println("error");
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
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
