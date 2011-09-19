package com.venta.pasajes.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.dao.ViajeDao;
import com.venta.pasajes.dao.ViajeDaoImpl;
import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;

@WebService(endpointInterface="com.venta.pasajes.service.ViajeService")
public class ViajeServiceImpl implements ViajeService {

	private ViajeDao viajeDao = new ViajeDaoImpl();

	@Override
	public List<Viaje> consultarViajes(Agencia agenciaOrigen,
			Agencia agenciaDestino, Date fecha) {
		
		return viajeDao.consultarViajes(agenciaOrigen, agenciaDestino, fecha);
	}
}
