package com.pavlo.java.util.collections;

import java.util.Comparator;

public class SortByChoice {

	public Comparator<Person> sortByChoice(int number) {
		switch (number) {
		case 1:
			return new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
		case 2:
			return new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					return o1.getAge() - o2.getAge();
				}
			};
		default:
			return new Comparator<Person>() {
				@Override
				public int compare(Person o1, Person o2) {
					return o1.getAge() - o2.getAge();
				}
			};
		}

	}

}
