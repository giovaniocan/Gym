/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.Gym01.DAOs;

import br.edu.ifpr.Gym01.ConnectionFactory.ConnectionFactory;
import br.edu.ifpr.Gym01.Entites.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UsuarioDAO {
    public void adcionar(Usuario u) throws SQLException{
        String sql = "INSERT INTO USUARIOS (nome, email, senha, isadm, id_plano, img, imgtipo) VALUES (?, ?, ?,?, ?, ?, ?)";
      
        Connection connection = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setBoolean(4, false);
        stmt.setInt(5, 1);
        stmt.setBytes(6, u.getImg());
        stmt.setString(7, u.getImgtipo());
         
        stmt.execute();
        stmt.close();
        connection.close();
    }
    
    public Usuario confirmarLogin(String senha, String email) throws SQLException{
        Usuario u = null;
        
        
        String sql ="SELECT ID, NOME, EMAIL, SENHA, ISADM, IMG, IMGTIPO FROM USUARIOS WHERE EMAIL = ? AND SENHA = ?";
        
         Connection conexao = new ConnectionFactory().getConnection(); //cria conexao
        
        PreparedStatement stmt = conexao.prepareStatement(sql); // executa comandos
        
        stmt.setString(1, email);
        stmt.setString(2, senha);
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            u = new Usuario();
           u.setId(rs.getInt("ID"));
           u.setEmail(rs.getString("EMAIL"));
           u.setSenha(rs.getString("SENHA"));
           u.setNome(rs.getString("NOME"));
           u.setIsAdm(rs.getBoolean("ISADM"));
           u.setImg(rs.getBytes("IMG"));
           u.setImgtipo(rs.getString("IMGTIPO"));
        }
        
        stmt.close();
        conexao.close();
        System.out.println(u.getId());
        return u;
        
}

    public Usuario acharId(String email) throws SQLException {
       
        Usuario u = new Usuario();
        
        String sql ="SELECT ID, NOME, EMAIL, SENHA, ISADM, IMG, IMGTIPO FROM USUARIOS WHERE EMAIL = ?";
        
         Connection conexao = new ConnectionFactory().getConnection(); //cria conexao
        
        PreparedStatement stmt = conexao.prepareStatement(sql); // executa comandos
        
        stmt.setString(1, email);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
           u = new Usuario();
           u.setId(rs.getInt("ID"));
           u.setNome(rs.getString("NOME"));
           u.setEmail(rs.getString("EMAIL"));
           u.setSenha(rs.getString("SENHA"));
           u.setIsAdm(rs.getBoolean("ISADM"));
           u.setImg(rs.getBytes("IMG"));
           u.setImgtipo(rs.getString("IMGTIPO"));
        }
        
        stmt.close();
        conexao.close();
        
        return u;
        
        
    
    }

    
    
    public void cadastrarPlano(int idPlano, int id) throws SQLException {
    
        
            String sql = "UPDATE USUARIOS SET ID_PLANO = ?  WHERE ID = ?";
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
       
        
        
        
        stmt.setInt(1, idPlano);
        stmt.setInt(2, id);
       
        
        stmt.execute();
        stmt.close();
        conexao.close();
    
    
    }
    
     public void alterarPerfil(Usuario u) throws SQLException {
        
        String sql = "UPDATE USUARIOS SET NOME = ?, EMAIL = ?, SENHA = ? WHERE ID = ?";
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        int id = u.getId();

        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setInt(4, u.getId());
      
        
        
        stmt.execute();
        stmt.close();
        conexao.close();
     }

       public void alterarPerfilcomImagem(Usuario u) throws SQLException {
        
        String sql = "UPDATE USUARIOS SET NOME = ?, EMAIL = ?, SENHA = ?, IMG=?,  IMGTIPO = ? WHERE ID = ?";
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        int id = u.getId();

        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setBytes(4, u.getImg());
        stmt.setString(5, u.getImgtipo());
        stmt.setInt(6, u.getId());
      
        
        
        stmt.execute();
        stmt.close();
        conexao.close();
     }

     
    public void alterarPlano(Usuario u, int idPlano) throws SQLException {
        String sql = "UPDATE USUARIOS SET ID_PLANO = ? WHERE ID = ?";
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        int id = u.getId();

        stmt.setInt(1, idPlano);  
        stmt.setInt(2, u.getId());
      
        
        
        stmt.execute();
        stmt.close();
        conexao.close();
       }

        
    
    public Usuario buscarIndex(int id) throws SQLException {
    
        Usuario u = new Usuario();
        
        String sql ="SELECT ID, NOME, EMAIL, SENHA, ISADM, IMG, IMGTIPO FROM USUARIOS WHERE ID = ?";
        
         Connection conexao = new ConnectionFactory().getConnection(); //cria conexao
        
        PreparedStatement stmt = conexao.prepareStatement(sql); // executa comandos
        
        stmt.setInt(1, id);
        
        
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
           u = new Usuario();
           u.setId(rs.getInt("ID"));
           u.setNome(rs.getString("NOME"));
           u.setEmail(rs.getString("EMAIL"));
           u.setSenha(rs.getString("SENHA"));
           u.setIsAdm(rs.getBoolean("ISADM"));
           u.setImg(rs.getBytes("IMG"));
           u.setImgtipo(rs.getString("IMGTIPO"));
        }
        
        stmt.close();
        conexao.close();
        
        return u;
        
        
    
    }
     

    
     

}
