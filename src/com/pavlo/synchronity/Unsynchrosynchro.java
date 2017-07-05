package com.pavlo.synchronity;

public class Unsynchrosynchro {

	/*synchronized*/ void call(String s) {
		System.out.println(s + " {");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(s + "} ");
	}
}
