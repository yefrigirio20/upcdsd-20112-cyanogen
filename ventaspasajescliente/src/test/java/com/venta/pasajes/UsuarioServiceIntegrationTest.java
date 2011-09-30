package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.service.UsuarioService;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UsuarioServiceIntegrationTest {

	@Autowired
	private UsuarioService usuarioService;
	
	@Test
	public void buscarUsuarioTest(){
		Assert.assertEquals("42364208", usuarioService.buscarUsuario("JROA","123456").getNumDocumento());
	}
	
	@Test
	public void noEncontrarUsuarioTest(){
		Assert.assertNull(usuarioService.buscarUsuario("USUARIO_ERRADO","CLAVE_ERRADA"));
	}	
}
