package br.com.reflection.dao;

import br.com.reflection.util.PostgresqlConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractPGDAO implements IDAO{
    
    protected Connection connection;
   
    protected void openConnection(){
        
        try {
            if(connection == null || connection.isClosed())
                connection = PostgresqlConnection.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
