package programmingBasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Three_Min_Numbers implements Comparator<Integer> {
	public static int Z = 0;
	public static int[] massive = { 8, -7, 78, -25, 0, 6, 78, 7, 78, 4 };

	public static void main(String[] args) {
		sort(10);

		int firstMinNumber = massive[0];
		int secondMinNumber = massive[0];
		int thirdMinNumber = massive[0];
		int fourthMinNumber = massive[0];
		int IndexFirstMinNumber = 0;
		int IndexSecondMinNumber = 0;
		int IndexThirdMinNumber = 0;
		int IndexFourthMinNumber = 0;
		for (int i = 0; i < massive.length; i++) {
			if (firstMinNumber > massive[i]) {
				firstMinNumber = secondMinNumber;
				secondMinNumber = thirdMinNumber;
				thirdMinNumber = fourthMinNumber;
				fourthMinNumber = massive[i];
				IndexFirstMinNumber = IndexSecondMinNumber;
				IndexSecondMinNumber = IndexThirdMinNumber;
				IndexThirdMinNumber = IndexFourthMinNumber;
				IndexFourthMinNumber = i;
			}

		}
//		System.out.println(firstMinNumber + " " + secondMinNumber + " " + thirdMinNumber + " " + fourthMinNumber);
//		System.out.println(IndexFirstMinNumber + " " + IndexSecondMinNumber + " " + IndexThirdMinNumber + " "
//				+ IndexFourthMinNumber);
	}

	public static void sort(int N) {
		for(int i = 0; i < N; i++){
			int Numbers = (int) (Math.random() * 50);
			List<Integer> listOfNumbers = new ArrayList<Integer>();
			listOfNumbers.add(Numbers);
			Z++;
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			map.put(Z, Numbers);
			System.out.println(map);
			List<Integer> ints = new ArrayList<Integer>();
			for (Entry<Integer, Integer> entry : map.entrySet())
			{
				int someNumber = entry.getValue();
			
			    System.out.println(entry.getKey() + "/" + entry.getValue());
//			    List<Integer> intsXXX = Stream.of(ints.iterator().next()).collect(Collectors.toList());
//			    Integer maxInt = ints.stream()
//			    		.max(Comparator.comparing(i -> i))
//			    		.get();
			    
			    Stream.of(someNumber).max(Comparator.comparing(s->s.toString().length()))
			    .ifPresent(max->System.out.println("Maximum string in the set is " + max));

//			    System.out.println("Maximum number in the set is " + maxInt);
			}
			
			

//		    System.out.println("Maximum number in the set is " + maxInt);
			
			
		}
		}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}










