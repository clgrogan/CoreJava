package com.core.polyapple;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PolymorphismTest {

	public static void main(String[] args) {
		
		
		

		System.out.println("AppleComputer typed variable:\n  AppleComputer acPro = new MacBookPro()");
		AppleComputer acPro = new MacBookPro();
		System.out.println("\tacPro Members and results");
		System.out.println("\t\tstartUp():    " + acPro.startUp());
		System.out.println("\t\tshutDown():   " + acPro.shutDown());
		System.out.println("\t\t  checkBatteryLevel() : " + "not available/visible");
		System.out.println("\t\t  batteryLevel: " + "not available/visible");
		System.out.println("\nLaptop laptopPro = new MacBookPro()");
		Laptop laptopPro = new MacBookPro();
		System.out.println("\tlaptopPro Members and results");
		System.out.println("\t\tstartUp():    " + laptopPro.startUp());
		System.out.println("\t\tshutDown():   " + laptopPro.shutDown());
		System.out.println("\t\tbatteryLevel: " + laptopPro.batteryLevel);
		System.out.println("\t\tcheckBatteryLevel(): " + laptopPro.checkBatteryLevel());
		System.out.println("MacBook typed variable\n  MacBook macBookProParent = new MacBookPro();");
		MacBook macBookProParent = new MacBookPro();
		System.out.println("\tmacBookProParent Members and results");
		System.out.println("\t\tstartUp():    " + macBookProParent.startUp());
		System.out.println("\t\tshutDown():   " + macBookProParent.shutDown());
		System.out.println("\t\tbatteryLevel: " + macBookProParent.batteryLevel);
		System.out.println("\t\tcheckBatteryLevel(): " + macBookProParent.checkBatteryLevel());
		System.out.println("MacBookPro typed variable\n  MacBookPro macBookPro = new MacBookPro();");
		MacBookPro macBookPro = new MacBookPro();
		System.out.println("\tmacBookPro Members and results");
		System.out.println("\t\tstartUp():    " + macBookPro.startUp());
		System.out.println("\t\tshutDown():   " + macBookPro.shutDown());
		System.out.println("\t\tbatteryLevel: " + macBookPro.batteryLevel);
		System.out.println("\t\tcheckBatteryLevel(): " + macBookPro.checkBatteryLevel());


		System.out.println("AppleComputer typed variable:\n  AppleComputer acAir = new MacBookAir()");
		AppleComputer acAir = new MacBookAir();
		System.out.println("\tacAir Members and results");
		System.out.println("\t\tstartUp():    " + acAir.startUp());
		System.out.println("\t\tshutDown():   " + acAir.shutDown());
		System.out.println("\t\t  checkBatteryLevel() : " + "not available/visible");
		System.out.println("\t\t  batteryLevel: " + "not available/visible");
		System.out.println("\nLaptop laptopAir = new MacBookAir()");
		Laptop laptopAir = new MacBookAir();
		System.out.println("\tlaptopAir Members and results");
		System.out.println("\t\tstartUp():    " + laptopAir.startUp());
		System.out.println("\t\tshutDown():   " + laptopAir.shutDown());
		System.out.println("\t\tbatteryLevel: " + laptopAir.batteryLevel);
		System.out.println("\t\tcheckBatteryLevel(): " + laptopAir.checkBatteryLevel());
		System.out.println("MacBook typed variable\n  MacBook macBookAirParent = new MacBookAir();");
		MacBook macBookAirParent = new MacBookAir();
		System.out.println("\tmacBookAirParent Members and results");
		System.out.println("\t\tstartUp():    " + macBookAirParent.startUp());
		System.out.println("\t\tshutDown():   " + macBookAirParent.shutDown());
		System.out.println("\t\tbatteryLevel: " + macBookAirParent.batteryLevel);
		System.out.println("\t\tcheckBatteryLevel(): " + macBookAirParent.checkBatteryLevel());
		System.out.println("MacBookAir typed variable\n  MacBookAir macBookAir = new MacBookAir();");
		MacBookAir macBookAir = new MacBookAir();
		System.out.println("\tmacBookAir Members and results");
		System.out.println("\t\tstartUp():    " + macBookAir.startUp());
		System.out.println("\t\tshutDown():   " + macBookAir.shutDown());
		System.out.println("\t\tbatteryLevel: " + macBookAir.batteryLevel);
		System.out.println("\t\tcheckBatteryLevel(): " + macBookAir.checkBatteryLevel());
		
		System.out.println("\nReason to downcast example. \n\tThe MacBookPro is the only class with a powerMode \n\tattribute and setters/getters for it.");
		System.out.println("\tA MacBookPro object was upcast to a AppleComputer typed variable \"acPro\". We cannot access the powerMode and accessor methods on the object.");
		System.out.println(" acPro.getPowerMode() compile error:\n\tThe method getPowerMode() is undefined for the type AppleComputer");
		System.out.println("Downcast the acPro to the MacBookPro type to access powerMode:");
		System.out.println(" MacBookPro mbPro = (MacBookPro) acPro;");
		MacBookPro mbPro = (MacBookPro) acPro;
		System.out.println("\tmbPro.getPowerMode(): " + mbPro.getPowerMode());
		System.out.println("\tExecute " + "mbPro.setPowerMode(\"Something Else\")");
		mbPro.setPowerMode("Something Else");
		System.out.println("\tmbPro.getPowerMode(): " + mbPro.getPowerMode());

	}

}
