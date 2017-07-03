package com.pavlo.generics;


public class Gen2<T> extends Gen<String> {

	public Gen2(String ob) {
		super(ob);
		// TODO Auto-generated constructor stub
	}
	String getob() {
		System.out.println("Викликано метод String getob() : ");
		return ob;
	}
}
