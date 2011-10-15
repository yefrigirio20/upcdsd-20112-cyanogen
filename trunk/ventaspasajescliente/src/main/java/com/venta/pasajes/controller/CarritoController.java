package com.venta.pasajes.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.venta.pasajes.model.Asiento;
import com.venta.pasajes.model.listas.ItemAsiento;

@Controller
public class CarritoController {
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/carrito_agregar.htm")
	public String agregarItem(@RequestParam("numAsiento")int numAsiento, HttpServletRequest request, Model model){
		HttpSession session = request.getSession(true);
		List<ItemAsiento> carrito 	= (List<ItemAsiento>)session.getAttribute("carrito");
		List<Asiento> listaAsientos = (List<Asiento>)session.getAttribute("listaAsientos");
		boolean encontroItem = false;
		for(Asiento asiento : listaAsientos){
			if (asiento.getNumAsiento() == numAsiento){
				encontroItem = false;
				for(ItemAsiento itemAsiento : carrito){
					if(itemAsiento.getAsiento().getNumAsiento() == numAsiento){
						encontroItem = true;
						break;
					}
				}
				if (!encontroItem){
					carrito.add(new ItemAsiento(carrito.size() + 1,asiento));
				}
			}
		}
		
		model.addAttribute("carrito", carrito);
		session.setAttribute("carrito", carrito);
		
		return "carrito";
	}	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/carrito_eliminar.htm")
	public String eliminarItem(@RequestParam("numAsiento")int numAsiento,HttpServletRequest request, Model model){
		HttpSession session = request.getSession(true);
		List<ItemAsiento> carrito 	= (List<ItemAsiento>)session.getAttribute("carrito");
		List<ItemAsiento> carritoNuevo = new ArrayList<ItemAsiento>();  
		
		for(ItemAsiento itemAsiento : carrito){
			if(itemAsiento.getAsiento().getNumAsiento() != numAsiento){
				carritoNuevo.add(new ItemAsiento(carritoNuevo.size()+ 1,itemAsiento.getAsiento()));
			}
		}
		
		model.addAttribute("carrito",carritoNuevo);
		session.setAttribute("carrito", carritoNuevo);
		
		return "carrito";
	}
}
