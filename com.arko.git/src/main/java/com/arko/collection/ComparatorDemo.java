package com.arko.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentDemo{
	int age;
	String name;
	StudentDemo(int age,String name){
		this.age = age;
		this.name = name;
		
	}
}
class AgeSorter implements Comparator<StudentDemo>{

	public int compare(StudentDemo o1, StudentDemo o2) {
		int val = 0;
		if(o1.age==o2.age) {
			val = 0;
		}else if(o1.age>o2.age) {
			val = 1;
		}else if(o1.age<o2.age) {
			val = -1;
		}
		return val;
		
	}
	
}
class NameSorter implements Comparator<StudentDemo>{

	public int compare(StudentDemo o1, StudentDemo o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<StudentDemo> al = new ArrayList<StudentDemo>();
		al.add(new StudentDemo(20, "Crko"));
		al.add(new StudentDemo(30, "Arko"));
		al.add(new StudentDemo(40, "Brko"));
		
		System.out.println("Before sorting");
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name);
		}
		
		System.out.println("Age sorting");
		Collections.sort(al,new AgeSorter());
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name);
		}
		
		System.out.println("Name sorting");
		Collections.sort(al,new NameSorter());
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name);
		}

	}

}
