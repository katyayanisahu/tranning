package com.techment.assign1;
import java.util.Scanner;
public class TrafficCongestion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter day:");
	    String day=sc.nextLine();
	    System.out.println(getdaynumber(day));
	    int dayindex=getdaynumber(day);
	    if(dayindex == 0)
	    	 System.out.println("Invalid Input");
	    else if(dayindex % 2 == 0)
	         System.out.println("Cars with even registration numbers are permitted today");
	    else
	    	 System.out.println("Cars with odd registration numbers are permitted today");
}
	public static int getdaynumber(String day)
	{
		int dayNum;
		switch(day)
		{
		case "Monday":
			dayNum=1;
			break;
		case "Tuesday":
			dayNum=2;
			break;
		case "Wednesday":
			dayNum=3;
			break;
		case "Thursday":
			dayNum=4;
			break;
		case "Friday":
			dayNum=5;
			break;
		case "Saturday":
			dayNum=6;
			break;
		case "Sunday":
			dayNum=7;
			break;
		default:
			dayNum=0;
			
	   }
	   return dayNum;
	}   
}
	

