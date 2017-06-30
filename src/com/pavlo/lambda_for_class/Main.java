package com.pavlo.lambda_for_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		// String inString = "Hello";
		// String outString;

		// first way
		// outString = OurStringOP.StringFumction(OurStringOP::strReverse,
		// inString);
		// System.out.println(outString);

		// second way
		// OurStringOP op = new OurStringOP();
		// outString = op.StringFumction(OurStringOP::strReverse, inString);
		// System.out.println(outString);

		// third way
		// outString = StringFumction(op::strReverse, inString);

		// int count;
		// HeighTemp[] heighTemps = { new HeighTemp(33), new HeighTemp(20), new
		// HeighTemp(11), new HeighTemp(33) };
		// count = counter(heighTemps, HeighTemp::sameTamt, new HeighTemp(33));
		// System.out.println(count);
//		HeighTemp[] lowTemps = {new HeighTemp(29), new HeighTemp(5), new HeighTemp(0), new HeighTemp(1)};
//		count = counter(lowTemps, HeighTemp::lessThenTemp, new HeighTemp(29));
//		System.out.println(count);
		
//		ArrayList<Person> people = new ArrayList<>();
//		people.add(new Person("Petro", 29));
//		people.add(new Person("Vova", 29));
//		people.add(new Person("Misha", 12));
//		people.add(new Person("borya", 5));
		
//		Collections.sort(people, new Comparator<Person>() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
//		System.out.println(people);
		
//		Collections.sort(people, (o1, o2) -> o1.getAge() -o2.getAge());
//		System.out.println(people);
//		
//		people.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
//		System.out.println(people);
		
		OurConstrFunction ourconstrFunction = OurClass::new;
		OurClass class1 = ourconstrFunction.func(99);
		System.out.println(class1.getVal());
		
	}
	
	// static String StringFumction(String_function sf, String s) {
	// return sf.func(s);
	// }

//	static <T> int counter(T[] v, OurFunction<T> f, T val) {
//		int count = 0;
//		for (int i = 0; i < v.length; i++) {
//			if (f.someMethod(v[i], val)) {
//				count++;
//			}
//		}
//		return count;
//	}
	
	

}
