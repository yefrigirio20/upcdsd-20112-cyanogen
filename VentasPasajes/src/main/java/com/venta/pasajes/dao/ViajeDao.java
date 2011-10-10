package com.venta.pasajes.dao;


import java.util.Date;
import java.util.List;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.Tarifa;

public interface ViajeDao {
	public List<Viaje> consultarViajes(Agencia agenciaOrigen, Agencia agenciaDestino, Date fecha);
	public boolean registrarViaje(Viaje viaje);
	public List<Tarifa> consultarTarifas(Agencia agenciaOrigen, Agencia agenciaDestino, Date fecha);
}
