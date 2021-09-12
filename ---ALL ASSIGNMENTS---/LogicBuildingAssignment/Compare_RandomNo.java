package com.techment.assign1;

import java.util.Random;
import java.util.Scanner;

public class Compare_RandomNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		Random random = new Random();
		int random_number = random.nextInt(100);
		do
		{
			System.out.println("Enter any number between 1 to 100:");
			number = sc.nextInt();
			
			
				if(number == random_number) {
					System.out.println("You guessed it right.");
				}else {
					System.out.println("Your guess does not match the value.");
				}
		}while(number != random_number);

			sc.close();
	}

}

