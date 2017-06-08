package com.pavlo.java.util.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		Random random = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 1000; i++) {
			int r = random.nextInt(20);
			Integer frequency = map.get(r);
			map.put((int) r, frequency == null ? 1 : frequency + 1);
		}
		System.out.println(map);
	}
}
