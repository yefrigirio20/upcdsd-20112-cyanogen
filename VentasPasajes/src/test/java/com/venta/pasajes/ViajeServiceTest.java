package com.venta.pasajes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.service.ViajeService;
import com.venta.pasajes.service.ViajeServiceImpl;

public class ViajeServiceTest {

	@Test
	public void consultarViajesTest() throws ParseException{
		//java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Agencia agenciaOrigen = new Agencia(1,null,null);
		Agencia agenciaDestino = new Agencia(2,null,null);
		Date fecha = formato.parse("09/09/2011");
		ViajeService viajeService = new ViajeServiceImpl();
		List<Viaje> listaViajes = new ArrayList<Viaje>();
		listaViajes = viajeService.consultarViajes(agenciaOrigen, agenciaDestino, fecha);
		Assert.assertNotNull(listaViajes);
	}
}
