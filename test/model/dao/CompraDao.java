package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Compra;

public class CompraDao {
  
        public void create(Compra cp){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{     
            stmt = con.prepareStatement("INSERT INTO tabela_compra(valor_compra)VALUES(?)");
           
            stmt.setDouble(1,cp.getValor_compra());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso !!");
            
         } catch (SQLException ex) {
                                   
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!!\n"+ex);

             
         }finally{
            ConnectionFactory.closseConnection(con, stmt);
        }
     }
    
}
