package com.techment.assign1;
import java.util.Scanner;
public class Choosing_Besthorse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the weight of the 1st Horse: ");
		int w1 = sc.nextInt();
		System.out.println("Enter the weight of the 2nd Horse: ");
		int w2 = sc.nextInt();
		System.out.println("Enter the weight of the 3rd Horse: ");
		int w3 = sc.nextInt();
		
		if(w1 > w2 && w2 > w3) 
		{
			System.out.println("Horse 1 has more weight.");
		}
		else if(w2 > w3 && w2 > w1)
		{
			System.out.println("Horse 2 has more weight.");
		}
		else 
		{
			System.out.println("Horse 3 has more weight.");
		}
		sc.close();

	}
}
