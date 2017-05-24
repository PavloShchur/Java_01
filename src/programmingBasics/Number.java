package programmingBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Please enter some nuber");
			int inputNumber = s.nextInt();
			String number = String.valueOf(inputNumber);
			int sum = 0;
			int newNumber = Integer.parseInt(number);
			List<Object> list = new ArrayList<>();
			for (int i = 0; i < number.length(); i++) {
				list.add(number.charAt(i));
				sum = sum + Integer.parseInt(list.get(i).toString());
			}
			System.out.println(sum);

		}
	}

}
