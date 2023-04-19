package com.core.overriding;

public class OverrideChild extends OverrideParent {
	public String s = "Child value.";
//	@Override
	public static String staticMethod(String from) {
		return "staticMethod() in Child called from " + from;
	}

	public String concreteMethod(String from) {
		return "concreteMethod() in Child called from "+ from;
		
		
	}
	

}
