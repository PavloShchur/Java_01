package programmingBasics;


public class SingletoneMain {

	public static void main(String[] args) {
		Singletone singletone = Singletone.getObj();
		singletone.setName("Ivan");
		singletone.setAge(30);
		System.out.println(singletone);
		
		Singletone singletone2 = Singletone.getObj();
		System.out.println(singletone2);
	}

}
		