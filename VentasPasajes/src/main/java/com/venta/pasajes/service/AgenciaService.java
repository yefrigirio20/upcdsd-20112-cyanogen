package com.venta.pasajes.service;

import java.util.List;

import javax.jws.WebService;

import com.venta.pasajes.model.Agencia;

@WebService
public interface AgenciaService {
	public List<Agencia> getLista();
}
