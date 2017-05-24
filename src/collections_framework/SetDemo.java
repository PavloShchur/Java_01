package collections_framework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.jws.soap.SOAPBinding;

public class SetDemo {

	public static void main(String[] args) {
		int[] count = {34, 22, 10, 60, 30, 22};
		Set<Integer> set = new HashSet<Integer>();
		try{
			for(int i = 0; i < 5; i++){
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is: " + "\n" + sortedSet);
			System.out.println("The First element of the set is: " + sortedSet.first());
			System.out.println("The Last element of the set is: " + sortedSet.last());

		} catch (Exception e){}
		
	}

}
