package com.venta.pasajes.model;

public class Bus {
	
	private int idBus;
	private String placa;
	private int numAsiento;
	private int estado;

	public Bus(){
		
	}
	
	public Bus(int idBus, String placa, int numAsiento, int estado) {
		super();
		this.idBus = idBus;
		this.placa = placa;
		this.numAsiento = numAsiento;
		this.estado = estado;
	}
	
	public int getIdBus() {
		return idBus;
	}
	public void setIdBus(int idBus) {
		this.idBus = idBus;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
