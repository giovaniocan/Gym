/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.Gym01.Servelet;

import br.edu.ifpr.Gym01.Entites.Usuario;
import br.edu.ifpr.Gym01.Modal.ModalUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author giovani
 */
@WebServlet(name = "MostrarImg", urlPatterns = {"/MostrarImg"})
public class MostrarImg extends HttpServlet {


  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         ModalUsuario model = new ModalUsuario();
        
        int id = Integer.parseInt(request.getParameter("id"));  
        
        
        try {
           Usuario u = model.buscarIndex(id);
            
            response.getOutputStream().write(u.getImg());
            response.setContentType(u.getImgtipo());
        } catch (SQLException ex) {
            Logger.getLogger(MostrarImg.class.getName()).log(Level.SEVERE, null, ex);
        
    }
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
