package com.pavlo.generics;

public class TwoGen <T, V>{
		
	T object_1;
	V object_2;
	public TwoGen(T object_1, V object_2) {
		super();
		this.object_1 = object_1;
		this.object_2 = object_2;
	}
	public T getObject_1() {
		return object_1;
	}
	public void setObject_1(T object_1) {
		this.object_1 = object_1;
	}
	public V getObject_2() {
		return object_2;
	}
	public void setObject_2(V object_2) {
		this.object_2 = object_2;
	}
	@Override
	public String toString() {
		return "ToGen [T = " + object_1 + ", V = " + object_2 + "]";
	}
	
	boolean isSame(TwoGen<T, V> o){
		boolean S = ((object_1 == o.object_1) && (object_2 == o.object_2))? true : false;
		if (object_1 == o.object_1 && object_2 == o.object_2){
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
