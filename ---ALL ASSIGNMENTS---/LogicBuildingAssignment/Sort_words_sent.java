package com.techment.assign1;
import java.util.Scanner;
import java.util.Arrays;
class Sort_words_sent
{
    public static void main(String args[])
	{
	    //String conversion to UpperCase & LowerCase:
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any sentence:");
		String str1=sc.nextLine();
		String[] words=str1.split("\\s");
		for(String w:words)
		{
			System.out.println(w);
		}	
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
	}
}	

