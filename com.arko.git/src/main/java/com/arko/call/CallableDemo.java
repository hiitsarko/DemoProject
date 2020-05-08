package com.arko.call;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Mycallable[] calls = {new Mycallable(10),new Mycallable(20),new Mycallable(30),new Mycallable(40),new Mycallable(50)};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(Mycallable c:calls) {
			Future<Object> f = service.submit(c);
			System.out.println("The value is "+f.get());
		}
		service.shutdown();

	}

}
