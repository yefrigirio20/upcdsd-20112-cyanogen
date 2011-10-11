package com.venta.pasajes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.service.UsuarioService;

@ContextConfiguration("/applicationContext-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UsuarioServiceIntegrationTest {

	@Autowired
	private UsuarioService usuarioServicio;
	
	@Test
	public void buscarUsuarioTest(){
		Assert.assertEquals("42364208", usuarioServicio.buscarUsuario("JROA","123456").getNumDocumento());
	}
	
	@Test
	public void registrarUsuarioText(){
		Usuario usuario = new Usuario();
		usuario.setCodUsuario("ADMIN");
		usuario.setNomUsuario("Nombre");
		usuario.setApepatUsuario("Diaz");
		usuario.setApematUsuario("Hurtado");
		usuario.setNumDocumento("12345678");
		usuario.setEmail("elcorreo@hotmail.com");
		usuario.setPassword("abcd1234");
		
		Assert.assertEquals(true,usuarioServicio.registrarUsuario(usuario));
	}
	
	@Test
	public void getListaTest(){
		Assert.assertEquals(2,usuarioServicio.getLista().size());
	}
	
}
