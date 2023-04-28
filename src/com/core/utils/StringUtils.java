package com.core.utils;

public class StringUtils {
	
	public static String getFilename(String s) {
		String segments[] = s.split("/");
		if (segments.length < 1) return null;
		return segments[segments.length-1];
	}
	
	public static String getPath(String s) {
		String segments[] = s.split("/");
		if (segments.length < 1) return null;
		int lastSegmentLength = segments[segments.length-1].length();
		return s.substring(0, s.length()-lastSegmentLength);
	}

}
