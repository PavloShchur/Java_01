package collections_framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(new Integer(-8));
		ll.add(new Integer(20));
		ll.add(new Integer(-20));
		ll.add(new Integer(8));
		
		System.out.println(ll);
		Comparator r = Collections.reverseOrder();
		Collections.sort(ll, r);
		Iterator li = ll.iterator();
		System.out.println("List sorted in reverse: ");
		while(li.hasNext()){
			System.out.print(li.next() + " ");
		}
		System.out.println();
		Collections.shuffle(ll);
		li = ll.iterator();
		System.out.println("List shuffled: ");
			while(li.hasNext()){
				System.out.print(li.next() + " ");
			}
			System.out.println();
			System.out.println("Minimum: " + Collections.min(ll));
			System.out.println("Maximim: " + Collections.max(ll));


	}

}
