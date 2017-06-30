package com.pavlo.annot_for_user;

public class Factorial {
	public static void main(String[] args) {

		System.out.println(factorial(5));
		System.out.println(factorial(0));
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(1));
		System.out.println(factorial(-1));
		System.out.println(factorial(-2));
		
	}

	public static int factorial(int n) {
		int result = 1;
		if (n > 0) {
			for (int i = 1; i < n + 1; i++) {
				result *= i;
			}
		} else {
			throw new IllegalArgumentException("You can put only positive numbers.");
		}
		return result;
	}
}
