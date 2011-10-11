package com.venta.pasajes.service;


import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.Tarifa;

@WebService
public interface ViajeService {
	
	public List<Viaje> consultarViajes(
			Agencia agenciaOrigen, 
			Agencia agenciaDestino,
			Date fecha);
	
	public boolean registrarViaje(Viaje viaje);
	
	public List<Tarifa> consultarTarifa(
			Agencia agenciaOrigen, 
			Agencia agenciaDestino,
			Date fecha);
}
