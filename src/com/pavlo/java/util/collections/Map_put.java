package com.pavlo.java.util.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_put {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");

		for (Iterator<String> it = map.keySet().iterator(); it.hasNext(); )
			if ( "2".equals( it.next() ) )
				it.remove();

		System.out.println( map );
		}
	}
	

