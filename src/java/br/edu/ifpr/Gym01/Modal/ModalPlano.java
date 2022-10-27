/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.Gym01.Modal;

import br.edu.ifpr.Gym01.Entites.Plano;
import java.sql.SQLException;

import br.edu.ifpr.Gym01.DAOs.PlanoDAO;
import java.util.ArrayList;
/**
 *
 * @author lucas
 */
public class ModalPlano {
    public void add(Plano p) throws SQLException{
        PlanoDAO dao = new PlanoDAO();
        dao.adicionar(p);
    }

    public ArrayList<Plano> listar() throws SQLException {
      
        PlanoDAO dao = new PlanoDAO();
        ArrayList<Plano> planos = dao.listar();
        
        return planos;
        
        
    }

    public Plano buscarIndex(int id) throws SQLException {
       
    PlanoDAO dao = new PlanoDAO();
    Plano p = dao.acharId(id);
        
        
        
        return p;
    }

    public void alterar(Plano p) throws SQLException {
    
     PlanoDAO dao = new PlanoDAO();
     dao.alterarPlano(p);
        
    
    }

    public void excluir(int id) throws SQLException {
        
     PlanoDAO dao = new PlanoDAO();
     dao.excluirPlano(id);
        
       }
    
    
   
}
