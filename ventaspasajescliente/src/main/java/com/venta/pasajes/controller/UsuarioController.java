package com.venta.pasajes.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.service.UsuarioService;


@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	public void setUsuarioService(UsuarioService usuarioService){
		this.usuarioService = usuarioService;
	}
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/login.htm")
	public String handleRequest(){
		return "login";
	}
	
	@RequestMapping(value="/principal.htm")
	public String validarLogin(	@RequestParam("codUsuario")String codUsuario,
								@RequestParam("password")String password,
								Model model){
		
		Usuario usuario = null;
		usuario = usuarioService.buscarUsuario(codUsuario, password);
		
		if (usuario == null){
			model.addAttribute("claveErrada", "claveErrada");
			return "login";
		}else{
			model.addAttribute("usuario", usuario);
			return "viajelista";
		}
	}
	
	@RequestMapping(value="/abrir_registro_usuario.htm")
	public String abrirRegistroUsuario(){
		return "usuario_nuevo";
	}
	
	@RequestMapping(value="/registrar_usuario.htm")
	public String registarUsuario(		@RequestParam("txtcodUsuario") String codUsuario,
										@RequestParam("txtapellidoPaterno")String apellidoPaterno,
										@RequestParam("txtapellidoMaterno")String apellidoMaterno,
										@RequestParam("txtnombre")String nombre,
										@RequestParam("txtdni")String dni,
										@RequestParam("txtemail")String email,
										@RequestParam("txtpassword")String password,
										Model model){
		
		Usuario usuario = new Usuario();
		usuario.setCodUsuario(codUsuario);
		usuario.setApepatUsuario(apellidoPaterno);
		usuario.setApematUsuario(apellidoMaterno);
		usuario.setNomUsuario(nombre);
		usuario.setNumDocumento(dni);
		usuario.setEmail(email);
		usuario.setPassword(password);
		
		if (usuarioService.registrarUsuario(usuario)){
			model.addAttribute("usuario", usuario);
			return "viajelista";
		}else{
			return "usuario_nuevo";
		}
	}
	
}
