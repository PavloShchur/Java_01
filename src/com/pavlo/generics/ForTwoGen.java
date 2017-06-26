package com.pavlo.generics;

public class ForTwoGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> twoGen = new TwoGen<Integer, String>(1, "World");
		System.out.println(twoGen);
		
		int val = twoGen.getObject_1();
		System.out.println(val);
		String word = twoGen.getObject_2();
		System.out.println(word);
		
		if (twoGen.isSame(new TwoGen<Integer, String>(1, "World"))){
			System.out.println("same");
		}

	}

}
