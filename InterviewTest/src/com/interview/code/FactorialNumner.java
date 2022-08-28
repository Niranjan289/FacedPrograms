package com.interview.code;

public class FactorialNumner {
	//4 = 4*3*2*1
	public static void main(String[] args) {
		System.out.println(fact(4));
	}
	
	public static int fact(int n) {
		int total = 1;
		for(int i = 1; i <= n; i++) {
			total = total*i; // 12 12 4
		}
		return total;	
	}

}
