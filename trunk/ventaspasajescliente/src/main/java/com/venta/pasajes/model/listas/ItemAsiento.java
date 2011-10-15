package com.venta.pasajes.model.listas;

import com.venta.pasajes.model.Asiento;

public class ItemAsiento {
	private int item;
	private Asiento asiento;
	
	public ItemAsiento(int item, Asiento asiento) {
		this.item = item;
		this.asiento = asiento;
	}
	
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public Asiento getAsiento() {
		return asiento;
	}
	public void setAsiento(Asiento asiento) {
		this.asiento = asiento;
	}
	
}
