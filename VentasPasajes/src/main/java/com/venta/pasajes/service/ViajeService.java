package com.venta.pasajes.service;


import java.util.Date;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;

@WebService
public interface ViajeService {
	public void listar();
	
	public void consultarViajes(
			Agencia agenciaOrigen, 
			Agencia agenciaDestino,
			Date fecha);
}
