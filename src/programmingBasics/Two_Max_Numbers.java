package programmingBasics;

import java.util.ArrayList;
import java.util.List;

public class Two_Max_Numbers {

	public static void main(String[] args) {
		List<Integer> massive = new ArrayList<Integer>();
		massive.add(15);
		massive.add(5);
		massive.add(815);
		massive.add(1005);
		massive.add(157);
		massive.add(6);
		int firstMaxNumber = 0;
		int secondMaxNumber = 0;
		for (int i = 0; i < massive.size(); i++) {
			if (firstMaxNumber < massive.get(i)) {
				secondMaxNumber = firstMaxNumber;
				firstMaxNumber = massive.get(i);
			} else if (secondMaxNumber < massive.get(i)) {

			}
		}
		System.out.println(firstMaxNumber + " " + secondMaxNumber);
	}

}
