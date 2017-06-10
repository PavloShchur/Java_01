package com.pavlo.java.util.stream;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("�����");
		arrayList.add("�����");
		arrayList.add("����");
		arrayList.add("������");
		arrayList.add("��");
		arrayList.add("�����");
		
		Stream<String> stream = arrayList.stream();
		Spliterator<String> spliterator = stream.spliterator();
		Spliterator<String> spliterator2 = spliterator.trySplit();
		if(spliterator2 != null){
			System.out.println("���������, �� ���������� spliterator2: ");
			spliterator2.forEachRemaining((n) -> System.out.println(n));
		}
		
		System.out.println("���������, �� ���������� spliterator: ");
		spliterator.forEachRemaining((n) -> System.out.println(n));
		
		
		
		
		
	}

}
