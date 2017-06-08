package com.pavlo.java.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<Dog>();
		
		dogs.add(new Dog("Shaggy", 3));
		dogs.add(new Dog("Lacy", 2));
		dogs.add(new Dog("Roger", 10));
		dogs.add(new Dog("Tommy", 4));
		dogs.add(new Dog("Tammy", 1));
		Collections.sort(dogs);
		
		for (Dog dog : dogs) {
			System.out.print(dog.getName() + ", ");
		}
		
		Collections.sort(dogs, new Dog());
		System.out.println(" ");
		for (Dog dog : dogs) {
			System.out.print(dog.getName() + " : " + dog.getAge() + ", ");
		}

		
	}

}
