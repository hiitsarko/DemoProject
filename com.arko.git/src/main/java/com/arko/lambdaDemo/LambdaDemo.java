package com.arko.lambdaDemo;

public class LambdaDemo {

	public static void main(String[] args) {
		//======Annonymus approach
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<4;i++) {
					System.out.println("Child annonymus  thread");
				}
			}
		});
		t2.start();
		
		//======Lambda approach
		Runnable r = ()->{
			for(int i=0;i<4;i++) {
				System.out.println("Child lambda thread");
			}
		};
		Thread t1 = new Thread(r);
		t1.start();
		
		//=====Annonymus lambda approach
		Thread t = new Thread(()->{
			for(int i=0;i<4;i++) {
				System.out.println("Child annonymus lambda thread");
			}
		});
		t.start();
		}

}
