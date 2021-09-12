package com.techment.assign1;

import java.util.Scanner;

class Prime_Numbers  
{  
public static void main(String[] args)   
{  
    int count=0,n=0,i=1,j=1;  
    while(n<7)  
    {  
       j=1;  
       count=0;  
       while(j<=i)  
       {  
          if(i%j==0)  
          count++;  
          j++;   
       }  
       if(count==2)  
       {  
           System.out.printf("%d ",i);  
           n++;  
       }  
       i++;  
    }  
     Scanner sc=new Scanner(System.in);
     System.out.println("\nEnter any no:");
     int m=sc.nextInt();
     if(isPrime(m))
     {  
         System.out.println(m + " is a prime number");  
     } 
     else 
     {  
         System.out.println(m + " is not a prime number");  
     }  
 }  

 public static boolean isPrime(int m) {  
     if (m <= 1) {  
         return false;  
     }  
     for (int k = 2; k < Math.sqrt(m); k++) {  
         if (m % k == 0) {  
             return false;  
         }  
     }  
     return true;  
 }  
} 
    	 
     
    


