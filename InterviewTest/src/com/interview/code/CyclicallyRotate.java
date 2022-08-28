package com.interview.code;

import java.util.Arrays;

public class CyclicallyRotate {
	
	/*
	static int arr[] = new int[]{1, 2, 3, 4, 5};
     
    
    static void rotate()
    {
       int i = 0, j = arr.length - 1;
       while(i != j)
       {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
       }
    }
     
    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
         
        rotate();
        
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
    */
	
	    // Function to right-rotate an array by one position
	    public static void rightRotateByOne(int[] A)
	    {
	        int last = A[A.length - 1];
	        for (int i = A.length - 2; i >= 0; i--) {
	            A[i + 1] = A[i];
	        }
	 
	        A[0] = last;
	    }
	 
	    // Function to right-rotate an array by `k` positions
	    public static void rightRotate(int[] A, int k)
	    {
	        // base case: invalid input
	        if (k < 0 || k >= A.length) {
	            return;
	        }
	 
	        for (int i = 0; i < k; i++) {
	            rightRotateByOne(A);
	        }
	    }
	    
	    public static void printOutPut(int[] A) {
	    	int[] out = new int[4];
	    	for(int i = 0; i < 4; i++) {
	    		out[i] = A[i];
	    	}
	    	System.out.println(Arrays.toString(out));
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] A = { 1, 2, 3, 4, 5, 6};
	        int k = 0;
	        
	        for(int i = 0; i < 7; i++) {
	        	rightRotate(A, k);
	        	printOutPut(A);
	        	k = 2;
	        }
	        
	        //System.out.println(Arrays.toString(A));
	    }
}
