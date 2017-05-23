package Java_02;

import java.util.Scanner;

public class Calculator_Simple {

	public static void main(String[] args) {
		Scanner fromUser = new Scanner(System.in);
		
		double number_1, number_2, resultat;
		
		System.out.println("Please enter some number...");
		number_1 = fromUser.nextDouble();
		
		System.out.println("Please enter another number...");
		number_2 = fromUser.nextDouble();
		
		resultat = number_1 + number_2;
		System.out.print("Result: ");
		System.out.println(resultat);
		
	}

}
