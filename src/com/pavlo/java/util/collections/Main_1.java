package com.pavlo.java.util.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main_1 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");
		hashSet.add("one");
		System.out.println(hashSet);
		System.out.println(hashSet);

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		linkedHashSet.add("one");
		System.out.println(linkedHashSet);
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(3);
		treeSet.add(1);
		//Alphabetical order
		System.out.println(treeSet);
		System.out.println(treeSet.ceiling(0));
		System.out.println(treeSet.floor(5));
		System.out.println(treeSet.higher(2));
		System.out.println(treeSet.lower(2));
	
	
	}

}
