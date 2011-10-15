package com.venta.pasajes.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Boleto;
import com.venta.pasajes.model.Usuario;

@Repository
public class BoletoDaoJdbc extends SimpleJdbcDaoSupport implements BoletoDao{
	
	@Autowired
	private AsientoDao asientoDao;
	
	@Autowired
	public BoletoDaoJdbc(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Override
	public Boleto registrarBoleto(Asiento asiento, Usuario usuario) {
		int idBoleto = 0;
		String sql = "select max(idBoleto) from Boleto";
		try{
			idBoleto = getJdbcTemplate().queryForInt(sql);
			idBoleto++;
		}catch(Exception ex){
			idBoleto++;
		}
		
		try{
			Date fecha = new Date();
			sql = "insert into Boleto(idBoleto,fecha,monto,idAsiento) values(?,?,?,?)";
			getSimpleJdbcTemplate().update(sql,
					idBoleto,
					fecha,
					asiento.getViaje().getCosto(),
					asiento.getIdAsiento());
		
			asientoDao.asignarUsuario(asiento, usuario);
		
			Boleto boleto = new Boleto();
			boleto.setIdBoleto(idBoleto);
			boleto.setFecha(fecha);
			boleto.setMonto(asiento.getViaje().getCosto());
			boleto.setAsiento(asiento);
			return boleto;
		}catch(Exception ex){
			return null;
		}	
	}

	public List<Boleto> getLista(){
		String sql="select idBoleto,fecha,monto,idAsiento from Boleto";
		List<Boleto>  boletos = new ArrayList<Boleto>();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for(Map<String,Object> row: rows){
			Boleto boleto = new Boleto();
			boleto.setIdBoleto((Integer)row.get("idBoleto"));
			boleto.setFecha((Date)row.get("fecha"));
			boleto.setMonto((Double)row.get("monto"));
			boleto.setAsiento(asientoDao.buscarAsiento((Integer)row.get("idAsiento")));
			boletos.add(boleto);
		}		
		return boletos;
	}
}
