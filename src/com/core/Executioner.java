package com.core;

import com.core.command_line_args.CommandLineArguements;
import com.core.command_line_args.ProductOfArguments;
import com.core.flowcontrol.FlowControlAggragate;
import com.core.flowcontrol.IfElse;
import com.core.iteration.Switch;
import com.core.nonstatic.Demo;
import com.core.nonstatic.NonStaticMembers;
import com.core.nonstatic.ObjectReference;
import com.core.nonstatic.ThisKeyword;
import com.core.operators.AssignmentOperator;
import com.core.operators.BitwiseOperators;
import com.core.operators.RelationalOperators;
import com.core.operators.ShortCircuitOperators;
import com.core.operators.StringConcat;
import com.core.operators.UnaryAndArithmeticOperators;
import com.core.staticstuff.StaticBlockInClass;
import com.core.staticstuff.StaticStuff;
import com.core.wrappers.AllInOne;
import com.core.wrappers.ConstructorsForWrapper;
import com.core.wrappers.ObjectAndString;
import com.core.wrappers.PrimitiveAndString;
import com.core.wrappers.WrapperAndObject;

public class Executioner {

	public static void main(String[] args) {
		final String[] noArgs = new String[] {};
		final String[] wordArgs = {"Just", "some", "words", "as", "Strings", "."};
		String[] miscArgs;
		
		CommandLineArguements.main(wordArgs);
		
		miscArgs = new String[]{"10", "50", "2"};
		ProductOfArguments.main(miscArgs);
		
		IfElse.main(noArgs);
		
		Demo.main(noArgs);
		
		NonStaticMembers.main(noArgs);
		
		ObjectReference.main(noArgs);
		
		ThisKeyword.main(noArgs);
		
		AssignmentOperator.main(noArgs);
		
		BitwiseOperators.main(noArgs);
		
		RelationalOperators.main(noArgs);
		
		ShortCircuitOperators.main(noArgs);
		
		StringConcat.main(noArgs);
		
		UnaryAndArithmeticOperators.main(noArgs);
		
		StaticStuff.main(noArgs);
		
		AllInOne.main(noArgs);
		
		ConstructorsForWrapper.main(noArgs);
		
		ObjectAndString.main(noArgs);
		
		PrimitiveAndString.main(noArgs);
		
		WrapperAndObject.main(noArgs);
		
		Switch.main(noArgs);
		
		miscArgs = new String[] {"Balance", "Change PIN", "Deposit", "", "Withdrawal"};
		FlowControlAggragate.main(miscArgs);
	}

}
