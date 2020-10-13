package com.training.entity;

public class VehicleInsurance extends Insurance {

	private String vehicleModel;

	public VehicleInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNumber) {
		super(policyNumber);
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNumber,String vehicleModel) {
		super(policyNumber);
		this.vehicleModel = vehicleModel;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleModel=" + vehicleModel + "]";
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
}
