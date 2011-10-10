package com.venta.pasajes.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.venta.pasajes.dao.ViajeDao;
import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.Tarifa;

@WebService(endpointInterface="com.venta.pasajes.service.ViajeService")
public class ViajeServiceImpl implements ViajeService {

	@Autowired
	private ViajeDao viajeDao;
	
	
	@Override
	public List<Viaje> consultarViajes(Agencia agenciaOrigen,
			Agencia agenciaDestino, Date fecha) {
		
		return viajeDao.consultarViajes(agenciaOrigen, agenciaDestino, fecha);
	}

	@Override
	public boolean registrarViaje(Viaje viaje) {
		return viajeDao.registrarViaje(viaje);
	}

	@Override
	public List<Tarifa> consultarTarifa(Agencia agenciaOrigen,
			Agencia agenciaDestino, Date fecha) {
		
		return viajeDao.consultarTarifas(agenciaOrigen, agenciaDestino, fecha);
	}
}
