package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.service.BusService;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BusServiceIntegrationTest {

	@Autowired
	private BusService busService;
	
	@Test
	public void getListaTest(){
		Assert.assertEquals(5,busService.getLista().size());
	}
	
	@Test
	public void buscarBusTest(){
		Assert.assertEquals("ABC-123",busService.buscarBus(1).getPlaca());
	}
	
	@Test
	public void buscarBusYNoEncontrarTest(){
		Assert.assertNull(busService.buscarBus(555));
	}
	
}
