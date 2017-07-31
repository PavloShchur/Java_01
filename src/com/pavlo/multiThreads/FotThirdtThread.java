package com.pavlo.multiThreads;

public class FotThirdtThread {

	public static void main(String[] args) {
		new FotThirdtThread();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Main " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("Main ended");
		}

	}
}
