package com.venta.pasajes.dao;

import java.util.List;

import com.venta.pasajes.model.Bus;


public interface BusDao {
	public List<Bus> getLista();
	public Bus buscarBus(int idBus);
}

