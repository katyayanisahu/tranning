package com.techment.arrayAssignment;

import java.util.Scanner;

public class NumPresentOrNot {
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
   	    System.out.println("Enter No.of elements ia an array:");
   	    int n=sc.nextInt();
   	    
   	    int Arr[]=new int[n];
   	    
   	    System.out.println("Enter array elements");
   	    for (int i = 0; i < Arr.length; i++)
              Arr[i]=sc.nextInt();
   	    System.out.println("Enter element to search:");
   	      
   	    int SearchElement=sc.nextInt();
   	    int flag=0,i;		
   	    for(i=0;i<n;i++)
   	    
   	    	if(Arr[i]==SearchElement)
   	    	{
   	    		flag=1;
   	    		break;
   	        }
   	    if(flag==1)
   	          System.out.println(SearchElement+" at position "+(i+1));
   	    else
   	    	
   	    	  System.out.println(-1);
   	    	
   	    
    }  
}	
	

	