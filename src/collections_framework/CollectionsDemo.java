package collections_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// ArrayList
		List a1 = new ArrayList();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" ArrayList Elements" + "\n" + "\t" + a1);
		
		// LinkedList
		List l1 = new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println("\n" + " LinkedList Elements" + "\n" + "\t" + l1);
				
		// HashSet
		Set s1 = new HashSet();
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println(" Set Elements" + "\n" + "\t" + s1);
		
		// HashMap
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println(" Map Elements" + "\n" + "\t" + m1);		

	}

}
