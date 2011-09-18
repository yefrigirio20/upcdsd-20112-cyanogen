package com.venta.pasajes.model;

public class Tracking {
	
	private int idTracking;
	private Agencia origen;
	private Agencia destino;
	private int tipo; //1: agencia -- 2: domicilio
	private String direccion;
	private String dniDestinatario;
	private String nomDestinatario;
	private Usuario usuario;
	
	
	public int getIdTracking() {
		return idTracking;
	}
	public void setIdTracking(int idTracking) {
		this.idTracking = idTracking;
	}
	public Agencia getOrigen() {
		return origen;
	}
	public void setOrigen(Agencia origen) {
		this.origen = origen;
	}
	public Agencia getDestino() {
		return destino;
	}
	public void setDestino(Agencia destino) {
		this.destino = destino;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDniDestinatario() {
		return dniDestinatario;
	}
	public void setDniDestinatario(String dniDestinatario) {
		this.dniDestinatario = dniDestinatario;
	}
	public String getNomDestinatario() {
		return nomDestinatario;
	}
	public void setNomDestinatario(String nomDestinatario) {
		this.nomDestinatario = nomDestinatario;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
