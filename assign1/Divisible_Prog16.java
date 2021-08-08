package com.techment.assign1;


	import java.util.Scanner;
	public class Divisible_Prog16
	{
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();
	        
	        if (n % 8 == 0 && n % 3 == 0)
	            System.out.println("Divisible by 8 and 3");
	        else if (n % 3 == 0)
	            System.out.println("Divisible by 8 but not by 3");
	        else if (n % 5 == 0)
	            System.out.println("Divisible by 8 but not by 3");
	        else
	            System.out.println("Neither divisible by 8 nor by 3");
	    }
	}

