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

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       processRequest(request, response);
   
            request.getRequestDispatcher("WEB-INF/login.jsp").
                        forward(request, response);
            
    
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String senha, email;

        senha = request.getParameter("senha");
        email = request.getParameter("email");

        ModalUsuario model = new ModalUsuario();

        try {
            Usuario u = model.confirmarLogin(senha, email);

            if (u != null) {
                HttpSession sessao = request.getSession(true);
                sessao.setAttribute("autenticado", true);
                sessao.setAttribute("autenticado", u);
                
                
                if (u.getIsAdm() == true) {
                    response.sendRedirect("MenuAdm");
                }else{
                    
                    if ("s".equals(request.getParameter("manter"))) {
                        Cookie cookie = new Cookie("manterLogado", u.getEmail()  );
                        cookie.setMaxAge(60 * 60 * 24 * 30);
                        response.addCookie(cookie);
                       
                    }
                     response.sendRedirect("MenuCliente");
                    
                         
                }
            } else {
                response.sendRedirect("Login");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
