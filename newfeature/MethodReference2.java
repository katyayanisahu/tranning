package com.techment.day12.newfeature;
interface Calculate
{
	int add(int a,int b);
}

public class MethodReference2 {
public static void main(String[] args) {
	Calculate cal=(a,b)->a+b;
	System.out.println(cal.add(2, 4));
	
	Calculate cal2=(a,b)->a-b;
	System.out.println(cal.add(12, 4));
}
}
