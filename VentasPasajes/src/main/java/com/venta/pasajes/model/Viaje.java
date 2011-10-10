package com.venta.pasajes.model;

import java.util.Date;

public class Viaje {
	
	private int idViaje;
	private Agencia agenciaOrigen;
	private Agencia agenciaDestino;
	private Bus bus;
	private Date fecha;
	private Date hora;
	private Double costo;
	
	public int getIdViaje() {
		return idViaje;
	}
	public void setIdViaje(int idViaje) {
		this.idViaje = idViaje;
	}
	public Agencia getAgenciaOrigen() {
		return agenciaOrigen;
	}
	public void setAgenciaOrigen(Agencia agenciaOrigen) {
		this.agenciaOrigen = agenciaOrigen;
	}
	public Agencia getAgenciaDestino() {
		return agenciaDestino;
	}
	public void setAgenciaDestino(Agencia agenciaDestino) {
		this.agenciaDestino = agenciaDestino;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
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
