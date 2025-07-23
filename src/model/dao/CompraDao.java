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
import model.bean.Compra;
import model.bean.Jogo;

public class CompraDao {
  
    public void create(Compra cp){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{     
            stmt = con.prepareStatement("INSERT INTO tabela_compra(fk_id_usuario,fk_id_jogo,valor_compra)VALUES(?,?,?)");
           
            stmt.setInt(1,cp.getFk_id_usuario());
            stmt.setInt(2,cp.getFk_id_jogo());
            stmt.setDouble(3,cp.getValor_compra());
            
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso !!");
            
        } catch (SQLException ex) {
                                   
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR!!\n"+ex);

             
        }finally{
            ConnectionFactory.closseConnection(con, stmt);
        }
    }
        
        
    public List<Compra> readCompra(int id){
                
                Connection con = ConnectionFactory.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                List<Compra> compras = new ArrayList<>();
                
                try {
                    stmt = con.prepareStatement("SELECT tj.nome_jogo as tjn, tj.preco_jogo as tjp, tc.valor_compra as tcv FROM tabela_usuario tu inner JOIN tabela_compra tc ON (tu.id_usuario=tc.fk_id_usuario) inner JOIN tabela_jogos tj ON (tc.fk_id_jogo=tj.id_jogo) WHERE tu.id_usuario = ?");
                    stmt.setInt(1, id);
                    
                    rs = stmt.executeQuery();
                    
                    while (rs.next()) {
                        
                        Compra cp = new Compra ();
                    
                        cp.setValor_compra(rs.getInt("tcv"));
                        
                        Jogo j = new Jogo();
                        j.setNome_jogo(rs.getString("tjn"));
                        j.setPreco_jogo(rs.getDouble("tjp"));
                        
                        cp.setJogo(j);
                        
                        compras.add(cp);
                    }
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CompraDao.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    ConnectionFactory.closseConnection(con, stmt, rs);
                }
                
                return compras;
            
            
    }
    
}
