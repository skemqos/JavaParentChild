package com.inheritance.vehicle;

public class Brand extends Vehicle {

	private String model;
	private String brand;
	public Brand(String brand, String model,  String regNum) {
		super(regNum);
		this.model = model;
		this.brand = brand;
	}
	public void getVehicleinfo() {
		// TODO Auto-generated method stub
		System.out.println("model="+this.model);
		
	}
}
