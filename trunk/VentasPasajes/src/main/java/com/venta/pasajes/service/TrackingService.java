package com.venta.pasajes.service;

import java.util.List;

import com.venta.pasajes.model.Tracking;

public interface TrackingService {
	
	public int ingresarTraking(Tracking tracking);
	public List<Tracking> listarTrackring(); 

}
