package com.core.overriding;

public class OverrideParent {
	public String s = "Parent";

	public static String staticMethod(String from) {
		return "staticMethod() in OverrideParent called from "+ from;
	}
//	public abstract static void aMethod();
	public String concreteMethod(String from) {
		return "concreteMethod() in OverrideParent called from "+ from;
		
		
	}
}
