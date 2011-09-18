package com.venta.pasajes.model;

public class Recorrido {
	
	private int idRecorrido;
	private Tracking tracking;
	private String fechallegada;
	private String fechaSalida;
	private Agencia agencia;
	private int estado;
	
	
	public int getIdRecorrido() {
		return idRecorrido;
	}
	public void setIdRecorrido(int idRecorrido) {
		this.idRecorrido = idRecorrido;
	}
	public Tracking getTracking() {
		return tracking;
	}
	public void setTracking(Tracking tracking) {
		this.tracking = tracking;
	}
	public String getFechallegada() {
		return fechallegada;
	}
	public void setFechallegada(String fechallegada) {
		this.fechallegada = fechallegada;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

}
