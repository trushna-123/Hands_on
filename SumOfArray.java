package com.assignment;

public class SumOfArray
{
public static void main(String[] args)
{
    int a[] = {1, 2, 3, 4, 5}; //Declare  array
    int sum = 0;  // Declare a variable to store the sum
    for (int i : a)
        sum +=i;  // Add each element to the sum
    System.out.println("The sum of array is " + sum);   // Print the sum of the array elements
}
}

