package com.pavlo.massives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {

	private static long counter;
	private final long id = counter++;

	@Override
	public String toString() {
		return "Sphere " + id;
	}
}

public class ContainerComparison {

	public static void main(String[] args) {
		BerylliumSphere[] sheres = new BerylliumSphere[10];
		for(int i = 0; i < 5; i++)
			sheres[i] = new BerylliumSphere();
		System.out.println(Arrays.toString(sheres));
		
		List<BerylliumSphere> list = new ArrayList<BerylliumSphere>();
		for(int i = 0; i < 5; i++)
			list.add(new BerylliumSphere());
		System.out.println(list);
		System.out.println(list.get(4));
		
		int Integers[] = {0, 1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(Integers));
		System.out.println(Integers[4]);
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
		intList.add(97);
		System.out.println(intList);
		System.out.println(intList.get(4));
		}

}






