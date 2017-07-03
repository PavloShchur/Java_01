package com.pavlo.generics;

public class SimpGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Узагальнення");
		tgObj.showTypes();
		
		int v = tgObj.getObject_1();
		System.out.println("Значення: " + v);
		
		String string = tgObj.getObject_2();
		System.out.println("Значення: " + string);
	}

}
