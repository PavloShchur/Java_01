package com.pavlo.chaining;

public class Person {
	
	private String name;
	private int age;
	public Person() {
		super();
	}
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
//	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
	
	public Person showPerson(){
		System.out.println(getName() + " " + getAge());
		return this;
	}
	
	

}
