package com.arko.multhread;

class EvenNumbersThread extends Thread{
	public void run() {
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.println("Even numbers...thread"+i+" Thread name "+Thread.currentThread().getName());
			}
		}
	}
}
class OddNumbersThread implements Runnable{
	public void run() {
		
		for(int i=0;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Odd numbers...thread"+i+" Thread name "+Thread.currentThread().getName());
			}
		}
	}
}
public class Test {

	public static void main(String[] args) {
		EvenNumbersThread et = new EvenNumbersThread();
		et.setName("Even Thread");
		
		OddNumbersThread ot = new OddNumbersThread();
		Thread oet = new Thread(ot);
		oet.setName("Odd Thread");
		
		
		et.start();
		oet.start();
		
	}

}
