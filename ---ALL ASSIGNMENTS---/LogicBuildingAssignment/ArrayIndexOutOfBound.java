package com.techment.assign1;

import java.util.Scanner;

public class ArrayIndexOutOfBound 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int arr_size = sc.nextInt();
		int[] arr = new int[arr_size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter the index of the element you want to access: ");
		int index = sc.nextInt();
		try
		{
			System.out.println("The element at Index: "+ index + " is -> "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
		
		sc.close();
	}

}
