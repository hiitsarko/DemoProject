package com.arko.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentDemo{
	int age;
	String name;
	String address;
	StudentDemo(int age,String name,String address){
		this.age = age;
		this.name = name;
		this.address = address;
		
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
		al.add(new StudentDemo(20, "Crko","add1"));
		al.add(new StudentDemo(30, "Arko","cdd2"));
		al.add(new StudentDemo(40, "Brko","bdd3"));
		
		System.out.println("Before sorting");
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name+"  "+s.address);
		}
		
		System.out.println("Age sorting");
		Collections.sort(al,new AgeSorter());
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name+"  "+s.address);
		}
		
		System.out.println("Name sorting");
		Collections.sort(al,new NameSorter());
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name+"  "+s.address);
		}
		
		System.out.println("address sorting using lambda");
		Comparator<StudentDemo> st = (s1,s2)->{
			return s1.address.compareTo(s2.address);
		};
		Collections.sort(al,st);
		for(StudentDemo s:al) {
			System.out.println(s.age+"  "+s.name+"  "+s.address);
		}

	}

}
