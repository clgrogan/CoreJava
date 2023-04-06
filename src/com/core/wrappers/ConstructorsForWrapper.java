package com.core.wrappers;

public class ConstructorsForWrapper {
	public static void main(String[] args) {
		int i = 100;
		long l = 1000;
		String s = "44";
		Integer aI = 101;
		Long a = new Long(l);
		Long aa= new Long(aI);
		Long b = new Long(i);
		Long c = new Long(s);

		System.out.println(
				"The wrapper constructers (at least all I reviewed) appear to be deprecated and scheduled for removal. "
						+ "\n\t\"@Deprecated(since=\"9\", forRemoval = true)\", pre Long.class comments");

		Long d = (Long) l;
		Long e = l;
		Long f = (Long) aa;
		
		System.out.println("int i = 100: i = " + i);
		System.out.println("long l = 1000: l = " + l);
		System.out.println("String s = \"44\": s = " + s);
		System.out.println("Integer aI = 101: aI = "+ aI);
		System.out.println("Long a = new Long(l): a = " + a);
		System.out.println("Long aa= new Long(aI): aa = " + aa);
		System.out.println("Long b = new Long(i): b = " + b);
		System.out.println("Long c = new Long(s): c = " + c);
		System.out.println("Long d = (Long) l: d = " + d);
		System.out.println("Long e = l: e = " + e);
		System.out.println("Long f = (Long) aa: f = " + f);

	}

}
