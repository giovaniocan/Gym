
package br.edu.ifpr.Gym01.Modal;

import br.edu.ifpr.Gym01.DAOs.UsuarioDAO;
import br.edu.ifpr.Gym01.Entites.Usuario;
import java.sql.SQLException;


public class ModalUsuario {
     public void add(Usuario u) throws SQLException{
      
       UsuarioDAO dao = new UsuarioDAO();
       dao.adcionar(u);
      
   }
    
    public boolean confirmarSenha(String senha, String confirmarSenha){
        
        if(senha.equals(confirmarSenha)){
            return true;
        }else{
            return false;
        }
        
    }
    
    public Usuario confirmarLogin (String senha, String email) throws SQLException{
        
        
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.confirmarLogin(senha, email);
        
        
        
        return u;
       
        
        
    }
    
    public Usuario acharId(String email) throws SQLException{
        
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.acharId(email);
        
        
        
        return u;
    }

    public void cadastrarPlano(int idPlano, int id) throws SQLException {
         UsuarioDAO dao = new UsuarioDAO();
        dao.cadastrarPlano(idPlano, id);
        
          }
   
    public void alterarPerfil(Usuario u) throws SQLException{
         UsuarioDAO dao = new UsuarioDAO();
         if ( u.getImg().length==0){
             dao.alterarPerfil(u);
        }else{
             dao.alterarPerfilcomImagem(u);
         }
         
        
        
        
    }

    public void alterarPlano(Usuario u, int idPlano) throws SQLException {
         UsuarioDAO dao = new UsuarioDAO();
         dao.alterarPlano(u, idPlano);
        }

    public Usuario buscarIndex(int id) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.buscarIndex(id);
        
        
        
        return u;
        }
  
}
