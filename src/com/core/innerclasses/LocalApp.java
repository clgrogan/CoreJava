package com.core.innerclasses;

public class LocalApp {

	public static void main(String[] args) {
		containerMethod();
		printTheCode();

	}
	
	private static void printTheCode() {
		System.out.println("\n\n" 
				+ "public class LocalApp {\n"
				+ "\n"
				+ "	public static void main(String[] args) {\n"
				+ "		containerMethod();\n"
				+ "\n"
				+ "	}\n"
				+ "	\n"
				+ "	static void containerMethod() {\n"
				+ "		System.out.println(\"Static method on the outer method executing. This static method contains the LocalInner class.\");\n"
				+ "		class LocalInner{\n"
				+ "			void loco1() {\n"
				+ "				System.out.println(\"Inside LocalInner's loco1 method.\");\n"
				+ "			}\n"
				+ "			\n"
				+ "		}\n"
				+ "		new LocalInner().loco1();\n"
				+ "		\n"
				+ "	}\n"
				+ "\n"
				+ "}");
		
	}

	static void containerMethod() {
		System.out.println("Static method on the outer method executing. This static method contains the LocalInner class.");
		class LocalInner{
			void loco1() {
				System.out.println("Inside LocalInner's loco1 method.");
			}
			
		}
		new LocalInner().loco1();
		
	}

}
