package com.venta.pasajes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.util.ConexionBd;


public class UsuarioDaoImpl implements UsuarioDao{

	@Override
	public void registrarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarUsuario(String dni) {
		//Usuario usuario= null;
		//usuario = new Usuario();
		//usuario.setNumDocumento("42364208");
		
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Usuario usuario = new Usuario();
		String sql;
        try{
            cn = ConexionBd.getInstance().getConnection();
            sql = "select * from usuario where numDocumento = ?";
            pstm = cn.prepareStatement(sql);
            //ResultSet almacena los registros
            pstm.setString(1, dni);
            rs = pstm.executeQuery(); //Ejecutar SQL SELECT
            //Realizar un recorrido por ResultSet hasta el EOF (Final)
            while(rs.next()){
            	usuario.setNomUsuario(rs.getString("nomUsuario"));
            	usuario.setApepatUsuario(rs.getString("apepatUsuario"));
            	usuario.setApematUsuario(rs.getString("apematUsuario"));
            	usuario.setTipoDocumento(rs.getInt("tipoDocumento"));
            	usuario.setNumDocumento(rs.getString("numDocumento"));
            	usuario.setSexo(rs.getInt("sexo"));
            	usuario.setEmail(rs.getString("email")); 
            	usuario.setPassword(rs.getString("password"));
            }
        }catch(SQLException ex){
        	System.out.println(ex.getMessage());
        }catch(Exception ex){
        	System.out.println(ex.getMessage());
        }finally{
            ConexionBd.getInstance().closeStatement(pstm);
            ConexionBd.getInstance().closeResulset(rs);
            ConexionBd.getInstance().closeConnection(cn);
        }	
		return usuario;
		
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
