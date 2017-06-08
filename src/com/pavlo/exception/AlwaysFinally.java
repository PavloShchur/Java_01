package com.pavlo.exception;

class FourSxception extends Exception{};

public class AlwaysFinally {
		public static void main(String[] args) {
	System.out.println("Входимо  в перший блок try.");
		try {
			System.out.println("Входимо  в другий блок try.");
				try {
					throw new FourSxception();
				} finally {
					System.out.println("Finally в стрічці блоку try.");
				}
		} catch (FourSxception e) {
			System.out.println("Перехоплено FourException  в першому блок try.");
		} finally {
			System.out.println("Finally в першому блоці try.");

		}
	}

}
