package com.assignment;

import java.util.Scanner;

public class WeekDay 
{ public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number between 1 and 7: ");
    int num = input.nextInt();
    
    String weekday = "";
    
    switch(num) {
        case 1:
            weekday = "Sunday";
            break;
        case 2:
            weekday = "Monday";
            break;
        case 3:
            weekday = "Tuesday";
            break;
        case 4:
            weekday = "Wednesday";
            break;
        case 5:
            weekday = "Thursday";
            break;
        case 6:
            weekday = "Friday";
            break;
        case 7:
            weekday = "Saturday";
            break;
        default:
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
            System.exit(0);
    }
    
    System.out.println(" In Week day of " + num + " is: " + weekday);
    
    input.close();
}
}

