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


public class UsuarioDao {
    
    public boolean checkLogin(String nome_usuario, String senha_usuario){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM tabela_usuario WHERE nome_usuario = ? and senha_usuario = ?");
            stmt.setString(1,nome_usuario);
            stmt.setString(2,senha_usuario);
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                check = true;
                
                
                
            
            }
        } catch (SQLException ex) { 
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt, rs);
        }
        
        return check;
    }
    
       
    public boolean checkInfor(String email_usuario, String nome_usuario){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM tabela_usuario WHERE email_usuario = ? AND nome_usuario = ?");
            stmt.setString(1,email_usuario);
            stmt.setString(2,nome_usuario);
            
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                check = true;

            }
        } catch (SQLException ex) { 
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt, rs);
        }
        
        return check;
        
    }
    
    public boolean checkSenha(String senha_usuario){
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM tabela_usuario WHERE senha_usuario = ?");
            stmt.setString(1,senha_usuario);
            
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                check = true;

            }
        } catch (SQLException ex) { 
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt, rs);
        }
        
        return check;
    
    }
    
    public void updateSenha(Usuario u){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE tabela_usuario SET senha_usuario=? WHERE nome_usuario=? and email_usuario=?");
            stmt.setString(1, u.getSenha_usuario());
            stmt.setString(2, u.getNome_usuario());
            stmt.setString(3, u.getEmail_usuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro ao alterar" + ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt);
        }
    }

    public void updateUsuario(Usuario u1){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE tabela_usuario SET nome_usuario=? WHERE senha_usuario=?");
            
            stmt.setString(1, u1.getNome_usuario());
            stmt.setString(2, u1.getSenha_usuario());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " NAMETAG ATUALIZADA COM SUCESSO");
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro ao alterar" + ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt);
        }
    }

    public void updateEmail(Usuario u2){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE tabela_usuario SET email_usuario=? WHERE senha_usuario=?");
            
            stmt.setString(1, u2.getEmail_usuario());
            stmt.setString(2, u2.getSenha_usuario());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " E-MAIL ATUALIZADO COM SUCESSO");
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro ao alterar" + ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt);
        }
    }

    public List<Usuario> read() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Usuario> usuarios = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT id_usuario, nome_usuario FROM tabela_usuario");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
            
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNome_usuario(rs.getString("nome_usuario"));
                usuarios.add(usuario);
                
            }
        } catch (SQLException ex) { 
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt, rs);
        }
        
        return usuarios;
    }

    
}