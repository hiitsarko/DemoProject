package com.arko.enumdemo;

public class EnumTest {

	public static void main(String[] args) {
		System.out.println(enumdemo.demo1);
		System.out.println(enumdemo.demo2);
		System.out.println(enumdemo.demo3);
		
		enumdemo[] vals = enumdemo.values();
		for(enumdemo e:vals) {
			System.out.println(e.ordinal()+" has value:  "+e.getValue());
		}
		
	}

}
