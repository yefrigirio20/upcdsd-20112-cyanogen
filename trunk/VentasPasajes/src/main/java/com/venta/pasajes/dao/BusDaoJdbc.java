package com.venta.pasajes.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.venta.pasajes.model.Bus;

@Repository
public class BusDaoJdbc extends SimpleJdbcDaoSupport implements BusDao{

	@Autowired
	public BusDaoJdbc(DataSource dataSource){
		setDataSource(dataSource);
	}
	
	@Override
	public List<Bus> getLista() {
		String sql = "select idBus, placa, numAsiento, estado from bus";
		return getSimpleJdbcTemplate().query(sql, new BeanPropertyRowMapper<Bus>(Bus.class));
	}

}
