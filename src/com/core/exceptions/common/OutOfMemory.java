package com.core.exceptions.common;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
	static List<Object> list = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Stack(mb): " + Runtime.getRuntime().freeMemory() / 1024 + "\tlist.size(): " + list.size());
		for (;;) {
			for (int i = 0; i < 10; i++) {
				list.add(list.toString());
			}
			System.out.println(
					"Stack(mb): " + Runtime.getRuntime().freeMemory() / 1024 + "\tlist.size(): " + list.size());
		}

	}

}
