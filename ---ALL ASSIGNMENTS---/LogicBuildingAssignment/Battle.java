package com.techment.assign1;

import java.util.Scanner;
public class Battle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number : ");
		a = sc.nextInt();
		System.out.println("Enter second number : ");
		b = sc.nextInt();
		for(int i=a; i<=b ; i++)
			System.out.println(i);
		}
}

