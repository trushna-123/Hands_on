package com.assignment;

import java.util.Scanner;

public class NaturalNumbersSum {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        int sum = 0;
        
        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        
        System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
        
        input.close();
    }
}
