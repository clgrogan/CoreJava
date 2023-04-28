package com.core.immutable;

public class SBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.err.println("Default StringBuilder sb capacity(): " + sb.capacity());
		System.out.println("String buffer capacity is initially sixteen.\n\tsb.capacity(): " + sb.capacity());
		System.out.println("sb: " + sb);
		System.out.println("\n.append(String)");
		System.out.println("sb.append(\"The append method is used to concatenate strings together.\"): "
				+ sb.append("The append method is used to concatenate strings together."));
		System.out.println();
		System.err.println("Current sb.capacity(): " + sb.capacity());

		System.out.println("sb.reverse(): " + sb.reverse());
		System.out.println("\n.append(String)");
		System.out.println("sb.append(\"5555\"): " + sb.append("5555"));
		System.out.println("sb: " + sb);
		System.out.println("sb.reverse(): " + sb.reverse());
		
		System.out.println("\n.delete(startIndex, endIndex)");
		System.out.println("sb.delete(0,5): "+ sb.delete(0,4));
		System.out.println("\n.insert(index, String");
		System.out.println("sb.insert(3, \" silly\"): "+sb.insert(3, " silly"));
		
		
		StringBuffer sb2 = new StringBuffer("0123456789");
		System.out.println("\nStringBuffer Constructor(String)");
		System.out.println("StringBuffer sb2 = new StringBuffer(\"0123456789\")");
		System.out.println("sb2: "+sb2);
		System.out.println("\n.substring(start, end)");
		System.out.println("sb2.substring(4, 5): "+sb2.substring(4, 5));
		System.out.println("\nsb2: "+ sb2);

	}

}
