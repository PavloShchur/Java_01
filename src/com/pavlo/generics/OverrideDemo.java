package com.pavlo.generics;


public class OverrideDemo {

	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<Integer>(88);
//		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
		
		Gen2<String> strOb = new Gen2<String>("Тест узагальнення");
		System.out.println(iOb.getOb());
//		System.out.println(iOb2.getOb());
		System.out.println(strOb.getOb());

	}

}
