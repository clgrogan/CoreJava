package com.core.finalconcepts;

public final class FinalA {

	final float pi = 3.14f;
	final static float piS = 3.14f;
	SomeClass aSomeClass = new SomeClass("Initial SomeClass.a value.");
	final SomeClass finalSomeClass = aSomeClass;

	public static void main(String[] args) {
		FinalA fa1 = new FinalA();
		FinalA faObject = new FinalA();

//		fa1.pi = 67f; cannot assign a new value to a final variable.
		System.out.println("fa1.pi = 67f; cannot assign a new value to a final variable.");
		System.out.println("faObject.aSomeClass: " + faObject.aSomeClass);
		System.out.println("faObject.finalSomeClass: " + faObject.finalSomeClass);
//		faObject.finalSomeClass = 35007;
		System.out.println("faObject.finalSomeClass = \"a new value\";\n\tYou can't do that, Jack. a final variable cannot be assigned a new value.");
		faObject.aSomeClass.s = " updated SomeClass.a value.";
		System.out.println("faObject.finalSomeClass: " + faObject.finalSomeClass);
	}

}
