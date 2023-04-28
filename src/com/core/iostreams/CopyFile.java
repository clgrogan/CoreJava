package com.core.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.core.utils.StringUtils;

import java.io.File;

public class CopyFile {
	/**
	 * 
	 * Use FileInputStream and FileOutputStream to copy a file.
	 * 
	 */
	private static final String[] filePaths = new String[] {
			"/Users/cgrogan/dev/aCoreJava/CoreJava/resources/files/localfile.txt",
			"/Users/cgrogan/Family/KidsSchool/CurtGAxes.png" };

	public static void main(String[] args) throws IOException {
		System.out.println("\n\tIO Streams Demonstration Using\n FileInputStream/FileOutputStream and\n\tFileReader/FileWriter\n");

		for (String filePath : filePaths)
			copyFile(filePath);
		for (String filePath : filePaths)
			copyCharacterFile(filePath);

		System.out.println("Interestingly, provided the byte and character stream IO classes are paired correctly,\nthe file read and write work fine for a text file and a png file.\n");
	}

	private static void copyFile(String filePath) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String path;
		String fileName;
		String newFilePath;
		System.out.println("copyFile(String filePath) executing with arg: " + filePath);

		path = StringUtils.getPath(filePath);
		fileName = StringUtils.getFilename(filePath);
		try {
			fis = new FileInputStream(new File(filePath));
			newFilePath = (path + "copy of " + fileName);
			fos = new FileOutputStream(new File(newFilePath));
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("\tFile copied from " + StringUtils.getFilename(filePath) + " to file "
					+ StringUtils.getFilename(newFilePath) + ".\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void copyCharacterFile(String filePath) throws IOException {

		System.out.println("copyCharacterFile(String filePath) executing with arg: " + filePath);
		String path = StringUtils.getPath(filePath);
		String fileName = StringUtils.getFilename(path);
		String newFilePath = (path + "copy of " + fileName);
		FileReader fr = new FileReader(new File(filePath));
		FileWriter fw = new FileWriter(new File(newFilePath));
		int data;
		while ((data = fr.read()) != -1) {
			fw.write(data);
		}
		System.out.println("\tFile copied from " + StringUtils.getFilename(filePath) + " to file "
				+ StringUtils.getFilename(newFilePath) + ".\n");
		fr.close();
		fw.close();
	}

}
