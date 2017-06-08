package com.pavlo.java.util.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("Original contents of al: ");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Modify objects being iterated
		ListIterator litr = al.listIterator();
		while(litr.hasNext()){
			Object element = litr.next();
			litr.set(element + "+");
		}
		System.out.println("Modified contents of al: ");
		itr = al.iterator();
		while(itr.hasNext()){
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		// Now, display the list backwards
		System.out.println("Modified list backwards: ");
		while(litr.hasNext()){
			Object element = litr.next();
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
