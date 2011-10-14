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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.ItemAsiento;
import com.venta.pasajes.model.Viaje;
import com.venta.pasajes.model.listas.FilaAsiento;
import com.venta.pasajes.service.ViajeService;
import com.venta.pasajes.util.Constantes;

@Controller
public class AsientoController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ViajeService viajeService;
	
	public void setViajeService(ViajeService viajeService){
		this.viajeService = viajeService;
	}	
	
	@RequestMapping("/asiento.htm")
	public String getAsientos(@RequestParam("idViaje") int idViaje, Model model,HttpServletRequest request){

		String uri = "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/dist/{idViaje}";
		String jsonAsientos = restTemplate.getForObject(uri, String.class,idViaje);
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		Type type = new TypeToken<List<FilaAsiento>>(){}.getType();
		List<FilaAsiento> listaFilaAsientos = gson.fromJson(jsonAsientos, type);
		
		uri = "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/lista/{idViaje}";
		jsonAsientos = restTemplate.getForObject(uri, String.class,idViaje);
		gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();
		type = new TypeToken<List<Asiento>>(){}.getType();
		List<Asiento> listaAsientos = gson.fromJson(jsonAsientos, type);
		
		List<ItemAsiento> carrito = new ArrayList<ItemAsiento>();
		
		Viaje viaje = viajeService.buscarViaje(idViaje);
		
		model.addAttribute("listaFilaAsientos",listaFilaAsientos);
		model.addAttribute("listaAsientos",listaAsientos);
		model.addAttribute("viaje", viaje);
		model.addAttribute("carrito", carrito);
		
		model.addAttribute("cantidadAsientos", listaAsientos.size());
		
		HttpSession session = request.getSession(true);
		session.setAttribute("listaAsientos", listaAsientos);
		session.setAttribute("listaFilaAsientos", listaFilaAsientos);
		session.setAttribute("viaje", viaje);
		session.setAttribute("carrito", carrito);
		
		return "asiento";
	}
	
	@RequestMapping("/agregar_carrito.htm")
	public String agregarAsiento(HttpServletRequest request){
		
		return "carrito";
	}
}
