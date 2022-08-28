package com.interview.code;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int i,m=0, flag =0;
		int n;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if(n ==0 || n ==1) {
			System.out.println(n + " is not Prime Number!");
		}
		
		if(n%2 == 0) {
			System.out.println(n + " not Prime Number!");
		}else {
			System.out.println(n + " is Prime Number!");
		}
		
	}

}
