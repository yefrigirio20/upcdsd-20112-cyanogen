package com.venta.pasajes.model;

public class Agencia {
	
	private int idAgencia;
	private String nombre;
	private String direccion;
	
	public Agencia(){
		
	}
	
	public Agencia(int idAgencia, String nombre, String direccion) {
		super();
		this.idAgencia = idAgencia;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
