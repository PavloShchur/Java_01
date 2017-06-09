package com.pavlo.java.util.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by OKTEN on 07.06.2017.
 */
public class Main {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<String>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("a");
//        list.add("w");
////        System.out.println(list);
////        for (String s: list) {
////            System.out.println(s);
////        }
////        System.out.println();
////        System.out.println(list.size());
////        System.out.println(list.get(2));
////        System.out.println(list.contains("d"));
//////        System.out.println(list.remove("b"));
//////        System.out.println(list);
////        List<String>list2 = new ArrayList<>();
////        list2.add("q");
////        list2.add("w");
////        list2.add("e");
////        System.out.println(list.addAll(list2));
////        System.out.println(list);
////        System.out.println(list.contains("w"));
////        System.out.println(list.containsAll(list2));
////        System.out.println(list.isEmpty());
////        System.out.println(list.lastIndexOf("e"));
//////        System.out.println(list.removeAll(list2));
//////        System.out.println(list);
////        System.out.println(list.retainAll(list2));
////        System.out.println(list);
////        System.out.println(list.subList(1,3));
//
////        ArrayList<String> arrayList = new ArrayList<>();
////        arrayList.addAll(list);
////        System.out.println(arrayList);
////        arrayList.ensureCapacity(4);
////        System.out.println(arrayList);
////        arrayList.trimToSize();
//
//
//        LinkedList <String> linkedList = new LinkedList<>(list);
//        System.out.println(linkedList);
//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.peek());
////        System.out.println(linkedList.poll());
////        System.out.println(linkedList);
//        System.out.println(linkedList.offer("s"));
//        System.out.println(linkedList);
//        System.out.println(linkedList.element());
//        linkedList.push("z");
//        System.out.println(linkedList);


        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Peter", 30));
        people.add(new Person("vasya", 45));
        people.add(new Person("Olya", 19));
        people.add(new Person("vasylyna", 12));

//        System.out.println(people);

        Iterator<Person> iterator = people.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        while (iterator.hasNext()){
//            Person person = iterator.next();
//            if(person.getName().equals("vasya")){
//                iterator.remove();
//            }
//        }
//        System.out.println(people);

        ListIterator<Person> listIterator = people.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println();
		listIterator.set(new Person("Zina", 19));
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
        System.out.println(people);


    }
}
