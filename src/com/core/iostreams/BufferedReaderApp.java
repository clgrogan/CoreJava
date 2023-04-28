package com.core.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;

public class BufferedReaderApp {

	public static void main(String[] args) {
		
		String filePath = "/Users/cgrogan/dev/aCoreJava/CoreJava/resources/files/localfile.txt";

		int count = 0;
		try (Reader reader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(reader)){

			String line;
			while((line=bufferedReader.readLine())!=null ) {
				StringTokenizer st = new StringTokenizer(line);
				count += st.countTokens();
				while(st.hasMoreTokens()) System.out.println("\t"+st.nextToken());
			}		
			System.out.println("\nNumber of words in the file: "+ count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

}
