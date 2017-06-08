package com.pavlo.java.util.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		SortedSet set = new TreeSet();
		set.add("b");
		set.add("c");
		set.add("a");
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}
