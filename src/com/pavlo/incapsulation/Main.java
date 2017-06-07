package com.pavlo.incapsulation;

public class Main {
	
	public static void main(String[] args) {
		
//		Person person = new Person();
//		person.
		
		Person person = new Person("Peter", 30);
		System.out.println(person);
		System.out.println(person.getAge());
		person.setName("Vova");
		System.out.println(person);
		person.shout();
		person.newWord();
		
	}

}
