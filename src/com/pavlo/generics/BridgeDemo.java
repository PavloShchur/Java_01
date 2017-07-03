package com.pavlo.generics;

public class BridgeDemo {

	public static void main(String[] args) {
		Gen2 strOb2 = new Gen2<>("Тест узагальнення");
		System.out.println(strOb2.getob());
		
		
	}

}
