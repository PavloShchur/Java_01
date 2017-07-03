package com.pavlo.java.util.stream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_okten {

	public static void main(String[] args) throws Exception {

		Collection<String> strings = new ArrayList<>();
		strings.add("one");
		strings.add("qwe");
		strings.add("asd");
		strings.add("zxc");
		strings.add("one");
		strings.add("dfg");

		Stream<String> stream = strings.stream();
		// List<String> list = stream.filter(o ->
		// o.equals("one")).collect(Collectors.toList());
		// System.out.println(list);

		// List<String> list = stream.skip(2).filter(o ->
		// o.equals("one")).collect(Collectors.toList());
		// System.out.println(list);

		// List<String> list = stream.distinct().collect(Collectors.toList());
		// System.out.println(list);

		// List<String> list = stream.map(s -> s + "
		// 1").collect(Collectors.toList());
		// System.out.println(list);

		// List<String> list = stream.limit(3).collect(Collectors.toList());
		// System.out.println(list);
		
//		List<Integer> listq = Arrays.asList(1,2,3,4);
//		listq.stream().sorted(Integer::compare).forEach(System.out::println);
		//reverse order
//		Stream.of("1", "2", "20", "3")
//	      .collect(Collectors.toCollection(ArrayDeque::new)) // or LinkedList
//	      .descendingIterator()
//	      .forEachRemaining(System.out::println);

		// List<String> list =
		// stream.sorted().limit(3).distinct().collect(Collectors.toList());
		// System.out.println(list);
		
//		String[][] str = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };
//		System.out.println(Arrays.stream(str).flatMap(o -> Arrays.stream(o)).collect(Collectors.toList()));
//		
//		List<String> list =Arrays.asList("aaaa", "baa", "c");
//		List<String> result = list.stream().filter(s->s.length()>2).map(s -> s.toUpperCase()).map(s->s + " postfix")/*
//		 * Copyright 2017 the original author or authors.
//		 *
//		 * Licensed under the Apache License, Version 2.0 (the "License");
//		 * you may not use this file except in compliance with the License.
//		 * You may obtain a copy of the License at
//		 *
//		 *      http://www.apache.org/licenses/LICENSE-2.0
//		 *
//		 * Unless required by applicable law or agreed to in writing, software
//		 * distributed under the License is distributed on an "AS IS" BASIS,
//		 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//		 * See the License for the specific language governing permissions and
//		 * limitations under the License.
//		 */
//.collect(Collectors.toList());
//		System.out.println(result);
		
//		List<String> list = Arrays.asList("aaaa", "baa", "c", "d", null);
//		Map<Integer, List<String>> map = list.stream().filter(s -> s != null)
//				.collect(Collectors.groupingBy(String::length));
//		System.out.println(map);
		
		List<String> list = Arrays.asList("aaaa", "baa", "c", "d");
		List<Predicate<String>> predicates = Arrays.asList(
				s -> s.length() > 2,
				s -> s.length() < 4);
		List<String> res = filterWith(list.stream(), predicates)
				.collect(Collectors.toList());
		System.out.println(res);
		
	
		
	}
	
	static Stream<String> filterWith(Stream<String> stream, Collection<Predicate<String>> predicates){
		Predicate<String> combine = predicates.stream().reduce(i -> true, Predicate::and); 
		return stream.filter(combine);
		
	}

}
