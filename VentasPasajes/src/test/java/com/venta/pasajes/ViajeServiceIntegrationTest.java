package com.venta.pasajes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Bus;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.service.ViajeService;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ViajeServiceIntegrationTest {

	@Autowired
	private ViajeService viajeService;
	
	/*
	@Test
	public void consultarViajesTest() throws ParseException{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Agencia agenciaOrigen = new Agencia(1,null,null);
		Agencia agenciaDestino = new Agencia(2,null,null);
		Date fecha = formato.parse("09/09/2011");
		List<Viaje> listaViajes = new ArrayList<Viaje>();
		listaViajes = viajeService.consultarViajes(agenciaOrigen, agenciaDestino, fecha);
		Assert.assertNotNull(listaViajes);
	}
	*/
	
	@Test
	public void registrarViajeTest() throws ParseException {
		SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat hora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Viaje viaje = new Viaje();
		viaje.setAgenciaOrigen(new Agencia(1,null,null));
		viaje.setAgenciaDestino(new Agencia(2,null,null));
		viaje.setBus(new Bus(1,"",40,0));
		viaje.setFecha(fecha.parse("10/10/2011"));
		viaje.setHora(hora.parse("10/10/2011 14:00:00"));
		viaje.setCosto(50.00);
		Assert.assertEquals(true, viajeService.registrarViaje(viaje));
	}
	
	@Test
	public void consultarTarifasTest() throws ParseException{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Agencia agenciaOrigen = new Agencia(0,null,null);
		Agencia agenciaDestino = new Agencia(1,null,null);
		Date fecha = formato.parse("11/11/2011");
		Assert.assertEquals(1, viajeService.consultarTarifa(agenciaOrigen, agenciaDestino, fecha).size());
	}
	
}
