package com.assignment;

import java.util.Scanner;

public class CubeCalculator {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter an integer: ");
	        int num = input.nextInt();
	        
	        for (int i = 1; i <= num; i++) {
	            int cube = i*i*i;
	            System.out.println("Cube of " + i + " is: " + cube);
	        }
	        
	        input.close();
	    }
}
