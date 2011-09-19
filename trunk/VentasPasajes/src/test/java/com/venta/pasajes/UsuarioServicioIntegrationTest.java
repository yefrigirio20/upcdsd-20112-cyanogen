package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.service.UsuarioServicio;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UsuarioServicioIntegrationTest {

	@Autowired
	private UsuarioServicio usuarioServicio;
	
	@Test
	public void buscarUsuarioTest(){
		Assert.assertEquals("jroa_3000@hotmail.com", usuarioServicio.buscarUsuario("42364208").getEmail());
	}
	
}
