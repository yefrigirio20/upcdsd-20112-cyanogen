package com.venta.pasajes.model;

public class Viaje {
	
	private int idViaje;
	private Agencia agenciaOrigen;
	private Agencia agenciaDestino;
	private Bus bus;
	private String fecha;
	private String hora;
	private double costoVip;
	private double costoNegocio;
	private double costoEconomico;
	
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public double getCostoVip() {
		return costoVip;
	}
	public void setCostoVip(double costoVip) {
		this.costoVip = costoVip;
	}
	public double getCostoNegocio() {
		return costoNegocio;
	}
	public void setCostoNegocio(double costoNegocio) {
		this.costoNegocio = costoNegocio;
	}
	public double getCostoEconomico() {
		return costoEconomico;
	}
	public void setCostoEconomico(double costoEconomico) {
		this.costoEconomico = costoEconomico;
	}
	
	
	
}
