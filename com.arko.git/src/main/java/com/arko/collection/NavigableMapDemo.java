package com.arko.collection;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<String, String> nav = new TreeMap<String, String>();
		nav.put("A", "value1");
		nav.put("B", "value2");
		nav.put("C", "value3");
		nav.put("D", "value4");
		nav.put("E", "value5");
		nav.put("F", "value6");
		System.out.println(nav.floorKey("Z"));
		System.out.println(nav.lowerKey("Z"));
		System.out.println(nav.ceilingKey("D"));
		System.out.println(nav.higherKey("E"));
		System.out.println(nav.pollFirstEntry());
		System.out.println(nav.pollLastEntry());
		System.out.println(nav.descendingMap());
		
	}

}
