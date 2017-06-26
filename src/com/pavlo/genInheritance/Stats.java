package com.pavlo.genInheritance;

public class Stats<T extends Number> {

	T[] nums;

	public Stats(T[] nums) {
		super();
		this.nums = nums;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}

	boolean sameAvg(Stats<?> obj) {
		if (average() == obj.average()) {
			return true;
		} else {
			return false;
		}
	}
}
