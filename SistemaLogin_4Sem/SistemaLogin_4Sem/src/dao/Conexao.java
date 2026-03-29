package dao;

import java.sql.*;

public class Conexao {
    
    private static final String URL = "jdbc:mysql://localhost:3306/login_java_crud";
    private static final String USER = "";
    private static final String PASS = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}