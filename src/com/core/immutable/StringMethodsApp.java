package com.core.immutable;

public class StringMethodsApp {

	public static void main(String[] args) {
		System.out.println("\nString Object Methods");
		System.out.println("\tString s = \"Hello\";");
		String s = "Hello";

		System.out.println("\n.length()");
		System.out.println("s.length(): \t\t" + s.length());
		System.out.println("\nindexOf('char')");
		System.out.println("s.indexOf('o'): \t" + s.indexOf('o'));
		System.out.println("s.indexOf('lo'): \t" + "invalid character constant");
		System.out.println("\ncharAt(index)");
		System.out.println("s.charAt(1): \t" + s.charAt(1));
		System.out.println("\nsugstring(startIndex)");
		System.out.println("s.substring(1):\t" + s.substring(1));
		System.out.println("\nsugstring(startIndex, endPosition) ");
		System.out.println("s.substring(1,4):\t" + s.substring(1, 4));
		System.out.println("\nsplit(\"string\")");
		String splits[] = s.split("ll");
		System.out.println("String splits[] = s.split(\"ll\");");
		System.out.println("splits.length: " + splits.length);
		for (String str : splits) {
			System.out.print(str + ", ");
		}
		System.out.println();
		System.out.println("String[] foxy = \"The quick brown fox jumped over the lazy dog.\".split(\" \");\n"
				+ "for (String f: foxy) System.out.println(\"\\t\"+f);");
		String[] foxy = "The quick brown fox jumped over the lazy dog.".split(" ");
		for (String f : foxy)
			System.out.println("\t" + f);
		System.out.println("\nreplace('char','char')");
		System.out.println("s.replace('l', 'z'):\t" + s.replace('l', 'z'));
		System.out.println();
		System.out.println("toUpperCase() & toLowerCase()");
		System.out.println("s.toUpperCase():\t"+s.toUpperCase());
		System.out.println("s.toLowerCase():\t"+s.toLowerCase());
		System.out.println("\nAt the end of it all. The base String object remains unchanged.");
		System.out.println("s:\t" + s);
		System.out.println();
	}

}
