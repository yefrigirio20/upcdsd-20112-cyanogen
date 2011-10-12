package com.venta.pasajes.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Agencia;


@Repository
public class AgenciaDaoJdbc extends SimpleJdbcDaoSupport implements AgenciaDao{

	@Autowired
	public AgenciaDaoJdbc(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Override
	public List<Agencia> getLista() {
		String sql = "select idAgencia, nombre, direccion from agencia";
		return getSimpleJdbcTemplate().query(sql, new BeanPropertyRowMapper<Agencia>(Agencia.class));
	}

	@Override
	public Agencia buscarAgencia(int idAgencia) {
		try{
		String sql = "select idAgencia, nombre, direccion from agencia where idAgencia =?";
		return getSimpleJdbcTemplate().queryForObject(
				sql, new BeanPropertyRowMapper<Agencia>(Agencia.class),
				idAgencia);
		}catch(Exception ex){
			return null;
		}
	}

}
