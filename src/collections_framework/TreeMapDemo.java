package collections_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));
		
		// Get a set of the entries
		Set set = tm.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			System.out.println(me.getKey() + ": " + "\n" + me.getValue());
		}
		System.out.println();
		double balance = (double) tm.get("Zara");
		tm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance:" + tm.get("Zara"));
	}

}
