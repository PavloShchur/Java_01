package collections_framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LonkedHashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Zara", new Double(3434.34));
		lhm.put("Mahnaz", new Double(123.22));
		lhm.put("Ayan", new Double(1378.00));
		lhm.put("Daisy", new Double(99.22));
		lhm.put("Qadir", new Double(-19.08));
		
		// Get a set of the entries
		Set set = lhm.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Entry) i.next();
			System.out.println(me.getKey() + ": " + "\n" + me.getValue());
		}
		System.out.println();
		double balance = (double) lhm.get("Zara");
		lhm.put("Zara", new Double(balance + 1000));
		System.out.println("Zara's new balance:" + lhm.get("Zara"));
	}
	

}
