package com.techment.assign1;
import java.util.Scanner;
class Glass_house
{
    public static void main(String args[])
	{
	    int i,rem,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a two dgt no");
		int a=obj.nextInt();
		while(a>0)
		{
		    rem=a%10;
			sum=sum+rem;
			a=a/10;
	    }
		System.out.format("Exit door no. of the glass house is=%d",sum);
	}
}	
        		
		