package com.techment.assign1;
import java.util.Scanner;
import java.util.Arrays;
class Anagram
{
    public static void main(String args[])
	{
	    //String conversion to UpperCase & LowerCase:
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1");
		String str1=sc.nextLine();
		String upp_str=str1.toUpperCase();
		System.out.println("Upper_case:"+upp_str);
		
		System.out.println("enter string2");
		String str2=sc.nextLine();
		String low_str=str2.toLowerCase();
		System.out.println("Lower_case:"+low_str);
		
		//string  conversions toCharArray:
		String str3="ton";
		String str4="not";
		char[] ch1=str3.toCharArray();
		for(char c1: ch1)
		{
            System.out.println("string 3 conversion toCharArray:"+c1);
        }	
        char[] ch2=str4.toCharArray();
		for(char c2: ch2)
		{
            System.out.println("\nstring 4 conversion toCharArray:"+c2);
        }	
		
		//Sort two CharArray using Sort():
		Arrays.sort(ch1);
		System.out.println("Sort chararray1:"+ch1);
		Arrays.sort(ch2);
		System.out.println("Sort chararray2:"+ch2);
		
		//Compare two arrays using equals()
		String str5="fiber";
		String str6="brief";
		char[] ch3=str5.toCharArray();
		char[] ch4=str6.toCharArray();
		boolean retval=Arrays.equals(ch3,ch4);
		System.out.println("\narr1 & arr2 are equal:"+retval);
		
	}
}	
