package dbcon;

import java.sql.*;

public class ConnectionManager {
    static Connection conn=null;
    
    public static Connection getConnection() { 
        try { 
            String serverName = "localhost"; 
            String serverPort = "1521";
            String sid = "XE";
            String url = "jdbc:oracle:thin:@" +serverName+ ":" +serverPort+ ":" +sid ;
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
            try {
                 String username = "project"; 
                 String password = "project"; 
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("Connection connected on connection manager: ");
             } catch (SQLException ex) { ex.printStackTrace(); } 
        } catch(ClassNotFoundException e) { System.out.println(e); } 
        return conn; 
    } 
}
