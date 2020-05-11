package com.arko.enumdemo;

public enum enumdemo {
	demo1(20), demo2(10), demo3(30);
	int i;

	enumdemo(int i) {
		this.i = i;
	}

	public int getValue() {
		return this.i;
	}
}
