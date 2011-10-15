package com.venta.pasajes.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.Usuario;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.FilaAsiento;
import com.venta.pasajes.model.listas.ItemAsiento;
import com.venta.pasajes.service.BoletoService;
import com.venta.pasajes.service.ViajeService;
import com.venta.pasajes.util.Constantes;

@Controller
public class BoletoController {

	@Autowired
	private RestTemplate restTemplate;	
	
	@Autowired
	private BoletoService boletoService;
	
	public void setBoletoService(BoletoService boletoService){
		this.boletoService = boletoService;
	}
	
	@Autowired
	private ViajeService viajeService;
	
	public void setViajeService(ViajeService viajeService){
		this.viajeService = viajeService;
	}		
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/registrar_boletos.htm")
	public String registrarBoletos(HttpServletRequest request, Model model){
		HttpSession session = request.getSession(true);
		List<ItemAsiento> carrito 	= (List<ItemAsiento>)session.getAttribute("carrito");
		Usuario usuario = (Usuario)session.getAttribute("usuario");

		for(ItemAsiento itemAsiento : carrito){
			Asiento asiento = itemAsiento.getAsiento();
			boletoService.registrarBoleto(asiento, usuario);
		}
		//--------------------------------------------------------------------------------------//
		carrito = new ArrayList<ItemAsiento>();
		Viaje viaje = (Viaje)session.getAttribute("viaje");

		
		String uri = "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/dist/{idViaje}";
		String jsonAsientos = restTemplate.getForObject(uri, String.class,viaje.getIdViaje());
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		Type type = new TypeToken<List<FilaAsiento>>(){}.getType();
		List<FilaAsiento> listaFilaAsientos = gson.fromJson(jsonAsientos, type);
		
		uri = "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/lista/{idViaje}";
		jsonAsientos = restTemplate.getForObject(uri, String.class,viaje.getIdViaje());
		gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		type = new TypeToken<List<Asiento>>(){}.getType();
		List<Asiento> listaAsientos = gson.fromJson(jsonAsientos, type);
		
		model.addAttribute("listaFilaAsientos",listaFilaAsientos);
		model.addAttribute("listaAsientos",listaAsientos);
		model.addAttribute("viaje", viaje);
		model.addAttribute("carrito", carrito);
		model.addAttribute("usuario", usuario);
		
		model.addAttribute("cantidadAsientos", listaAsientos.size());
		
		session.setAttribute("listaAsientos", listaAsientos);
		session.setAttribute("listaFilaAsientos", listaFilaAsientos);
		session.setAttribute("viaje", viaje);
		session.setAttribute("carrito", carrito);
		session.setAttribute("usuario", usuario);
		
		
		
		
		return "asiento";
	}
}
