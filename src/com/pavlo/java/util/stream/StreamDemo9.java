package com.pavlo.java.util.stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;


public class StreamDemo9 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Альфа");
		arrayList.add("Бетта");
		arrayList.add("Гама");
		arrayList.add("Дельта");
		arrayList.add("Ксі");
		arrayList.add("Омега");
		
		Stream<String> stream = arrayList.stream();
		Spliterator<String> spliterator = stream.spliterator();
		while(spliterator.tryAdvance((n) -> System.out.print(n)));
		
	}

}
