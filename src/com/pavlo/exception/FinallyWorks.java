package com.pavlo.exception;

class ThreeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6640883636635533447L;
};

public class FinallyWorks {
	static int count = 0;
	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0) 
					throw new ThreeException();
					System.out.println("Немає помилки");
			} catch (ThreeException e) {
				System.out.println("ThreeException");
			} finally {
				System.out.println("В блоці finally");
				if (count == 2)
					break;
			}
		}

	}

}
