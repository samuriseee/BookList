/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.*;

/**
 *
 * @author HOME-SINGLE
 */
public class JDBCConnect {
    public static Connection getJDBCConnection() throws SQLException {
        final String url = "jdbc:sqlserver://SAMURISEEE:1433;databaseName = BooksList";
        final String login = "sa";
        final String password = "cabber123";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, login, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
}
