package com.venta.pasajes.dao;

import java.sql.Connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.util.List;
import com.venta.pasajes.model.Tracking;
import com.venta.pasajes.util.JdbcUtils;

public class TrakingDAOImpl implements TrakingDAO {

	@Override
	public int ingresarTraking(Tracking tracking) {
		int i = 0;
        Connection conn = JdbcUtils.getConnection();
        if (conn!= null){
            try {

          Statement st = conn.createStatement();
          String query="INSERT INTO tracking (idTracking,origen,destino,tipo,direccion,dniDestinatario,nomDestinatario,usuario) VALUES('"+tracking.getIdTracking()
                  +"','"+tracking.getOrigen() +"','"+tracking.getDestino()
                  +"','"+tracking.getTipo()+"','"+tracking.getDireccion()
                  +"','"+tracking.getNomDestinatario()+"','"+tracking.getUsuario().getNumDocumento()+"')";
           i = st.executeUpdate(query);
        } catch (Exception ex) {
            Logger.getLogger(TrakingDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else
            System.out.println("No se pudo conectar con la Base de Datos");

       return i;	
		
	}
	

	@Override
	public List<Tracking> listarTrackring() {
		
		return null;
	}

}
