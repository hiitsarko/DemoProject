package com.arko.reflect;

@MyAnnotation(val1 = "val1", val2 = "val2")
public class Calculator {
	private int num;
	private double val;

	public Calculator() {
		System.out.println("Default Consdtructor");
	}

	public Calculator(int num, double val) {
		this.num = num;
		this.val = val;
		System.out.println("Parameterized Consdtructor");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}
	public double sum(int a,int b) {
		return a+b;
	}

}
