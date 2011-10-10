package com.venta.pasajes.model.listas;

import java.util.Date;

public class Tarifa {
	private int idViaje;
	private String nombreAgenciaOrigen;
	private String nombreAgenciaDestino;
	private String placaBus;
	private Date fecha;
	private Date hora;
	private Double costo;
	
	public int getIdViaje() {
		return idViaje;
	}
	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}
	public String getNombreAgenciaOrigen() {
		return nombreAgenciaOrigen;
	}
	public void setNombreAgenciaOrigen(String nombreAgenciaOrigen) {
		this.nombreAgenciaOrigen = nombreAgenciaOrigen;
	}
	public String getNombreAgenciaDestino() {
		return nombreAgenciaDestino;
	}
	public void setNombreAgenciaDestino(String nombreAgenciaDestino) {
		this.nombreAgenciaDestino = nombreAgenciaDestino;
	}
	public String getPlacaBus() {
		return placaBus;
	}
	public void setPlacaBus(String placaBus) {
		this.placaBus = placaBus;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	
	
}
