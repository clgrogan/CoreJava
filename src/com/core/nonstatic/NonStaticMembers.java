package com.core.nonstatic;

public class NonStaticMembers {
	int num;

	public NonStaticMembers() {
		System.out.println("Constructor executed. Non-static member.");
	}

	{
		System.out.println("Non-static block executed. Non-static member");
	}

	public static void main(String[] args) {
		System.out.println("Main method executed. Static method.");
		System.out.println(new NonStaticMembers().nonStaticMethod());;
		new NonStaticMembers();
		new NonStaticMembers();
		NonStaticMembers obj = new NonStaticMembers();
		obj.doSomething();
	}

	private String nonStaticMethod() {

		return "Non-static Method executed (called from main) and nonStaticMethod is accessing the \n Non-static variable \"num\" which has the value of " + num
				+ ".";
	}
	
	static {System.out.println("Static block executed.");}
	
	private void doSomething() {
		System.out.println("doSomething executed. Non-static method.");
	}
}
