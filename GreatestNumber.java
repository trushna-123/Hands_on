package com.assignment;

import java.util.Scanner;

public class GreatestNumber
{
	public static void main(String[] args)   
	{  
	int a, b, c, greatest, temp;    
	Scanner sc = new Scanner(System.in);    
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	System.out.println("Enter the third number:");  
	c = sc.nextInt();    
	temp=a>b?a:b;  
	greatest=c>temp?c:temp;    
	System.out.println("The greatest number is: "+greatest);  
	}  
}  

