package com.pavlo.esceptions;

import java.util.Scanner;

public class FixException {

	public static void main(String[] args) {
		// try {
		// System.out.println(5 / 0);
		// } catch (ArithmeticException e) {
		// System.out.println("Ділити на 0 не можна");
		// } finally {
		// System.out.println("finally");
		// }
		int[] n = { -1, 1, 0 };
		int a = 1;
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				a = scanner.nextInt();
				n[a] = 4 / a;
				System.out.println(n[a]);
			} catch (ArithmeticException e) {
				 System.out.println("Ділити на 0 не можна");
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Ви вийшли за межі масиву");
			} catch (Exception e) {
				System.out.println("some exception");
			}
		}
	}
}
