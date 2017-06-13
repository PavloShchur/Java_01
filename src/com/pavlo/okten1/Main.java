package com.pavlo.okten1;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<Person>();

		linkedHashSet.add(new Person("Pavlo", "Shchur", 24, false));
		linkedHashSet.add(new Person("Petro", "Okten", 34, true));
		linkedHashSet.add(new Person("Roman", "Suchok", 44, true));
		linkedHashSet.add(new Person("Vlad", "Galin", 44, true));
		linkedHashSet.add(new Person("Bohdan", "Dovbush", 34, false));
		
		TreeSet<Person> linkedHashSetIntotreeSet = new TreeSet<Person>();
		linkedHashSetIntotreeSet.addAll(linkedHashSet);
		System.out.println("linkedHashSetIntotreeSet: " + linkedHashSetIntotreeSet);

		System.out.println(linkedHashSet);

		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("Pavlo", "Shchur", 24, false));
		treeSet.add(new Person("Petro", "Okten", 34, true));
		treeSet.add(new Person("Roman", "Suchok", 44, true));
		treeSet.add(new Person("Vlad", "Galin", 44, true));
		treeSet.add(new Person("Bohdan", "Dovbush", 34, false));
		
		System.out.println("TreeSet: " + treeSet);

		

		
		
////    System.out.println(list);
////    for (String s: list) {
////        System.out.println(s);
////    }
////    System.out.println(list.get(2));
////    System.out.println(list.contains("d"));
//////    System.out.println(list.remove("b"));
//////    System.out.println(list);
////    List<String>list2 = new ArrayList<>();
////    list2.add("q");
////    list2.add("w");
////    list2.add("e");
////    System.out.println(list.addAll(list2));
////    System.out.println(list);
////    System.out.println(list.contains("w"));
////    System.out.println(list.containsAll(list2));
////    System.out.println(list.isEmpty());
////    System.out.println(list.lastIndexOf("e"));
//////    System.out.println(list.removeAll(list2));
//////    System.out.println(list);
////    System.out.println(list.retainAll(list2));
////    System.out.println(list);
////    System.out.println(list.subList(1,3));
//
////    ArrayList<String> arrayList = new ArrayList<>();
////    arrayList.addAll(list);
////    System.out.println(arrayList);
////    arrayList.ensureCapacity(4);
////    System.out.println(arrayList);
////    arrayList.trimToSize();
//
//
//    LinkedList <String> linkedList = new LinkedList<>(list);
//    System.out.println(linkedList);
//    System.out.println(linkedList.getFirst());
//    System.out.println(linkedList.peek());
////    System.out.println(linkedList.poll());
////    System.out.println(linkedList);
//    System.out.println(linkedList.offer("s"));
//    System.out.println(linkedList);
//    System.out.println(linkedList.element());
//    linkedList.push("z");
//    System.out.println(linkedList);


   
//    System.out.println(people);

//    Iterator<Person> iterator = people.iterator();
//    while (iterator.hasNext()){
//        System.out.println(iterator.next());
//    }

//    while (iterator.hasNext()){
//        Person person = iterator.next();
//        if(person.getName().equals("vasya")){
//            iterator.remove();
//        }
//    }
//    System.out.println(people);

//    ListIterator<Person> listIterator = people.listIterator();
//	while (listIterator.hasNext()) {
//		System.out.println(listIterator.next());
//	}
//	System.out.println();
//	listIterator.set(new Person("Zina", 19));
//	while (listIterator.hasPrevious()) {
//		System.out.println(listIterator.previous());
//	}
//    System.out.println(people);

//    Collections.sort(list);
//    System.out.println(list);
//    System.out.println(people);
//    Collections.sort(linkedHashSet, new SortByAge());
//    System.out.println(people);
//
//    people.sort(new Comparator<Person>() {
//        @Override
//        public int compare(Person o1, Person o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    });
//
//    Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getName));
//    people.sort((o1, o2)->o1.getName().compareTo(o2.getName()));
	}
}