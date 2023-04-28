package com.core.multithreading.executer_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorApp {

	public static void main(String[] args) {
		CheckProcessorTask[] cpt = { new CheckProcessorTask("ATM"), new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"), new CheckProcessorTask("Web") };

		ExecutorService eService = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask task : cpt) {
			eService.submit(task);
		}
		eService.shutdown();
		ExecutorService eService1 = Executors.newFixedThreadPool(2);
		
		for (CheckProcessorTask task : cpt) {
			eService1.submit(task);
		}
		eService1.shutdown();

	}

}
