package com.arko.lambdaDemo;

public class staticMethodRef {
	public static void mymethod() {
		for(int i=0;i<5;i++) {
			System.out.println("mymethod implememtion...");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		//====need to use only in functional interface
		Runnable r = staticMethodRef::mymethod;
		Thread t = new Thread(r);
		t.start();
		t.join();
		for(int i=0;i<5;i++) {
			System.out.println("mainmethod implememtion...");
		}
	}

}
