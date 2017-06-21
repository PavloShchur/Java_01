package com.pavlo.java.util.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

public class URL {
	public static void main(String[] args) throws MalformedURLException {
		BufferedReader br = null;
		String someText = "";
		try {
			java.net.URL url = new java.net.URL("https://www.gutenberg.org/files/54914/54914.txt");
			try {
				InputStream inputStream = url.openStream();
				br = new BufferedReader(new InputStreamReader(inputStream));
				String lineText = "";
				while ((lineText = br.readLine()) != null) {
					someText += lineText;	
				}
				System.out.println();
				
			}catch (IOException e) {
				e.printStackTrace(); }
			} finally {
					if(br != null){
						try {
							br.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}}
					System.out.println(someText);
				}		}
