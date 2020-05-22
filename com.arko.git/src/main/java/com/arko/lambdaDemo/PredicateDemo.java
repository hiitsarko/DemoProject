package com.arko.lambdaDemo;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
			int[] x = {2,4,5,67,10,15,24,45,68};
			
			Predicate<Integer> p1 = (i)-> i>10;
			Predicate<Integer> p2 = (i)-> i%2==0;
			
			System.out.println("Print value bigger than 10...");
			testNumber(p1, x);
			System.out.println("Print value lesser than 10...");
			testNumber(p1.negate(), x);
			
			System.out.println("Print value Even Numbers...");
			testNumber(p2, x);
						
			System.out.println("Print value bigger value or  Even Numbers...");
			testNumber(p1.or(p2), x);
			
			System.out.println("Print value bigger value and  Even Numbers...");
			testNumber(p1.and(p2), x);

			for(int y:x) {
				if(p1.and(p2).test(y)) {
					System.out.println("inside "+y);					
				}
			}

	}

	static void testNumber(Predicate<Integer>p,int[] x) {
		for(int eachval:x) {
			if(p.test(eachval)) {
				System.out.println(eachval);				
			}
		}
	}

}
