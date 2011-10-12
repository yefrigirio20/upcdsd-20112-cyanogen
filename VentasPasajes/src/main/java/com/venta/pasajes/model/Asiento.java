package com.venta.pasajes.model;

public class Asiento {

	
	private int idAsiento;
	private Viaje viaje;
	private Usuario usuario;
	private int numAsiento;
	private int estado;
	
	public Asiento(){}
	
	public Asiento(int idAsiento, Viaje viaje, Usuario usuario, int numAsiento, int estado) {
		this.idAsiento = idAsiento;
		this.viaje = viaje;
		this.usuario = usuario;
		this.numAsiento = numAsiento;
		this.estado = estado;
	}
	
	public int getIdAsiento() {
		return idAsiento;
	}
	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}
	public Viaje getViaje() {
		return viaje;
	}
	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
}
