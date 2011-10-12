package com.venta.pasajes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Viaje;



@Repository
public class AsientoDaoJdbc extends SimpleJdbcDaoSupport implements AsientoDao{

	@Autowired
	private UsuarioDao usuarioDao;
	
	@Autowired
	private ViajeDao viajeDao;
	
	@Autowired
	public AsientoDaoJdbc(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Override
	public List<Asiento> getAsientos(Viaje viaje) {
		String sql ="select idAsiento, idViaje, codUsuario, numAsiento, estado from asiento where idViaje =?";
		
		Viaje viajeEncontrado = viajeDao.buscarViaje(viaje.getIdViaje());  
		
		if (viajeEncontrado != null){
			List<Asiento> asientos = new ArrayList<Asiento>();
			
			try{
				List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql,viaje.getIdViaje());
		
				for(Map<String,Object> row: rows){
					Asiento asiento= new Asiento();
					asiento.setIdAsiento((Integer)row.get("idAsiento"));
					asiento.setViaje(viajeEncontrado);
					asiento.setUsuario(usuarioDao.buscarUsuario((String)row.get("codUsuario")));
					asiento.setNumAsiento((Integer)row.get("numAsiento"));
					asiento.setEstado((Integer)row.get("estado"));
					asientos.add(asiento);
				}
				return asientos;
			}catch(Exception ex){
				return null;
			}
		}
		
		return null;
	}

}
