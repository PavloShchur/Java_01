package com.pavlo.generics;

public class NonGen {

	Object object;

	public NonGen(Object object) {
		super();
		this.object = object;
	}

	public Object getObject() {
		return object;
	}

	void showType() {
		System.out.println("This on bject : " + object.getClass().getName());
	}

}
