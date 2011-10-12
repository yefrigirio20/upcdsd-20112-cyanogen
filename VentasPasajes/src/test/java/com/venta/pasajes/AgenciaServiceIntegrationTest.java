package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.service.AgenciaService;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AgenciaServiceIntegrationTest {

	@Autowired
	private AgenciaService agenciaService; 
	
	@Test
	public void getListaTest(){
		Assert.assertEquals(7, agenciaService.getLista().size());
	}
	
	@Test
	public void buscarAgenciaTest(){
		Assert.assertEquals("LIMA", agenciaService.buscarAgencia(0).getNombre());
	}
	
	@Test
	public void buscaAgenciaYNoEncontrar(){
		Assert.assertNull(agenciaService.buscarAgencia(9999));
	}
}
