package com.pavlo.java.util.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharIO {

	public static void main(String[] args) {
		File file = new File("someText.txt");
//		FileWriter fv = null; // lazy initialization
//		System.out.println("Our file: " + file);
//		System.out.println("If file exists: " + file.exists());
//		System.out.println("File directory: " + file.isDirectory());
//		
//		try {
//			fv = new FileWriter(file);
//			fv.write("Hello");
//			fv.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(fv != null){
//				try {
//					fv.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			int chars;
			try {
				while ((chars = fr.read()) != -1) {
					System.out.println(Character.toChars(chars));
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
