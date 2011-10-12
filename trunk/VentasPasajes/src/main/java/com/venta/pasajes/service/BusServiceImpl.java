package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.venta.pasajes.dao.BusDao;
import com.venta.pasajes.model.Bus;

@WebService(endpointInterface="com.venta.pasajes.service.BusService")
public class BusServiceImpl implements BusService{

	@Autowired
	private BusDao busDao;
	
	@Override
	public List<Bus> getLista() {
		return busDao.getLista();
	}

	@Override
	public Bus buscarBus(int idBus) {
		return busDao.buscarBus(idBus);
	}

	
}
