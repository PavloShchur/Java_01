package com.pavlo.map.okten;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("one", 1);
		linkedHashMap.put("two", 2);
		linkedHashMap.put("three", 3);
		linkedHashMap.put("four", 4);
		linkedHashMap.put("one", 5);

		HashMap<String, Integer> treeMap = new HashMap<>(linkedHashMap);
		// Set<Entry<String, Integer>> entries = linkedHashMap.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = treeMap.entrySet().iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) entryIterator.next();
			if (entry.getValue() == 2) {
				entryIterator.remove();
				System.out.println(entry.getValue());
			}

		}
		System.out.println(treeMap);

		// ArrayList<Person> persons = new ArrayList<>();
		// persons.add(new Person("Pavlo", 24));
		// persons.add(new Person("Petro", 34));
		// persons.add(new Person("Roman", 44));
		// persons.add(new Person("Vlad", 44));
		// persons.add(new Person("Bohdan", 34));
		// HashMap<String, ArrayList<Person>> hashMap = new HashMap<>();
		// System.out.println(hashMap);
		//
		// ArrayList<String> osnova = new ArrayList<>();
		//

	}

}
