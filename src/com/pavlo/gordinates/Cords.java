package com.pavlo.gordinates;

public class Cords<T extends TwoD> {

	T[] cords;
	

	public Cords() {
		super();
	}

	public Cords(T[] cords) {
		super();
		this.cords = cords;
	}

//	void showXY(Cords<TwoD> cords) {
//		System.out.println("cords x and y: ");
//		for (int i = 0; i < cords.cords.length; i++) {
//			System.out.println(cords.cords[i].x + " " + cords.cords[i].y);
//		}
//	}
//
//	static void showXYZ(Cords<ThreeD> cords) {
//		System.out.println("cords x and y: ");
//		for (int i = 0; i < cords.cords.length; i++) {
//			System.out.println(cords.cords[i].x + " " + cords.cords[i].y + " " + cords.cords[i].z);
//		}
//	}
//
//	static void showXYZT(Cords<FourD> cords) {
//		System.out.println("cords x and y: ");
//		for (int i = 0; i < cords.cords.length; i++) {
//			System.out.println(cords.cords[i].x + " " + cords.cords[i].y + cords.cords[i].z + cords.cords[i].t + "\t");
//		}
//	}
	
	void showXY(Cords<?> cords) {
		System.out.println("cords x and y: ");
		for (int i = 0; i < cords.cords.length; i++) {
			System.out.println(cords.cords[i].x + " " + cords.cords[i].y);
		}
	}

	static void showXYZ(Cords<? extends ThreeD> cords) {
		System.out.println("cords x and y: ");
		for (int i = 0; i < cords.cords.length; i++) {
			System.out.println(cords.cords[i].x + " " + cords.cords[i].y + " " + cords.cords[i].z);
		}
	}

	static void showXYZT(Cords<? extends FourD> cords) {
		System.out.println("cords x and y: ");
		for (int i = 0; i < cords.cords.length; i++) {
			System.out.println(cords.cords[i].x + " " + cords.cords[i].y + cords.cords[i].z + cords.cords[i].t + "\t");
		}
	}
}
