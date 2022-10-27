/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.Gym01.Servelet;

import br.edu.ifpr.Gym01.Entites.Plano;
import br.edu.ifpr.Gym01.Modal.ModalPlano;
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
@WebServlet(name = "AlterarPlano", urlPatterns = {"/AlterarPlano"})
public class AlterarPlano extends HttpServlet {

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
            
            int id = Integer.parseInt(request.getParameter("indice"));
            
         
            
            ModalPlano model = new ModalPlano();
            
            
            Plano p = model.buscarIndex(id);
            request.setAttribute("p", p);
            request.getRequestDispatcher("WEB-INF/alterarPlano.jsp").
                            forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(AlterarPlano.class.getName()).log(Level.SEVERE, null, ex);
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
        
        
        try {
            String descricao = request.getParameter("descricao");
            int valor = Integer.parseInt(request.getParameter("valor"));
            int id = Integer.parseInt(request.getParameter("id"));
            
            
            Plano p = new Plano(id, descricao, valor);
            
            ModalPlano model = new ModalPlano();
            
            model.alterar(p);
            request.getRequestDispatcher("WEB-INF/menuAdm.jsp").forward(request, response);
       
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AlterarPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
       
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
