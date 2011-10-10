package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.venta.pasajes.dao.AgenciaDao;
import com.venta.pasajes.model.Agencia;

@WebService(endpointInterface="com.venta.pasajes.service.AgenciaService")
public class AgenciaServiceImpl implements AgenciaService{

	@Autowired
	private AgenciaDao agenciaDao;
	
	@Override
	public List<Agencia> getLista() {
		return agenciaDao.getLista();
	}

}
