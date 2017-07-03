package com.pavlo.generics;

public class NonGenDemo {

	public static void main(String[] args) {
		NonGen iOb;
		
		iOb = new NonGen(88);
		iOb.showType();
		
		int v = (Integer) iOb.getOb();
		System.out.println("Значення: " + v);
		System.out.println();
		
		NonGen strOb = new NonGen("Тест без узагальнення");
		strOb.showType();
		
		String string = (String) strOb.getOb();
		System.out.println("Значення: " + string);
		
		iOb = strOb;
		v = (Integer) iOb.getOb(); // помилка під час виконання
				}

}
