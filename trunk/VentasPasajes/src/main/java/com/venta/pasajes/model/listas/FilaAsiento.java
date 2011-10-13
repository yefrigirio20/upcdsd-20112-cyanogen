package com.venta.pasajes.model.listas;

import com.venta.pasajes.model.Asiento;

public class FilaAsiento {
	private int existeAsientoA;
	private Asiento asientoA;
	private int existeAsientoB;
	private Asiento asientoB;
	private int existeAsientoC;
	private Asiento asientoC;
	private int existeAsientoD;
	private Asiento asientoD;

	public FilaAsiento(){
		this.existeAsientoA = 0;
		this.existeAsientoB = 0;
		this.existeAsientoC = 0;
		this.existeAsientoD = 0;		
	}

	public void setFilaAsientos(Asiento asientoA, Asiento asientoB, Asiento asientoC, Asiento asientoD){
		if(asientoA!=null){
			this.setAsientoA(asientoA);
			this.setExisteAsientoA(1);
		}
		
		if(asientoB!=null){
			this.setAsientoB(asientoB);
			this.setExisteAsientoB(1);
		}
		
		if(asientoC!=null){
			this.setAsientoC(asientoC);
			this.setExisteAsientoC(1);
		}
		
		if(asientoD!=null){
			this.setAsientoD(asientoD);
			this.setExisteAsientoD(1);
		}
	}
	
	public int getExisteAsientoA() {
		return existeAsientoA;
	}
	public void setExisteAsientoA(int existeAsientoA) {
		this.existeAsientoA = existeAsientoA;
	}
	public Asiento getAsientoA() {
		return asientoA;
	}
	public void setAsientoA(Asiento asientoA) {
		this.asientoA = asientoA;
	}
	public int getExisteAsientoB() {
		return existeAsientoB;
	}
	public void setExisteAsientoB(int existeAsientoB) {
		this.existeAsientoB = existeAsientoB;
	}
	public Asiento getAsientoB() {
		return asientoB;
	}
	public void setAsientoB(Asiento asientoB) {
		this.asientoB = asientoB;
	}
	public int getExisteAsientoC() {
		return existeAsientoC;
	}
	public void setExisteAsientoC(int existeAsientoC) {
		this.existeAsientoC = existeAsientoC;
	}
	public Asiento getAsientoC() {
		return asientoC;
	}
	public void setAsientoC(Asiento asientoC) {
		this.asientoC = asientoC;
	}
	public int getExisteAsientoD() {
		return existeAsientoD;
	}
	public void setExisteAsientoD(int existeAsientoD) {
		this.existeAsientoD = existeAsientoD;
	}
	public Asiento getAsientoD() {
		return asientoD;
	}
	public void setAsientoD(Asiento asientoD) {
		this.asientoD = asientoD;
	}
	
	
}
