/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package br.edu.ifpr.Filters;

import br.edu.ifpr.Gym01.Entites.Usuario;
import br.edu.ifpr.Gym01.Modal.ModalUsuario;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "FilterAdm",
        servletNames = { "MenuAdm", "CadastroPlano", "ListarPlanos", "ExcluirPlano", "AlterarPlano" })
public class FilterAdm implements Filter {

    @Override
    public void doFilter(ServletRequest req,
            ServletResponse res,
            FilterChain chain)
            throws IOException, ServletException {  
        
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        
        HttpSession sessao = request.getSession(false);

        if (sessao != null && sessao.getAttribute("autenticado") != null) {
            Usuario u = (Usuario) sessao.getAttribute("autenticado");
            if (u.getIsAdm()== true) {
                chain.doFilter(request, response);
            }else{
                response.sendRedirect("Login");
            }
        } else {
            response.sendRedirect("Login");
        }
    }

    }
    
    

