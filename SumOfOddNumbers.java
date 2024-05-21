package com.assignment;

import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        int sum = 0;
        int count = 1;
        
        for (int i = 1; count <= n; i += 2) {
            sum += i;
            count++;
        }
        
        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);
        input.close();
    }
}
