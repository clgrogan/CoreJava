package com.core.multithreading.executer_framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureApp {

	public static void main(String[] args) {
		
		// Create array of callables/threads
		CallableClass[] callables =  {new CallableClass(700),new CallableClass(20), new CallableClass(30),
			new CallableClass(40),new CallableClass(50),new CallableClass(60)};
		
		// Create Thread Pools
		ExecutorService service1= Executors.newFixedThreadPool(2);
		
		// Use thread pool to process the callables and return the value to Future variable.
		for (CallableClass callable : callables ) {
			Future<Integer> f = service1.submit(callable);
			try {
				System.out.println("f.get(): "+f.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		service1.shutdown();
	}

}
