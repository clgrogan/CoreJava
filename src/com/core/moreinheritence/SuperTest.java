package com.core.moreinheritence;

public class SuperTest {

	public static void main(String[] args) {
		Child child = new Child(1, 2, 3, 4);
		child.f1();
		Parent parent = child;
		System.out.println(parent + "\n"+ child);
		parent.f1();
		child.displayDetails();
		child.a++;
		System.out.println("child.a++; ");
		child.displayDetails();
		System.out.println(child);
	}
	
	

}
