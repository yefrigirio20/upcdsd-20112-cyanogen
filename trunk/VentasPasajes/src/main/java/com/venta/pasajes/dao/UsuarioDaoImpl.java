package com.venta.pasajes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.util.ConexionBd;


public class UsuarioDaoImpl implements UsuarioDao{

	@Override
	public Usuario registrarUsuario(Usuario usuario) {
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql;
        try{
            cn = ConexionBd.getInstance().getConnection();
            sql = "insert into usuario(codUsuario, nomusuario, apepatUsuario, apematUsuario, tipoDocumento, numDocumento, sexo, email,password) values( ?, ?, ?, ?, ?, ?, ?, ?, ? )";
            pstm = cn.prepareStatement(sql);
            //ResultSet almacena los registros
        	pstm.setString(1, usuario.getCodUsuario());
        	pstm.setString(2, usuario.getNomUsuario());
        	pstm.setString(3, usuario.getApepatUsuario());
        	pstm.setString(4, usuario.getApematUsuario());
        	pstm.setInt(5, usuario.getTipoDocumento());
        	pstm.setString(6, usuario.getNumDocumento());
        	pstm.setInt(7, usuario.getSexo());
        	pstm.setString(8, usuario.getEmail());
        	pstm.setString(9, usuario.getPassword());
        	
            pstm.executeUpdate(sql); //Ejecutar SQL SELECT

            return usuario;
        }catch(SQLException ex){
        	System.out.println(ex.getMessage());
        }catch(Exception ex){
        	System.out.println(ex.getMessage());
        }finally{
            ConexionBd.getInstance().closeStatement(pstm);
            ConexionBd.getInstance().closeResulset(rs);
            ConexionBd.getInstance().closeConnection(cn);
            
        }	
        return null;				
	}

	@Override
	public void eliminarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario buscarUsuario(String codUsuario) {
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
            sql = "select * from usuario where codUsuario = ?";
            pstm = cn.prepareStatement(sql);
            //ResultSet almacena los registros
            pstm.setString(1, codUsuario);
            rs = pstm.executeQuery(); //Ejecutar SQL SELECT
            while(rs.next()){
            	usuario.setCodUsuario(rs.getString("codUsuario"));
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
