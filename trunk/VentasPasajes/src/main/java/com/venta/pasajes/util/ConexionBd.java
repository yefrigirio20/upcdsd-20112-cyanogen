package com.venta.pasajes.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ConexionBd {


    private static ConexionBd instance;

    private ConexionBd(){
    	
    }

    public static ConexionBd getInstance(){
        if(instance == null)
            instance = new ConexionBd();

        return instance;
    }

    public Connection getConnection() throws Exception{
        Connection cn = null;
        try{
            //Cargar el Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Obtener la Conexion a la BD
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/transporte","root","mysql");
        }catch(ClassNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return cn;
    }

    public void closeConnection(Connection cn){
        try {
            if (cn!=null)
            cn.close();
        } catch (SQLException ex) {
        	System.err.println(ex.getMessage());
        }
    }

    
    public void closeStatement(Statement stm){
        try {
            if (stm!=null)
            stm.close();
        } catch (SQLException ex) {
        	System.err.println(ex.getMessage());
        }
    }
      public void closeResulset(ResultSet rs){
        try {
            if (rs!=null)
            rs.close();
        } catch (SQLException ex) {
        	System.err.println(ex.getMessage());
        }
    }
}

