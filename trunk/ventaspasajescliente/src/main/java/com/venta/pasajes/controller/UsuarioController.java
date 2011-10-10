package com.venta.pasajes.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException{
		
		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);
		
		return new ModelAndView("login","now",now);
	}
	
	@RequestMapping(value="/principal.htm")
	public ModelAndView validarLogin(HttpServletRequest request, HttpServletResponse response){
		
		String codUsuario, password;
		Usuario usuario = null;
		codUsuario = request.getParameter("codUsuario");
		password = request.getParameter("password");
		
		usuario = usuarioService.buscarUsuario(codUsuario, password);
		
		if (usuario == null){
			return new ModelAndView("login","claveErrada","claveErrada");
		}else{
			return new ModelAndView("viajelista","usuario",usuario);
		}
	}

	@RequestMapping(value="/abrir_registro_usuario.htm")
	public ModelAndView abrirRegistroUsuario(HttpServletRequest request, HttpServletResponse response){
		
		return new ModelAndView("usuario_nuevo");
	}
	
	@RequestMapping(value="/registrar_usuario.htm")
	public ModelAndView registarUsuario(HttpServletRequest request, HttpServletResponse response){
		Usuario usuario = new Usuario();
		
		usuario.setCodUsuario(request.getParameter("txtcodUsuario"));
		usuario.setApepatUsuario(request.getParameter("txtapellidoPaterno"));
		usuario.setApematUsuario(request.getParameter("txtapellidoMaterno"));
		usuario.setNomUsuario(request.getParameter("txtnombre"));
		usuario.setTipoDocumento(1);
		usuario.setNumDocumento(request.getParameter("txtdni"));
		usuario.setSexo(1);
		usuario.setEmail(request.getParameter("txtemail"));
		usuario.setPassword(request.getParameter("txtpassword"));
		
		if (usuarioService.registrarUsuario(usuario)){
			return new ModelAndView("viajelista","usuario",usuario);
		}else{
			return new ModelAndView("usuario_nuevo");
		}
	}
	
}
