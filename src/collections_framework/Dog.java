package collections_framework;

import java.util.Comparator;

public class Dog implements Comparator<Dog>,  Comparable<Dog> {
	
	private String name;
	private int age;
	
	

	public Dog() {
	}
	
	

	public Dog(String name, int age) {
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
	public int compareTo(Dog o) {
		return this.name.compareTo(o.name);
	}

	@Override
	public int compare(Dog o1, Dog o2) {
		return o1.age - o2.age;
	}

}
