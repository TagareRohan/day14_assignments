package com.training.entity;

public abstract class Insurance {

	
	private int policyNumber;

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Insurance [policyNumber=" + policyNumber + "]";
	}

	public Insurance(int policyNumber) {
		super();
		this.policyNumber = policyNumber;
	}
}
