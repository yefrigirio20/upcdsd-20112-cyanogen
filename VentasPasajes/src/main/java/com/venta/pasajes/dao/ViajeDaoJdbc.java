package com.venta.pasajes.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.Tarifa;
import com.venta.pasajes.util.Constantes;

@Repository
public class ViajeDaoJdbc extends SimpleJdbcDaoSupport implements ViajeDao{

	private Logger logger = Logger
			.getLogger(ViajeDaoJdbc.class);
	
	@Autowired
	private BusDao busDao;
	
	@Autowired
	private AgenciaDao agenciaDao;
	
	@Autowired
	public ViajeDaoJdbc(DataSource dataSource){
		setDataSource(dataSource);
	}

	@Override
	public List<Viaje> consultarViajes(Agencia agenciaOrigen,
			Agencia agenciaDestino, Date fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registrarViaje(Viaje viaje) {
		try{
			String sql ="" +
					"insert into viaje (idAgenciaOrigen,idAgenciaDestino, idBus, fecha, hora, costo) " +
					"values (?,?,?,?,?,?)";
			
			getSimpleJdbcTemplate().update(sql, 
					viaje.getAgenciaOrigen().getIdAgencia(),
					viaje.getAgenciaDestino().getIdAgencia(),
					viaje.getBus().getIdBus(),
					viaje.getFecha(),
					viaje.getHora(),
					viaje.getCosto());
			
			sql = "select max(idViaje) from viaje";
			int idViaje = getJdbcTemplate().queryForInt(sql);
			
			for(int numAsiento=1; numAsiento <= viaje.getBus().getNumAsiento(); numAsiento++){
				sql = "insert into asiento(idViaje, numAsiento, estado) values (?,?,?)";
				getSimpleJdbcTemplate().update(sql, idViaje, numAsiento, Constantes.ASIENTO_DISPONIBLE);
			}
			
			return true;
		}catch(Exception ex){
			return false;
		}
	}

	@Override
	public List<Tarifa> consultarTarifas(Agencia agenciaOrigen,
			Agencia agenciaDestino, Date fecha) {
 	
		String sql= 
				"select v.idViaje, o.nombre as nombreOrigen, d.nombre as nombreDestino, b.placa, v.fecha, v.hora, v.costo " +
				"from viaje v, agencia o, agencia d, bus b " +
				"where " +
				"v.idAgenciaOrigen = o.idAgencia " +
				"and v.idAgenciaDestino = d.idAgencia " +
				"and v.idBus = b.idBus " +
				"and v.idAgenciaOrigen = ? and v.idAgenciaDestino = ? and v.fecha = ?";

		List<Tarifa> tarifas = new ArrayList<Tarifa>();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql,
				agenciaOrigen.getIdAgencia(),
				agenciaDestino.getIdAgencia(),
				fecha);
		
		for(Map<String,Object> row: rows){
			Tarifa tarifa = new Tarifa();
			tarifa.setIdViaje((Integer)row.get("idViaje"));
			tarifa.setNombreAgenciaOrigen((String)row.get("nombreOrigen"));
			tarifa.setNombreAgenciaDestino((String)row.get("nombreDestino"));
			tarifa.setPlacaBus((String)row.get("placa"));
			tarifa.setFecha((Date)row.get("fecha"));
			tarifa.setHora((Date)row.get("hora"));
			tarifa.setCosto((Double)row.get("costo"));
			tarifas.add(tarifa);
		}
		
		return tarifas;
	}

	@Override
	public Viaje buscarViaje(int idViaje) {
		Viaje viaje = null;
		String sql = "select idViaje, idAgenciaOrigen, idAgenciaDestino, idBus, fecha, hora, costo from viaje where idViaje = ?";
		try{
			Map<String,Object> row = getJdbcTemplate().queryForMap(sql,idViaje);
			viaje = new Viaje();
			viaje.setIdViaje((Integer)row.get("idViaje"));
			viaje.setAgenciaOrigen(agenciaDao.buscarAgencia((Integer)row.get("idAgenciaOrigen")));
			viaje.setAgenciaDestino(agenciaDao.buscarAgencia((Integer)row.get("idAgenciaDestino")));
			viaje.setBus(busDao.buscarBus((Integer)row.get("idBus")));
			viaje.setFecha((Date)row.get("fecha"));
			viaje.setHora((Date)row.get("hora"));
			viaje.setCosto((Double)row.get("costo"));
			
			return viaje;
		}catch(Exception ex){
			logger.debug(ex.getMessage());
			return null;
		}
		
	}
}
