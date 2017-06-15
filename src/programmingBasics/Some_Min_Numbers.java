package programmingBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Some_Min_Numbers {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers with whitespace");
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(Arrays.toString(getSomeLowest(scanner.nextInt(), scanner.nextInt())));
		}
	}

	private static int[] getSomeLowest(int N, int L) {
		int[] myArray = new int[L];
		for (int i = 0; i < L; i++) {
			myArray[i] = (int) ((Math.random() * 50) + 100);
			System.out.print(myArray[i] + " ");
		}
		int[] lowestValues = new int[N];
		Arrays.fill(lowestValues, Integer.MAX_VALUE);

		for (int n : myArray) {
			if (n < lowestValues[N - 1]) {
				lowestValues[N - 1] = n;
				Arrays.sort(lowestValues);
			}
		}
		return lowestValues;
	}

}
