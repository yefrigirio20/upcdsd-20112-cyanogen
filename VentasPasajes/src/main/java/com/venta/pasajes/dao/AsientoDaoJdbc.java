package com.venta.pasajes.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.FilaAsiento;
import com.venta.pasajes.util.Constantes;



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


	@Override
	public List<FilaAsiento> getFilaAsientos(Viaje viaje) {
		List<Asiento> listaAsientos = getAsientos(viaje);
		List<FilaAsiento> listaFilaAsientos = new ArrayList<FilaAsiento>();
		int contador=0;
		
		Asiento asientoA=null;
		Asiento asientoB=null;
		Asiento asientoC=null;
		Asiento asientoD=null;
		FilaAsiento filaAsiento = null;
		
		if (listaAsientos != null){
			for(Asiento asiento: listaAsientos){
				contador++;
				if (contador==1){asientoA = asiento;}
				if (contador==2){asientoB = asiento;}
				if (contador==3){asientoC = asiento;}
				if (contador==4){asientoD = asiento;}
				
				if(contador==4){
					contador=0;
					filaAsiento = new FilaAsiento();
					filaAsiento.setFilaAsientos(asientoA, asientoB, asientoC, asientoD);
					listaFilaAsientos.add(filaAsiento);
					asientoA=null; asientoB=null; asientoC=null; asientoD=null;
				}
			}
			
			if (asientoA!=null){
				filaAsiento = new FilaAsiento();
				filaAsiento.setFilaAsientos(asientoA, asientoB, asientoC, asientoD);
				listaFilaAsientos.add(filaAsiento);
			}
			
			return listaFilaAsientos;
		}
		return null;
	}

	@Override
	public Asiento buscarAsiento(int idAsiento) {
		
		Asiento asiento = null;
		String sql ="select idAsiento, idViaje, codUsuario, numAsiento, estado from asiento where idAsiento=?";
		try{
			Map<String,Object> row = getJdbcTemplate().queryForMap(sql,idAsiento);
			asiento = new Asiento();
			asiento.setIdAsiento(idAsiento);
			asiento.setViaje(viajeDao.buscarViaje((Integer)row.get("idViaje")));
			asiento.setUsuario(usuarioDao.buscarUsuario((String)row.get("codUsuario")));
			asiento.setNumAsiento((Integer)row.get("numAsiento"));
			asiento.setEstado((Integer)row.get("estado"));
			return asiento;
		}catch(Exception ex){
			return null;
		}
	}

	@Override
	public boolean asignarUsuario(Asiento asiento, Usuario usuario) {
		String sql="update asiento set codUsuario = ?, estado=? where idAsiento=?";
		try{
			getJdbcTemplate().update(sql, 
					usuario.getCodUsuario(), 
					Constantes.ASIENTO_VENDIDO,
					asiento.getIdAsiento());
			return true;
		}catch(Exception ex){
			return false;
		}
	}
	
}
