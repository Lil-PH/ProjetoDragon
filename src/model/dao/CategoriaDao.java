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
import model.bean.Categoria;

public class CategoriaDao {
    
    public List<Categoria> read() {
      
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Categoria> categorias = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM tabela_categorias");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
            
                Categoria categoria = new Categoria();
                categoria.setId_categoria(rs.getInt("id_categorias"));
                categoria.setNome_categoria(rs.getString("nome_Categoria"));
                categorias.add(categoria);
                
            }
        } catch (SQLException ex) { 
            Logger.getLogger(CategoriaDao.class.getName()).log(Level.SEVERE,null, ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt, rs);
        }
        
        return categorias;
    }

    public void update(Categoria ct){
            
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE tabela_categorias SET Nome_categorias=? WHERE id_categortias=?");
            
            stmt.setString(1, ct.getNome_categoria());
            stmt.setInt(2, ct.getId_categoria());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "ATUALIZADO COM SUCESSO");
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "Erro ao alterar" + ex);
        } finally {
            ConnectionFactory.closseConnection(con, stmt);
        }
    }
}
