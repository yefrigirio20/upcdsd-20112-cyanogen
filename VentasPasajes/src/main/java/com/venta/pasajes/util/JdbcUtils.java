package com.venta.pasajes.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtils {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL_CONNECTION = "jdbc:mysql://localhost/biblioteca?user=root&password=pablito";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER).newInstance();
            connection = DriverManager.getConnection(URL_CONNECTION);
        } catch (Exception e) {
            throw new IllegalStateException("Error al obtener Connection", e);
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Error al cerrar Connection", e);
        }
    }

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Error al cerrar Statement", e);
        }
    }

    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Error al cerrar ResultSet", e);
        }
    }

}