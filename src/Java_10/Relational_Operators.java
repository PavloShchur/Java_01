package Java_10;

public class Relational_Operators {

	public static void main(String[] args) {
		int number = 7;
		if (number > 5) {
			System.out.println("Дане число більше за пять");
		} else {
			System.out.println("Число менше за пять");
		}
		if (number < 11) {
			System.out.println("Дане число менше за 11");
		} else {
			System.out.println("Число більше за 11");
		}

		if (number == 10) {
			System.out.println("Дане число дорівнює 10");
		} else {
			System.out.println("Число не дорівнює 10");
		}

		if (number != 9) {
			System.out.println("Дане число не дорівнює 9");
		} else {
			System.out.println("Число дорівнює 9");
		}
		if (number >= 8) {
			System.out.println("Дане число більше або рівне 8");
		} else {
			System.out.println("Число менше за 8");
		}
		if (number <= 20) {
			System.out.println("Дане число менше або рівне 20");
		} else {
			System.out.println("Число більше за 20");
		}
	}

}
