package com.pavlo.exception;

import java.io.FileInputStream;

public class MainException {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fileInputStream = new FileInputStream("MainException.java");
		fileInputStream.close();
	}

}
