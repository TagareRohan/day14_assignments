package com.training.entity;

public class LifeInsurance extends Insurance{

	public int age;

	public LifeInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber) {
		super(policyNumber);
		// TODO Auto-generated constructor stub
	}

	public LifeInsurance(int policyNumber,int age) {
		super(policyNumber);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "LifeInsurance [age=" + age + "]";
	}
	
	
}
