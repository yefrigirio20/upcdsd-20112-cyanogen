package com.venta.pasajes.model;

import java.sql.Date;

public class Viaje {
	
	private int idViaje;
	private Agencia agenciaOrigen;
	private Agencia agenciaDestino;
	private Vehiculo bus;
	private Date fecha;
	private Date hora;
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
	public Vehiculo getBus() {
		return bus;
	}
	public void setBus(Vehiculo bus) {
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
