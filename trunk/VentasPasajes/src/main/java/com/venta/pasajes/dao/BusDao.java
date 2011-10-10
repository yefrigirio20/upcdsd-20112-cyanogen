package com.venta.pasajes.dao;

import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Bus;

@WebService
public interface BusDao {
	public List<Bus> getLista();
}

