package com.venta.pasajes;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Boleto;
import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.service.BoletoService;
import com.venta.pasajes.service.UsuarioService;
import com.venta.pasajes.util.Constantes;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BoletoServiceIntegrationTest {

	@Autowired
	private BoletoService boletoService; 
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	String uriAsiento 	= "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/{idAsiento}";
	
	@Test
	public void registrarBoletoTest(){
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		String jsonAsiento = restTemplate.getForObject(uriAsiento, String.class,1);
		Asiento asiento = gson.fromJson(jsonAsiento, Asiento.class);
		
		Usuario usuario = usuarioService.buscarUsuario("JROA","123456");		
		Boleto boleto = boletoService.registrarBoleto(asiento, usuario);
		Assert.assertEquals(2,boleto.getIdBoleto());
	}
	
	@Test
	public void getListaTest(){
		Assert.assertEquals(2, boletoService.getLista().size());
	}
}
