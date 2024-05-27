package com.assignment;

import java.util.Arrays;

public class CopyArray {
public static void main(String[] args) {
	 // Declare  array 
    int a[] = {25, 14, 40, 15, 50};
    
    // Declare array 
    int a1[] = new int[5];     

    // Print the array using Arrays.toString() method
    System.out.println("Array : " + Arrays.toString(a));     
    
    // Loop to copy elements 
    for (int i = 0; i < a.length; i++) {
        a1[i] = a[i];
    }
    System.out.println("New Array: " + Arrays.toString(a1));
}
}
