package com.venta.pasajes.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.service.UsuarioService;
import com.venta.pasajes.service.UsuarioServiceImpl;

@Controller
public class UsuarioController {

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
		UsuarioService usuarioService = new UsuarioServiceImpl();
		codUsuario = request.getParameter("codUsuario");
		password = request.getParameter("password");
		
		usuario = usuarioService.buscarUsuario(codUsuario, password);
		
		if (usuario == null){
			return new ModelAndView("login");
		}else{
			return new ModelAndView("viajelista","usuario",usuario);
		}
		
		
	}
}
