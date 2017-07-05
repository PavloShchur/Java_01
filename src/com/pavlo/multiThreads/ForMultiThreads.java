package com.pavlo.multiThreads;

public class ForMultiThreads {

	public static void main(String[] args) {
		new MultiThreads("one");
		new MultiThreads("two");
		new MultiThreads("three");

		try {
			Thread.sleep(10000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Main ended");
		}
	}

}
