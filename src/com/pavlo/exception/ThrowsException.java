package com.pavlo.exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			someMethod(1);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void someMethod(int number) throws IOException, ClassNotFoundException {
		if(number == 1){
			throw new IOException("First Exception");
		} else {
			throw new ClassNotFoundException("Second Exception");
		}
	}

}
