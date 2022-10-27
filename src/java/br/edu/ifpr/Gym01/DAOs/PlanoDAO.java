/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.Gym01.DAOs;

import br.edu.ifpr.Gym01.ConnectionFactory.ConnectionFactory;
import br.edu.ifpr.Gym01.Entites.Plano;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class PlanoDAO {
     public void adicionar(Plano u) throws SQLException{
        String sql = "INSERT INTO PLANO (descrição, valor) VALUES (?, ?)";
      
        Connection connection = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, u.getDescricao());
        stmt.setInt(2, u.getValor());
         
        stmt.execute();
        stmt.close();
        connection.close();
    }

    public ArrayList<Plano> listar() throws SQLException {
        
             String sql = "SELECT ID,  DESCRIÇÃO, VALOR FROM PLANO";//talvez de errado
             
             ArrayList<Plano> planos = new ArrayList();
             
             Connection conexao = new ConnectionFactory().getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             
             ResultSet rs = stmt.executeQuery();
             while (rs.next()) {
                 Plano p = new Plano();
                 p.setId(rs.getInt("ID"));
                 p.setDescricao(rs.getString("DESCRIÇÃO"));
                 p.setValor(rs.getInt("VALOR"));
                 
                 planos.add(p);
             }
             
             conexao.close();
             return planos;
         
    }
    
    public Plano acharId(int id) throws SQLException{
        Plano p = new Plano();
        
         String sql ="SELECT DESCRIÇÃO, VALOR FROM PLANO WHERE ID = ?";
        
         Connection conexao = new ConnectionFactory().getConnection(); //cria conexao
        
        PreparedStatement stmt = conexao.prepareStatement(sql); // executa comandos
        
        stmt.setInt(1, id);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
           p = new Plano();
           p.setId(id);
           p.setDescricao(rs.getString("DESCRIÇÃO"));
           p.setValor(rs.getInt("VALOR"));

        }
        
        stmt.close();
        conexao.close();
        return p;
    }

    public void alterarPlano(Plano p) throws SQLException {
        
        String sql = "UPDATE PLANO SET VALOR = ?, DESCRIÇÃO = ? WHERE ID = ?";
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        int id = p.getId();
       
        stmt.setInt(1, p.getValor());
        stmt.setString(2, p.getDescricao());
        stmt.setInt(3, p.getId());
      
        
        
        stmt.execute();
        stmt.close();
        conexao.close();
     }

    public void excluirPlano(int id) throws SQLException {
        String sql = "DELETE FROM PLANO WHERE ID = ?";
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.execute();
        stmt.close();
        conexao.close(); }
}

