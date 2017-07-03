package com.pavlo.generics;

public class Gen <T> {
	T ob;

	public Gen(T ob) {
		super();
		this.ob = ob;
	}

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}
