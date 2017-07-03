package com.pavlo.java.slang;


import java.util.ArrayList;
import java.util.Arrays;

import javaslang.Tuple;
import javaslang.Tuple0;
import javaslang.Tuple1;
import javaslang.Tuple2;
import javaslang.collection.List;

public class Main {

	public static void main(String[] args) {
		
		Tuple1 of = Tuple.of(1);
		Tuple2 of1 = Tuple.of(1, 2);
		
//		Tuple2<Integer, Integer> i2 = of1.map1(i ->3*i).swap();
		
//		List<Integer> list = List.of(1, 2, 3);
//		List<List<Integer>> combinations = list.append(4).appendAll(Arrays.asList(5, 6)).combinations();
//		System.out.println(combinations);
		
		List<Integer> list = List.of(1, 2, 3);
		List<String> strings = List.of("one", "two", "three");
		List<Tuple2<Integer, String>> zip = list.zip(strings);
		System.out.println(zip);

	}

}
