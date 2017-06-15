package com.pavlo.esceptions;

public class ThrowExample {

	public static void main(String[] args) {
		System.out.println("Hello in out competiton");
		checkPersonsForCompetition(10, 55);
	}
		static void checkPersonsForCompetition(int pAge, int pWeight){
			if(pAge < 12 && pWeight < 40) {
				throw new ArithmeticException("person doesn't fit");
			} else {
				System.out.println("You may proceed competition");
			}
		}
}
