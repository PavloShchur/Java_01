package com.pavlo.exception;

class FourSxception extends Exception{};

public class AlwaysFinally {
		public static void main(String[] args) {
	System.out.println("�������  � ������ ���� try.");
		try {
			System.out.println("�������  � ������ ���� try.");
				try {
					throw new FourSxception();
				} finally {
					System.out.println("Finally � ������ ����� try.");
				}
		} catch (FourSxception e) {
			System.out.println("����������� FourException  � ������� ���� try.");
		} finally {
			System.out.println("Finally � ������� ����� try.");

		}
	}

}
