package com.core.multithreading.executer_framework;
import java.util.concurrent.Callable;
public class CallableClass  implements Callable <Integer>{
	private int num;
	public CallableClass(int num) {
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		String tName = Thread.currentThread().getName();
		Integer total = 0;
		
		System.out.println(tName + " is calculating the sum of all integers up to "+num + ".");
		for (int i = 1; i <= num; i++) {
			Thread.sleep(10);
			total +=i;
		}
		return total;
	}

}
