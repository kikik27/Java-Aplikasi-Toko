package koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class login {
    
    protected final String URL = "jdbc:mysql://localhost:3306/penjualan";
    protected final String JDBC = "com.mysql.jdbc.Driver";  
    protected Statement stmt = null;
    protected Connection conn = null;
    protected PreparedStatement preparedStmt;
    protected ResultSet rs;
    
    protected final String username = "root";
    protected final String password = "";
    protected String query = null;
    
    protected void notifErrorTryCatch(
            Exception e
    ) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
}
