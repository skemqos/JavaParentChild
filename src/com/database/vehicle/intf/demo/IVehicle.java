package com.database.vehicle.intf.demo;

public interface IVehicle {
	default public long getSpeed() {
		return 0;
	}
	default public String getVehicleName() {
		return null;
	}
}
