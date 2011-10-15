package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Boleto;
import com.venta.pasajes.model.Usuario;

@WebService
public interface BoletoService {
	public Boleto registrarBoleto(Asiento asiento, Usuario usuario);
	public List<Boleto> getLista();
}
