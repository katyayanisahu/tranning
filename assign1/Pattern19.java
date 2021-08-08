package com.techment.assign1;

public class Pattern19 {
	    public static void main(String[] args)
	    {
	        for (int i = 6; i >= 1; i--)
	        {
	            for (int j = 6 - i; j >= 1; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j);
	            }
	            for (int j = i - 1; j >= 1; j--)
	            {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
}
