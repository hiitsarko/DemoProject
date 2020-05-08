package com.arko.test;
class MyThreadException extends RuntimeException{
	MyThreadException(String message) {
		
	}
}
public class Excep {

	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new MyThreadException("Exception occured");
		}
	}

}
