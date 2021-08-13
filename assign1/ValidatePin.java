package com.techment.assign1;

import java.util.Scanner;
public class ValidatePin {
	public static void main(String[] args) {
		int pin = 123456;
		Scanner sc = new Scanner(System.in);
		
		int enter_pin;
		do
		{
			System.out.println("Enter your PIN: ");
			enter_pin = sc.nextInt();
			if(enter_pin == pin) {
				System.out.println("PIN is correct");
			}else {
				System.out.println("PIN is incorrect.");
			}
		}while(enter_pin != pin);
		sc.close();
	}

}

