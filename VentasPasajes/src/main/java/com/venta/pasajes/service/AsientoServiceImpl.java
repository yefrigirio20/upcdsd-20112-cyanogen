package com.venta.pasajes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.pasajes.dao.AsientoDao;
import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Viaje;

@Service
public class AsientoServiceImpl implements AsientoService{
	
	@Autowired
	private AsientoDao asientoDao;
	
	@Override
	public List<Asiento> getAsientos(Viaje viaje) {
		return asientoDao.getAsientos(viaje);
	}

}
