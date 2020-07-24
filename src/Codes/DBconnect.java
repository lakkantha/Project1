package Codes;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Lakkantha
 */

public class DBconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/project1","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
        
        
    }
    
}
