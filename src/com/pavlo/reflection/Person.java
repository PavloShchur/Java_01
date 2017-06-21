package com.pavlo.reflection;

import java.io.Serializable;

public class Person implements Serializable {
	public int id;
	String name;
	private String sname = "some";
	 private final String surname;

	

	public Person(String surname) {
		this.surname = surname  = "Tom";
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sname=" + sname + ", surname=" + surname + "]";
	}



	public void word(String s, int number) {
		System.out.println(s);
		System.out.println(number);

	}

	void newWord() {
		System.out.println("asd");
	}

	@SuppressWarnings("unused")
	private int add(int b) {
		int a = 4;
		return a * b;
	}

}
