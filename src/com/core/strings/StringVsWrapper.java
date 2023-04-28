package com.core.strings;

public class StringVsWrapper {

	public static void main(String[] args) {

		Product product = new Product(1, "iPhone");
		String stringObj = "ABC";
		Integer integerObj = 666;
		System.out.println("Product product = new Product(1, \"iPhone\");\n"
				+ "String stringObj = \"ABC\";\n"
				+ "Integer integerObj = 666;\n");
		

		System.out.println("product: \n\ttype = "+ product.getClass().getSimpleName()+ "\n\tsyso result = "+product);
		System.out.println("stringObj: \n\ttype = "+ stringObj.getClass().getSimpleName()+ "\n\tsyso result = "+stringObj);
		System.out.println("integerObj: \n\ttype = "+ integerObj.getClass().getSimpleName()+ "\n\tsyso result = "+integerObj);
		
		System.out.println("String and Wrapper classes toString is value.");
	}

}
