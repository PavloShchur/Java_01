package programmingBasics;

public class Singletone {

	private static Singletone obj;
	private String name;
	private int age;

	private Singletone() {
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
		return "Singletone [name=" + name + ", age=" + age + "]";
	}

	public static Singletone getObj() {
		if (obj == null) {
			obj = new Singletone();
		}
		return obj;

	}

}
