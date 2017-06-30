package com.pavlo.genInheritance;

import Java_09.Gen;

public class ForGen12 {
	
	public static void main(String[] args) {
		
		Gen1<Integer> iOb = new Gen1<>(99);
		Gen2<Integer> iOb2 = new Gen2<Integer>(99);
		Gen2<String> sOb2 = new Gen2<String>("Hello");
	
//		if (iOb2 instanceof Gen2<?>) System.out.println("iOb2 is from Gen2 ");
//		if (iOb2 instanceof Gen1<?>) System.out.println("iOb2 is from Gen1 ");
//		if (sOb2 instanceof Gen2<?>) System.out.println("iOb2 is from: ");
//		if (sOb2 instanceof Gen1<?>) System.out.println("iOb2 is from: ");
		System.out.println();
		
		if (iOb instanceof Gen2<?>) System.out.println("iOb2 is from Gen2 ");
		if (iOb instanceof Gen1<?>) System.out.println("iOb2 is from Gen1 ");
		
		
//		if (iOb instanceof Gen2<Integer>) System.out.println("iOb2 is from Gen1 "); // doesn't work
		
		
	}

}
