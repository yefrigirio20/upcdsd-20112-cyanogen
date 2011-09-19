package com.venta.pasajes.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Vehiculo;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.util.ConexionBd;

public class ViajeDaoImpl implements ViajeDao{

	@Override
	public List<Viaje> consultarViajes(Agencia agenciaOrigen,
			Agencia agenciaDestino, Date fecha) {
		

		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		Viaje viaje = null;
		String sql;
		List<Viaje> listaViajes = new ArrayList<Viaje>();
        try{
            cn = ConexionBd.getInstance().getConnection();
            sql = "select * from viaje";
            pstm = cn.prepareStatement(sql);
            //ResultSet almacena los registros
            //pstm.setInt(1, agenciaOrigen.getIdAgencia());
            //pstm.setInt(2, agenciaDestino.getIdAgencia());
            //pstm.setDate(3, fecha);
            rs = pstm.executeQuery(); //Ejecutar SQL SELECT
            while(rs.next()){
            	viaje = new Viaje();
            	viaje.setIdViaje(rs.getInt("idViaje"));

            	viaje.setAgenciaOrigen(new Agencia(rs.getInt("idAgenciaOrigen"),null,null));
            	viaje.setAgenciaDestino(new Agencia(rs.getInt("idAgenciaDestino"),null,null));
            	viaje.setBus(new Vehiculo(rs.getInt("idBus"),null,1,1));
            	viaje.setFecha(rs.getDate("fecha"));
            	viaje.setHora(rs.getDate("hora"));
            	viaje.setCostoVip(rs.getDouble("costoVip"));
            	viaje.setCostoNegocio(rs.getDouble("costoNegocio"));
            	viaje.setCostoEconomico(rs.getDouble("costoEconomico"));
            	
            	listaViajes.add(viaje);
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
		return listaViajes;		
		
	}

}
