package com.venta.pasajes.dao;

import java.util.List;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Boleto;
import com.venta.pasajes.model.Usuario;

public interface BoletoDao {
	public Boleto registrarBoleto(Asiento asiento, Usuario usuario);
	public List<Boleto> getLista();
}
