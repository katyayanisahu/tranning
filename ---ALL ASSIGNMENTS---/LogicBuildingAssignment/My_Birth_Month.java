package com.techment.assign1;
import java.util.Scanner;
public class My_Birth_Month
{
		  public static void main(String[] args)
		  {
			Scanner sc = new Scanner(System.in);
		    System.out.println("enter your month of your birth:");
		    int birth_mon=sc.nextInt();
		    String monthName="";
		  
			switch(birth_mon){    
		    //case statements within the switch block  
		    case 1: 
		    	 monthName ="January";
		         break;    
		    case 2:
		    	monthName="February";  
		        break;
		    case 3:
		    	monthName="March";
		        break;    
		    case 4:
		    	monthName="April";
		        break;    
		    case 5: 
		    	monthName="May";  
		        break;    
		    case 6:
		    	monthName="June";  
		        break;    
		    case 7: 
		    	monthName="July";  
		        break;    
		    case 8:
		    	monthName="August";
		        break;    
		    case 9: 
		    	monthName="September";  
		        break;    
		    case 10: 
		    	monthName="October";  
		        break;
		    case 11: 
		    	 monthName="November";  
		         break;    
		    case 12:
		    	monthName="December"; 
		        break;    
		    default:
		    	System.out.println("Invalid Month!");    
		    }    
		    //Printing month of the given number  
		    System.out.println(monthName);  
		}    
}

