package com.pavlo.java.util.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);

	}

}
