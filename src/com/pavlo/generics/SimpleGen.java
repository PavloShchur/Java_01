package com.pavlo.generics;

public class SimpleGen<T> {

	T t;

	public SimpleGen(T t) {
		super();
		this.t = t;
	}

	@Override
	public String toString() {
		return "SimpleGen [t=" + t + "]";
	}

}
