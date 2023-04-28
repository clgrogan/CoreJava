package com.core.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamApp {
	private static final String filePath = "/Users/cgrogan/dev/aCoreJava/CoreJava/resources/files/localfile.txt";

	public static void main(String[] args) {
		System.out.println("\nFileInputStream Demonstration Reading Local File");
		System.out.println();
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(new File(filePath));
			System.out.println("File opened from: " + filePath);
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\n\nFile closed.");
		}
		System.out.println();

	}

}
