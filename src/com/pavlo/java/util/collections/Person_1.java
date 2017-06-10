package com.pavlo.java.util.collections;

public class Person_1 {

	private String name;
	private int age;

	public Person_1() {
		super();
	}

	public Person_1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person_1 [name=" + name + ", age=" + age + "]";
	}

}
