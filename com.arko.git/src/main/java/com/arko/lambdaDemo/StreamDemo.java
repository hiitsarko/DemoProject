package com.arko.lambdaDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);
		
		//====Collecting only even numbers through streams- filter()
		List<Integer> newlist = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		
		
		//=================Comparator sorting using streams
		Comparator<Integer> comp = (i1,i2)-> i2.compareTo(i1);
		List<Integer> sortlist = l.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(sortlist);
		
		
		//=============foreach
		l.stream().forEach(e->System.out.println(e));
		
		List<String> l1 = new ArrayList();
		l1.add("Arko");
		l1.add("barko");
		l1.add("carko");
		System.out.println(l1);
		
		//=======convert those in uppercase using map()
		List<String> collect = l1.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
