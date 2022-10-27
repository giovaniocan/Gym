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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static org.glassfish.soteria.servlet.CookieHandler.getCookie;

/**
 *
 * @author giovani
 */


@WebServlet(name = "EfetuarCadastroPlanoCliente", urlPatterns = {"/EfetuarCadastroPlanoCliente"})
public class EfetuarCadastroPlanoCliente extends HttpServlet {

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
        try {
            processRequest(request, response);
            
            int idPlano = Integer.parseInt(request.getParameter("indice"));
            ModalUsuario model = new ModalUsuario();
       
           
          
            
            String email = "";
            
            
             Cookie[] cookies = request.getCookies();
            
            for (Cookie cookie : cookies) {
               email = cookie.getValue();
               Usuario u = model.acharId(email);
               int id = u.getId();
                
                model.cadastrarPlano(idPlano, id);
                 
            }
            response.sendRedirect("MenuCliente");
       
            
  
          
        } catch (SQLException ex) {
            Logger.getLogger(EfetuarCadastroPlanoCliente.class.getName()).log(Level.SEVERE, null, ex);
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
