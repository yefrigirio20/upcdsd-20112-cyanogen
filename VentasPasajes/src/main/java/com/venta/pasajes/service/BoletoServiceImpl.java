package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.venta.pasajes.dao.BoletoDao;
import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Boleto;
import com.venta.pasajes.model.Usuario;

@WebService(endpointInterface="com.venta.pasajes.service.BoletoService")
public class BoletoServiceImpl implements BoletoService{

	@Autowired
	private BoletoDao boletoDao;
	
	@Override
	public Boleto registrarBoleto(Asiento asiento, Usuario usuario) {
		return boletoDao.registrarBoleto(asiento, usuario);
	}

	@Override
	public List<Boleto> getLista() {
		return boletoDao.getLista();
	}

}
