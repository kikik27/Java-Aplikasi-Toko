/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ConnectionDb {
    static final String jdbc = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/penjualan";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection Connect(){
        try{
            Class.forName(jdbc);
           
        }catch (ClassNotFoundException cnf){
            
        }try{
            conn = (Connection) DriverManager.getConnection (url, user, pass);
            System.out.println("Koneksi DataBase Berhasil");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi DataBase gagal");
        } catch (HeadlessException e){
        }
        return conn;
        }       
}
