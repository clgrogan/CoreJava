package com.core.overriding;

public class StaticMethodTest {

	public static void main(String[] args) {
		
		
		OverrideParent op = new OverrideParent();
		System.out.println(op.concreteMethod("OverrideParent type object"));
		System.out.println(op.staticMethod(
				"OverrideParent type object. \n\tWarn: The static method staticMethod(String) from the type OverrideParent 'should' be accessed in a static way"));
		System.out.println();
		OverrideChild oc = new OverrideChild();
		System.out.println(oc.concreteMethod("OverrideChild type object"));
		System.out.println(oc.staticMethod(
				"OverrideChild type object. \n\tWarn: The static method staticMethod(String) from the type OverrideChild 'should' be accessed in a static way"));
		System.out.println();
		OverrideParent upcastVar = new OverrideChild();
		System.out.println("OverrideParent upcastVar = new OverrideChild();");
		System.out.println("upcastVar.staticMethod(): "
				+ upcastVar.staticMethod("OverrideParent type upcast from OverrideChild object"));
		System.out.println("upcastVar.concreteMethod(): "
				+ upcastVar.concreteMethod("OverrideParent type upcast from OverrideChild object"));
		System.out.println("\nOverriding / hiding variables.");
		System.out.println("op.s: "+ op.s);
		System.out.println("oc.s: "+ oc.s);
		System.out.println("upcastVar.s: "+ upcastVar.s);
	}

}
