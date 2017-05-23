package Java_03;

public class Operator_If {

	public static void main(String[] args) {
		
		int price_tavria = 10000;
		int price_audi = 50000;
		int price_ferrari = 200000;
		
		int salary = 500000;
		
		if (salary >= price_tavria) {
			System.out.println("I can buy tavria");
		} else if (salary >= price_audi) {
			System.out.println("I can buy audi");
		} else if (salary >= price_ferrari) {
			System.out.println("I can buy ferrari");

		} else {
			System.out.println("I will go by bus");
		}

		
	}

}
