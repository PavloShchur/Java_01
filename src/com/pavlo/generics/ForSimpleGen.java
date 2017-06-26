package com.pavlo.generics;

public class ForSimpleGen {

	public static void main(String[] args) {
		
		SimpleGen<String> gen = new SimpleGen<String>("Hello");
		System.out.println(gen);
		
		SimpleGen<Integer> gen2 = new SimpleGen<Integer>(99);
		System.out.println(gen2);
		
	}

}
