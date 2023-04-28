package com.core.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeApp {

	public static void main(String[] args) {
		String targetPath = "/Users/cgrogan/dev/aCoreJava/CoreJava/resources/files/";
		String targetFilename = "Employee.ser";
		Employee emp;

		try (FileInputStream fis = new FileInputStream(new File(targetPath + targetFilename));
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			emp = (Employee) ois.readObject();
			System.out.println("Employee object deserialized: " +emp + "\nemp.ssn: "+emp.ssn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
