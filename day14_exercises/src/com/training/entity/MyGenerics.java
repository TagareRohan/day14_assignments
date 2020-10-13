package com.training.entity;

public class MyGenerics <T> {

	private T object;
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public MyGenerics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	
	
}
