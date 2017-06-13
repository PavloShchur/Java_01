package com.pavlo.okten1;

	public class Person implements Comparable<Person> {

		private String name;
		private String surname;
		private int age;
		private boolean car;

		public Person() {
		}

		public Person(String name, String surname, int age, boolean car) {
			super();
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.car = car;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean isCar() {
			return car;
		}

		public void setCar(boolean car) {
			this.car = car;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", car=" + car + "]";
		}

		@Override
		public int compareTo(Person o) {
			Person person = (Person) o;

			int sortByName = name.compareTo(o.getName());
			if (sortByName != 0) {
				return sortByName;
			}

			int sortByAge = age - o.getAge();
			if (sortByAge != 0) {
				return sortByAge;
			}
			return 0;
		}
	}


