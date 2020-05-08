
package com.arko.call;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<Object> {
	int num;

	public Mycallable(int num) {
		this.num = num;
	}

	public Object call() {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += i;
		}
		return sum;
	}
}
