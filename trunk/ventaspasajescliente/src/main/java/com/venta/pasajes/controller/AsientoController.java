package com.venta.pasajes.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.venta.pasajes.model.listas.FilaAsiento;
import com.venta.pasajes.util.Constantes;

@Controller
public class AsientoController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/asiento.htm")
	public String getAsientos(@RequestParam("idViaje") int idViaje, Model model){

		String uri = "http://localhost:8080/apachecxf-jaxws-ventapasajes/services/restAsientoService/asiento/{idViaje}";
		String jsonAsientos = restTemplate.getForObject(uri, String.class,idViaje);
		Gson gson = new GsonBuilder().setPrettyPrinting().setDateFormat(Constantes.FORMATO_FECHA).create();

		Type type = new TypeToken<List<FilaAsiento>>(){}.getType();
		List<FilaAsiento> listaFilaAsientos = gson.fromJson(jsonAsientos, type);

		model.addAttribute("listaFilaAsientos",listaFilaAsientos);
		model.addAttribute("cantidad", listaFilaAsientos.size());
		
		return "asiento";
	}
	
	
}
