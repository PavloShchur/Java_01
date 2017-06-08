package com.pavlo.java.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("f");
		// System.out.println(list);
		// for (String string : list) {
		// System.out.print(string);
		// }

		// System.out.println(list.size());
		// System.out.println(list.get(2));
		// System.out.println(list.contains("d"));
		// System.out.println(list.remove("d"));
		// System.out.println(list);
		// List<String> list2 = new ArrayList<String>();
		// list2.add("q");
		// list2.add("v");
		// list2.add("qe");
		// System.out.println(list.addAll(list2));
		// System.out.println(list);
		// System.out.println(list.contains("w"));
		// System.out.println(list.contains(list2));
		// System.out.println(list.containsAll(list2));
		// System.out.println(list.isEmpty());
		// System.out.println(list.lastIndexOf("a"));
		// System.out.println(list.removeAll(list2));
		// System.out.println(list2.retainAll(list)); //delete all unique
		// elements
		// System.out.println(list2);
		// System.out.println(list.subList(1, 3));
//		System.out.println();
//		ArrayList<String> arrayList = new ArrayList<String>();
//		arrayList.addAll(list);
//		System.out.println(arrayList);
//		arrayList.ensureCapacity(4);
//		System.out.println(arrayList);
//		arrayList.trimToSize(); //delete cells which are empty
//		
		
		LinkedList<String> linkedList = new LinkedList<>(list);
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.peek());
//		System.out.println(linkedList.poll());
//		System.out.println(linkedList);
		System.out.println(linkedList.offer("f"));
		System.out.println(linkedList);
		System.out.println(linkedList.element());
		linkedList.push("z");
		System.out.println(linkedList);
		
	}

}

















