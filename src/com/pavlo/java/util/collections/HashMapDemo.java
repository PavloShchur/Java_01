package com.pavlo.java.util.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Zara", new Double(3434.34));
		hm.put("Mahnaz", new Double(123.22));
		hm.put("Ayan", new Double(1378.00));
		hm.put("Daisy", new Double(99.22));
		hm.put("Qadir", new Double(-19.08));
		
		// Get a set of the entries
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			System.out.println(me.getKey() + ": " + "\n" + me.getValue());
		}
		System.out.println();
		double balance = (double) hm.get("Zara");
		hm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance:" + hm.get("Zara"));
	}

}
