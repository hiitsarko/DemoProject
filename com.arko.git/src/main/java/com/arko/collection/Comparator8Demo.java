package com.arko.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	int age;
	String name;
	Student1(int age,String name){
		this.age = age;
		this.name = name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class Comparator8Demo {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(20, "Crko"));
		al.add(new Student1(30, "Arko"));
		al.add(new Student1(40, "Brko"));
		
		System.out.println("Before sorting");
		for(Student1 s:al) {
			System.out.println(s.age+"  "+s.name);
		}
		
		System.out.println("Age sorting");
		Comparator<Student1> comparing = Comparator.comparing(Student1::getAge);
		Collections.sort(al,comparing);
		for(Student1 s:al) {
			System.out.println(s.age+"  "+s.name);
		}
		
		System.out.println("Name sorting");
		Comparator<Student1> compare2 = Comparator.comparing(Student1::getName);
		Collections.sort(al,compare2);
		for(Student1 s:al) {
			System.out.println(s.age+"  "+s.name);
		}
		
	}

}
