package com.core.strings;

import java.util.StringTokenizer;

public class TokenizerApp {

	public static void main(String[] args) {

		System.out.println("\nString Tokenizer Demonstration\n");

		String str = "The Quick Brown Fox.";
		StringTokenizer tokenStr = new StringTokenizer(str);
		StringTokenizer tokenStrDelim = new StringTokenizer(str, " ");
		StringTokenizer tokenStrDelimBool = new StringTokenizer(str, " ", true);
		System.out.println();
		System.out.println("		String str = \"The Quick Brown Fox.\";\n"
				+ "		StringTokenizer tokenStr = new StringTokenizer(str);\n"
				+ "		StringTokenizer tokenStrDelim = new StringTokenizer(str, \" \");\n"
				+ "		StringTokenizer tokenStrDelimBool = new StringTokenizer(str, \" \", true);");

		System.out.println("\n" + "		while (tokenStr.hasMoreTokens()) {\n"
				+ "			System.out.print(tokenStr.nextToken());\n" + "		}");
		while (tokenStr.hasMoreTokens()) {
			System.out.print(tokenStr.nextToken());
		}
		System.out.println("\n" + "		while (tokenStrDelim.hasMoreTokens()) {\n"
				+ "			System.out.print(tokenStrDelim.nextToken());\n" + "		}");
		while (tokenStrDelim.hasMoreTokens()) {
			System.out.print(tokenStrDelim.nextToken());
		}
		System.out.println("\n" + "		while (tokenStrDelimBool.hasMoreTokens()) {\n"
				+ "			System.out.print(tokenStrDelimBool.nextToken());\n" + "		}");
		while (tokenStrDelimBool.hasMoreTokens()) {
			System.out.print(tokenStrDelimBool.nextToken());
		}
		String str2 = "\nEvery Good,Boy Does,Fine\\";

		System.out.println("\nString str2 = \"Every Good,Boy Does,Fine\";");
		
		System.out.println("\nwhileHasMoreLoop(new StringTokenizer(str2))");
		whileHasMoreLoop(new StringTokenizer(str2));
		System.out.println("\nwhileHasMoreLoop(new StringTokenizer(str2, \" \"))");
		whileHasMoreLoop(new StringTokenizer(str2, " "));
		System.out.println("\nwhileHasMoreLoop(new StringTokenizer(str2, \" \", true))");
		whileHasMoreLoop(new StringTokenizer(str2, " ", true));
		System.out.println("\nwhileHasMoreLoop(new StringTokenizer(str2, \" \", false))");
		whileHasMoreLoop(new StringTokenizer(str2, " ", false));
		System.out.println("\nwhileHasMoreLoop(new StringTokenizer(str2, \",\", true))");
		whileHasMoreLoop(new StringTokenizer(str2, ",", true));
		System.out.println("\nwhileHasMoreLoop(new StringTokenizer(str2, \",\", false))");
		whileHasMoreLoop(new StringTokenizer(str2, ",", false));

	}

	private static void whileHasMoreLoop(StringTokenizer tokenStr) {
		System.out.println(" tokenStr.countTokens(): "+ tokenStr.countTokens());
		while (tokenStr.hasMoreTokens()) {
			System.out.println("\t" + tokenStr.nextToken());
		}

	}

}
