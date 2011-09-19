package com.venta.pasajes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.service.ViajeService;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class ViajeServiceIntegrationTest {

	@Autowired
	private ViajeService viajeService;
	
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
}
