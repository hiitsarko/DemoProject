package com.arko.lambdaDemo;

interface demo {
	public void mymethod(int i);
}

public class instanceMethodRef {
	public void myinstancemethod(int i) {
		System.out.println(i);
	}

	public void myinstancemethod() {
		System.out.println("empty");
	}

	public static void main(String[] args) {
		instanceMethodRef ob = new instanceMethodRef();
		demo d = ob::myinstancemethod;
		d.mymethod(20);

		Runnable r = ob::myinstancemethod;
		Thread t = new Thread(r);
		t.start();

	}

}
