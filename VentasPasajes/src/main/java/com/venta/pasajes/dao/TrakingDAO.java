package com.venta.pasajes.dao;

import java.util.List;

import com.venta.pasajes.model.Tracking;

public interface TrakingDAO {
	
	public int ingresarTraking(Tracking tracking);
	public List<Tracking> listarTrackring(); 

}
