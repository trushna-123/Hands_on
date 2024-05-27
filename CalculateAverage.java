package com.assignment;

public class CalculateAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an integer array numbers and initialize it with values
        int[] numbers = new int[]{20, 30, 49, 30, 60, 10};
        
        // Initialize a variable sum to store the sum of array elements
        int sum = 0;
        
        // Use a for loop to iterate over the elements of the numbers array
        for (int i = 0; i < numbers.length; i++) {
            // Add the  sum of current element 
            sum = sum + numbers[i];
        }
        
        // Calculate the average value by dividing the sum by the number of elements
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average); 
    }
	}
