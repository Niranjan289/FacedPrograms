package com.interview.code;

public class SubStringOfString {
	
	public static void subString(String str, int len) {
		for(int i = 0; i<len; i++) {
			for(int j= i+1; j<= len;j++) {
				System.out.println( str.substring(i,j));
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abcd";
		subString(str, str.length());
	}

}
