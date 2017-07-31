package com.pavlo.exception;

public class OurOwnException extends Exception {

	public OurOwnException(String message) {
		super(message);
	}
}

class Employee {
	public static void main(String[] args) {
		try {
			employAndTest(-2);
		} catch (Exception e) {
			System.out.println("Go back to work");
		}
	}

	static void employAndTest(int age) throws OurOwnException {
		if (age <= 0) {
			throw new OurOwnException("less than 0");
		} else {
			System.out.println("back to work");
		}
	}
}