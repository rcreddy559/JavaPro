package com.org.hackerrank.Operators;

import java.util.Scanner;

public class PercentCal {

	// Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	System.out.println("meal_cost:"+meal_cost+"; tip_percent:"+tip_percent+"; tax_percent:"+tax_percent);
        
    	Double tip = meal_cost*tip_percent/100;
        System.out.println("tip:tip/100 "+(tip/100));
        
        Double tax = meal_cost*tax_percent/100;
        System.out.println("tax: "+tax);
        
        int  totalCost = (int)Math.round( meal_cost+tip+tax);
        System.out.println("totalCost: "+totalCost);
        
        System.out.println("The total meal cost is "+totalCost+" dollars." );
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        int firstInt = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        double secondValue = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String printString = scan.nextLine();
        
        System.out.println(firstInt+i);
        System.out.println(secondValue+d);
        System.out.println(s+printString);
        scan.close();

    }
}
