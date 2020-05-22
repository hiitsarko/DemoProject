package com.arko.lambdaDemo;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> f = (i)->i.length();
		System.out.println(f.apply("Arko"));
		
		Function<ArrayList<Integer>, Integer> f1 = (i)->{
			int sum =0;
			for(Integer b:i) {
				sum +=b;
			}
			return sum;
		};
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(50);
		System.out.println("The sum is "+f1.apply(al));
	
	}

}
