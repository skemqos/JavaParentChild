package com.inheritance.vehicle;

public class Vehicle {

	String regNum;
	static int vehicleRegCount;
	
	public Vehicle(String regNum) {
		// TODO Auto-generated constructor stub
		this.regNum=regNum;
		vehicleRegCount++;
	}
	public static void getRegCount() {
		// TODO Auto-generated method stub
		System.out.println("Vehicle count="+vehicleRegCount);
	}
	public void getVehicleinfo() {
		// TODO Auto-generated method stub
		
	}

}
