package com.venta.pasajes.dao;

import java.sql.Date;
import java.util.List;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;

public interface ViajeDao {
	public List<Viaje> consultarViajes(Agencia agenciaOrigen, Agencia agenciaDestino, Date fecha);
}
