package com.techment.assign1;

import java.util.Scanner;

public class Account_Locked {
	public static void main(String[] args) {
		int userEnteredPin,count=0,correctPin=12345;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the pin "); 
				userEnteredPin=sc.nextInt();
				
				while(count!=2) { 
				if(userEnteredPin == correctPin) {
					System.out.println("Accepted");
					break;
					}
				else {
					System.out.println("Incorrect pin, Enter pin again");
					userEnteredPin=sc.nextInt();  
					count++;
					}
				}
				if(count>2) 
					System.out.println("Account Locked");
				sc.close();
			}
}
