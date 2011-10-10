package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Bus;

@WebService
public interface BusService {
	public List<Bus> getLista();
}
