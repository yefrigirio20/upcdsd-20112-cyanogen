package com.venta.pasajes.service;


import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;

@WebService
public interface ViajeService {
	
	public List<Viaje> consultarViajes(
			Agencia agenciaOrigen, 
			Agencia agenciaDestino,
			Date fecha);
}
