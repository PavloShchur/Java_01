package com.pavlo.genInheritance;

public class Gen1 <T>{
	
	T t;
	
	

	public Gen1() {
		super();
	}

	public Gen1(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Gen1 [t=" + t + "]";
	}
	

}
