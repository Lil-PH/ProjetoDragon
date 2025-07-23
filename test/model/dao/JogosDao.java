package model.dao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Categoria;
import model.bean.Jogo;

public class JogosDao {
       
    public void create(Jogo j){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{     
            stmt = con.prepareStatement("INSERT INTO tabela_jogos(nome_jogo,fk_id_categoria,preco_jogo)VALUES(?,?,?)");
           
            stmt.setString(1,j.getNome_jogo());
            stmt.setInt(2, j.getCategoria().getId_categoria());
            stmt.setDouble(3,j.getPreco_jogo());
                    
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso !!");
            
         } catch (SQLException ex) {
                                   
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!!\n"+ex);

             
         }finally{
            ConnectionFactory.closseConnection(con, stmt);
        }
     }
    
    public void create(Categoria ct){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{     
            stmt = con.prepareStatement("INSERT INTO tabela_categorias(nome_categoria)VALUES(?)");
           
            stmt.setString(1,ct.getNome_categoria());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso !!");
            
         } catch (SQLException ex) {
                                   
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!!\n"+ex);

             
         }finally{
            ConnectionFactory.closseConnection(con, stmt);
        }
     }
    
//public List<Jogo> read() {
//      
//    Connection con = ConnectionFactory.getConnection();
//    PreparedStatement stmt = null;
//    ResultSet rs = null;
//    
//    List<Jogo> jogos = new ArrayList<>();
//    
//    try{
//        stmt = con.prepareStatement("SELECT * FROM tabela_jogos");
//        rs = stmt.executeQuery();
//        
//        while (rs.next()) {
//        
//            Jogo jogo = new Jogo();
//            
//            jogo.setId_jogo(rs.getInt("id_jogo"));
//            jogo.setNome_jogo(rs.getString("nome_jogos"));
//            jogo.setCategoria(rs.getInt("fk_id_categoria"));
//            jogo.setPreco_jogo(rs.getDouble("preco_jogo"));
//            jogos.add(jogo);
//        }
//    } catch (SQLException ex) { 
//        Logger.getLogger(JogosDao.class.getName()).log(Level.SEVERE,null, ex);
//    } finally {
//        ConnectionFactory.closseConnection(con, stmt, rs);
//    }
//    
//    return jogos;
//  }
   
}

    

