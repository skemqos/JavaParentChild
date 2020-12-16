package com.inheritance.vehicle;


public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v1 = new Brand("Renault","Kwid","KA01MQ7049");
		Vehicle v2 = new Brand("Maruti","Alto","KA01MQ7050");
		
		Vehicle.getRegCount();
		v1.getVehicleinfo();
		v2.getVehicleinfo();
	}
}
