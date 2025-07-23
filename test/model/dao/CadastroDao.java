
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class CadastroDao {
    
    
    public void create(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{     
            stmt = con.prepareStatement("INSERT INTO tabela_usuario(nome_usuario,email_usuario,senha_usuario)VALUES(?,?,?)");
            
            
            stmt.setString(1,u.getNome_usuario());
            stmt.setString(2,u.getEmail_usuario());
            stmt.setString(3,u.getSenha_usuario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso !!");
            
         } catch (SQLException ex) {
                                   
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!!\n"+ex);

             
         }finally{
            ConnectionFactory.closseConnection(con, stmt);
        }
     }    

public List<Usuario> read() {
      
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    List<Usuario> usuarios = new ArrayList<>();
    
    try{
        stmt = con.prepareStatement("SELECT * FROM tabela_usuario");
        rs = stmt.executeQuery();
        
        while (rs.next()) {
        
            Usuario usuario = new Usuario();
            
            usuario.setId_usuario(rs.getInt("id_usuario"));
            usuario.setNome_usuario(rs.getString("nome_usuario"));
            usuario.setEmail_usuario(rs.getString("email_usuario"));
            usuario.setSenha_usuario(rs.getString("senha_usuario"));
            usuarios.add(usuario);
        }
    } catch (SQLException ex) { 
        Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,null, ex);
    } finally {
        ConnectionFactory.closseConnection(con, stmt, rs);
    }
    
    return usuarios;
  }

}