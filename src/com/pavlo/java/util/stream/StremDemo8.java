package com.pavlo.java.util.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StremDemo8 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Альфа");
		arrayList.add("Бетта");
		arrayList.add("Гама");
		arrayList.add("Дельта");
		arrayList.add("Ксі");
		arrayList.add("Омега");
		
		Stream<String> stream = arrayList.stream();
		Iterator<String> iterator = stream.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
	}

}
