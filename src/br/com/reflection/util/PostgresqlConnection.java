
package br.com.reflection.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        
        Connection connection;
        
        String user = "";
        String pass = "";
        String url = "jdbc:postgresql://localhost:5432/";
        
        Class.forName("org.postgresql.Driver");
        
        connection = DriverManager.getConnection(url, user, pass);
        
        return connection;
    }
    
}
