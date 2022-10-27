/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.Gym01.Servelet;

import br.edu.ifpr.Gym01.Entites.Usuario;
import br.edu.ifpr.Gym01.Modal.ModalUsuario;
import java.io.IOException;
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

@WebServlet(name = "GerenciarCookies", urlPatterns = {"/GerenciarCookies"})
public class GerenciarCookies extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
          HttpSession sessao = request.getSession(false);
            
       
        
        if (sessao != null && sessao.getAttribute("autenticado") != null) {
            
                Usuario u = (Usuario)sessao.getAttribute("usuario");

            
                
               
                response.sendRedirect("MenuCliente");
                
        } else 
            {
            Cookie[] cookies = request.getCookies();
            boolean passouCookie = false;
            
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("manterLogado".equals(cookie.getName())) {
                   
                          sessao = request.getSession(true);
                          sessao.setAttribute("autenticado", true);        
                          response.sendRedirect("MenuCliente");
                          passouCookie = true;
                        break;
                            
                                
                               
                }      
            }       
        }
           if(!passouCookie)
                response.sendRedirect("Login");
        }  
  }
}
   


