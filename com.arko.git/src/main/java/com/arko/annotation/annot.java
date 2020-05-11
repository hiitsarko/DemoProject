package com.arko.annotation;

import java.util.ArrayList;
import java.util.List;

class A{
	@Deprecated
	public int a=10;
	@Deprecated
	public void myMewthod1() {
		
	}
	public void myMethod2() {
		
	}
}
public class annot {
	@SuppressWarnings(value = { "deprecation" })
	public static void main(String[] args) {
		A ob = new A();
		ob.myMewthod1();
		ob.myMethod2();
		System.out.println(ob.a);
		
		@SuppressWarnings("rawtypes")
		List ls = new ArrayList();
		System.out.println(ls);

	}

}
