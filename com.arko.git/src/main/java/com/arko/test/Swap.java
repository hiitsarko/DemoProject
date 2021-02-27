package com.arko.test;

public class Swap {

	public static void main(String[] args) {
		int a =30;
		int b =80;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		if(a>b) {
			a= a+b;
			b= a-b;
			a= a-b;
		}else {
			b=b+a;
			a=b-a;
			b=b-a;
		}
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}

}
