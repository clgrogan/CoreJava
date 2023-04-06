package com.core.wrappers;

public class WrapperAndObject {
public static void main(String[] args) {
	int x = 100;
	Integer y = Integer.valueOf(x);
	int z = y.intValue();
	System.out.println("int x = 100: x = " + x);
	System.out.println("Integer y = Integer.valueOf(x): y = " + y);
	System.out.println("int z = y.intValue(): z = " + z);
}

}
