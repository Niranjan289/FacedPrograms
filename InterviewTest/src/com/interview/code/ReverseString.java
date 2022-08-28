package com.interview.code;
public class ReverseString {
	public static void main(String[] args) {
		String str = "qwerty";
		
		int len = str.length();
		
		for(int i =  len - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
