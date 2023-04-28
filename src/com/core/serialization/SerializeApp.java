package com.core.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class SerializeApp {

	public static void main(String[] args) {
		String targetPath = "/Users/cgrogan/dev/aCoreJava/CoreJava/resources/files/";
		String targetFilename = "Employee.ser";
		try (FileOutputStream fos = new FileOutputStream(new File(targetPath + targetFilename));
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Employee emp = new Employee(1, "Bob", 100000, 555668888);
			oos.writeObject(emp);
			System.out.println("Employee Object Serialized: "+ emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
