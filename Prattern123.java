package com.assignment;

public class Prattern123 
{
	 public static void printPattern(int n)
	    {
	        int i, j;
	        for (i = 1; i <= n; i++) 
	        {
	            for (j = 1; j <= i; j++) 
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }
	    }
	    public static void main(String args[])
	    {
	        int n = 5;
	        printPattern(n);
	    }
	}

