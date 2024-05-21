package com.assignment;

import java.util.Scanner;

public class DaysInMonth {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the month (1-12): ");
	        int month = input.nextInt();
	        
	        if(month < 1 || month > 12) {
	            System.out.println("Invalid month. Please enter a number between 1 and 12.");
	        } else {
	            int days;
	            
	            if(month == 2) {
	                days = 28; 
	            } else if(month == 4 || month == 6 || month == 9 || month == 11) {
	                days = 30;
	            } else {
	                days = 31;
	            }
	            
	            System.out.println("Number of days in month " + month + " is: " + days);
	        }
	        
	        input.close();
	    }
}
