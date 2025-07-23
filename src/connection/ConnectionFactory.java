
package connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://ec2-3-209-39-2.compute-1.amazonaws.com:5432/ddicrkstiqstgj";
    private static final String USER = "bxvredcjergsxm";
    private static final String PASS = "2260849245320f353c84e3baae118358a917c773061a1048b6df17915626383f";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(" ERRO! !! !NA! !! !CONEÇÃO!! ",ex);
        }
    }
    
    public static void closseConnection(Connection con){
        try {
        
            if (con != null){
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null, ex);
        }
    }

    public static void closseConnection(Connection con, PreparedStatement stmt){
        
        closseConnection(con);
        
        try {
        
            if(stmt != null);
                stmt.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
    public static void closseConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closseConnection(con, stmt);
        
        try {
        
            if(rs != null);
                rs.close();
        
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    
}
