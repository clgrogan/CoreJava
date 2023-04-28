package com.core.innerclasses;

public class Outer {
	private static String x;
	private int y;
	static Inner xo = null;
	{
		xo = new Inner(666);
	}

	public Outer(int y) {
		this.y = y;
		this.x = "outer static variable value";
	}

	public static void main(String[] args) {
		Outer outer = new Outer(66);
		outer.meth1();

		Outer.Inner.meth2();
		Inner.meth2();

		Inner inner = outer.new Inner(outer.y - 55);
		inner.meth3();
		inner.meth1();
		System.out.println(inner.y);
		;

		System.out.println("Inner class instatiated as a static variable on the parent.");
		System.out.println("\t An Object of the parent must be instantiated for the variable to be assigned a reference to the inner class variable.");
		System.err.println(
				"\t  static Inner xo = null;\n"
				+ "	  {\n"
				+ "		  xo = new Inner(666);\n"
				+ "	  } //// That's some funkiness there!");
		xo.meth1();
		xo.meth3();
	}

	private void meth1() {
		System.out.println("Outer Class's non-static method executed. Outer object's y: " + y);

	}

	class Inner {
		int y;

		public Inner(int y) {
			this.y = y;
		}

		static void meth2() {
			System.out.println("Inner Class's static method executed.");
		}

		void meth1() {
			System.out.println("Inner Class's concrete method executed.");
		}

		private void meth3() {
			System.out.println("Inner Class's private concrete method executing.");
			System.out.println("\tOuter.x: " + Outer.x);
			System.out.println("\tOuter.this.y: " + Outer.this.y);
			System.out.println("\tthis.y: " + this.y);
			System.out.print("Calling outer class's private method from inner class using \"Outer.this.meth1();\"\n\t");
			Outer.this.meth1();
		}
	}
}
