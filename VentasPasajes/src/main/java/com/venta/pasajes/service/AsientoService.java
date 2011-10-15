package com.venta.pasajes.service;

import java.util.List;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.FilaAsiento;

public interface AsientoService {
	public List<Asiento> getAsientos(Viaje viaje);
	public List<FilaAsiento> getFilaAsientos(Viaje viaje);
	public Asiento buscarAsiento(int idAsiento);
	public boolean asignarUsuario(Asiento asiento, Usuario usuario);
}
