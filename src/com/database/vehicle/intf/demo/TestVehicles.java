package com.database.vehicle.intf.demo;

public class TestVehicles {
	public static void main(String[] args) {
		
		IVehicle h1 = new Hyundai();
		
		h1 = new Renault();
		display(h1);
	}

	private static void display(IVehicle h1) {
		System.out.println("Max speed="+h1.getSpeed());
		System.out.println("VehicleName="+h1.getVehicleName());
	}

}
