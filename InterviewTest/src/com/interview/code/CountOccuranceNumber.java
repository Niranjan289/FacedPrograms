package com.interview.code;

public class CountOccuranceNumber {
	public static void main(String[] args) {
		int count;
		
		int counter[] = new int[256];
		
		int input[] = {2,1,2,3,2,5,8,9};
		int len = input.length;
		
		for(int i = 0; i<len; i++) {
			counter[i] = input[i];
		}
		
		int duplicates[] = new int[len];
		for(int i= 0; i < len; i++) {
			for(int j =0; j < i; j++) {
				if(counter[j] == input[i]) {
					duplicates[i] = input[i];
					count = occuranceCount(input, duplicates[i], len);
					System.out.println("Repeated value:" + input[i]+ " repeated count " + count);
				}
			}
		}
	}
	
	public static int occuranceCount(int[] a, int repeatedValue, int l) {
		int flag = 0;
		for(int i=0; i<l; i++) {
			if(repeatedValue == a[i]) {
				flag++;
			}
		}
		return flag;
	}
}
