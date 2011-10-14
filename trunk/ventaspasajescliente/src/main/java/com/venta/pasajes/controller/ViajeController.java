package com.venta.pasajes.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.venta.pasajes.model.Agencia;
import com.venta.pasajes.service.AgenciaService;
import com.venta.pasajes.service.ViajeService;

@Controller
public class ViajeController {

	@Autowired
	private AgenciaService agenciaService;
	
	public void setAgenciaService(AgenciaService agenciaService){
		this.agenciaService = agenciaService;
	}
	
	@Autowired
	private ViajeService viajeService;
	
	public void setViajeService(ViajeService viajeService){
		this.viajeService = viajeService;
	}
	
	@RequestMapping(value="/itinerario.htm")
	public String openSeleccion(Model model){
		model.addAttribute("agencias",agenciaService.getLista());
		return "itinerario";
	}
	
	@RequestMapping(value="/itinerario_busqueda.htm")
	public String buscarViaje(	@RequestParam("txtFecha")String txtFecha,
								@RequestParam("cboOrigen")int idAgenciaOrigen,
								@RequestParam("cboDestino") int idAgenciaDestino,
								Model model,
								HttpServletRequest request) throws ParseException{
		
		Agencia agenciaOrigen = agenciaService.buscarAgencia(idAgenciaOrigen);
		Agencia agenciaDestino = agenciaService.buscarAgencia(idAgenciaDestino);
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = formatoFecha.parse(txtFecha);
		
		model.addAttribute("agenciaOrigen", agenciaOrigen);
		model.addAttribute("agenciaDestino", agenciaDestino);
		model.addAttribute("tarifas", viajeService.consultarTarifa(agenciaOrigen, agenciaDestino, fecha));
		
		
		
		return "viajelista";
	}
}
