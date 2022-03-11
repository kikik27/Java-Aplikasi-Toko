package Panel_Login;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import koneksi.login;

public class login2 extends login{
    
    public boolean LoginUser(String uname, String pass) {
        boolean status = false;
        try{
            
            Class.forName(JDBC);  
            conn = DriverManager.getConnection(URL, username, password);  
              
            query = "SELECT * FROM LOGIN";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                if(uname.equals(rs.getString("username")) && pass.equals(rs.getString("password"))) {
                    status = true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
            
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
        return status;
    }
    public boolean LoginAdmin(String uname, String pass) {
        boolean status = false;
        try{
            
            Class.forName(JDBC);  
            conn = DriverManager.getConnection(URL, username, password);  
              
            query = "SELECT * FROM admin";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                if(uname.equals(rs.getString("username")) && pass.equals(rs.getString("password"))) {
                    status = true;
                }
            }
            rs.close();
            stmt.close();
            conn.close();
            
        } catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
        return status;
    }
}
