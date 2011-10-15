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
import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.model.listas.FilaAsiento;
import com.venta.pasajes.util.Constantes;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext-test.xml")
public class AsientoRestControllerIntegrationTest {
	private Logger logger = Logger
			.getLogger(AsientoRestControllerIntegrationTest.class);
	
	String uriDist 		= "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/dist/{idViaje}";
	String uriLista 	= "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/lista/{idViaje}";
	String uriAsiento 	= "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/{idAsiento}";
	String uriBase		= "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/actualizar";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Test
	public void getAsientosTest(){
		
		String jsonAsientos = restTemplate.getForObject(uriDist, String.class, 1);
		logger.debug(jsonAsientos);
		Assert.assertNotNull(jsonAsientos);
	}
	
	@Test
	public void getAsientosTestYNoEncontrar(){
		String jsonAsientos = restTemplate.getForObject(uriDist, String.class, 8);
		logger.debug(jsonAsientos);
		Assert.assertEquals("",jsonAsientos);
	}
	
	@Test
	public void getFilaAsientosToArray(){
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		String jsonAsientos = restTemplate.getForObject(uriDist, String.class, 1);
		
		Type type = new TypeToken<List<FilaAsiento>>(){}.getType();
		List<FilaAsiento> listaFilaAsientos = gson.fromJson(jsonAsientos, type);
		
		Assert.assertEquals(10, listaFilaAsientos.size());
	}
	
	@Test
	public void getAsientosToArray(){
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		String jsonAsientos = restTemplate.getForObject(uriLista, String.class, 1);
		
		Type type = new TypeToken<List<Asiento>>(){}.getType();
		List<Asiento> listaAsientos = gson.fromJson(jsonAsientos, type);
		
		Assert.assertEquals(40, listaAsientos.size());
	}	

	
	@Test
	public void buscarAsientoTest(){
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		String jsonAsiento = restTemplate.getForObject(uriAsiento, String.class,1);
		Asiento asiento = gson.fromJson(jsonAsiento, Asiento.class);
		
		Assert.assertEquals(2,asiento.getNumAsiento());
	}
	
	@Test
	public void asignarUsuarioTest(){
		Asiento asiento = new Asiento();
		asiento.setIdAsiento(1);
		Usuario usuario = new Usuario();
		usuario.setCodUsuario("JROA");
		restTemplate.put(uriBase, asiento, usuario);

		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		String jsonAsiento = restTemplate.getForObject(uriAsiento, String.class,1);
		Asiento asiento2 = gson.fromJson(jsonAsiento, Asiento.class);
		
		Assert.assertEquals("Jonathan", asiento2.getUsuario().getNomUsuario());
	}	
	
	

}
