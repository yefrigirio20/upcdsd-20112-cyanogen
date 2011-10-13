package com.venta.pasajes;

import java.lang.reflect.Type;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.venta.pasajes.model.listas.FilaAsiento;
import com.venta.pasajes.util.Constantes;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-test.xml")
public class AsientoRestControllerIntegrationTest {
	private Logger logger = Logger
			.getLogger(AsientoRestControllerIntegrationTest.class);
	String uri = "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/{idViaje}";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Test
	public void getAsientosTest(){
		String jsonAsientos = restTemplate.getForObject(uri, String.class, 1);
		logger.debug(jsonAsientos);
		Assert.assertNotNull(jsonAsientos);
	}
	
	@Test
	public void getAsientosTestYNoEncontrar(){
		String jsonAsientos = restTemplate.getForObject(uri, String.class, 8);
		logger.debug(jsonAsientos);
		Assert.assertEquals("",jsonAsientos);
	}
	
	@Test
	public void getAsientosToArray(){
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		String jsonAsientos = restTemplate.getForObject(uri, String.class, 1);
		
		Type type = new TypeToken<List<FilaAsiento>>(){}.getType();
		List<FilaAsiento> listaFilaAsientos = gson.fromJson(jsonAsientos, type);
		
		Assert.assertEquals(10, listaFilaAsientos.size());
	}
}
