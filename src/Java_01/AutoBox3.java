package Java_01;

public class AutoBox3 {

	public static void main(String[] args) {

		// Integer iOb1, iOb2;
		// int i;
		//
		// iOb1 = 100;
		// System.out.println("Вхідне значення iOb1: " + iOb1);
		// ++iOb1;
		// System.out.println("Після ++iOb1: " + iOb1);
		//
		// iOb2 = iOb1 + (iOb1 / 3);
		// System.out.println("iOb2 після виразу: " + iOb2);
		//
		// i = iOb1 + (iOb1 / 3);
		// System.out.println("i після виразу: " + i);

		// Integer iOb = 100;
		// Double dOb = 98.6;
		//
		// dOb = iOb + dOb;
		// System.out.println("dOb після виразу: " + dOb);

		Integer iOb = 2;

		switch (iOb) {
		case 1:
			System.out.println("один");
			break;
		case 2:
			System.out.println("два");
			break;
		default:
			System.out.println("помилка");
			break;
		}

	}

}
