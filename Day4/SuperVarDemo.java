package com.techment.Day4;
class Parent{
	int a=5;
}
class Child extends Parent{
	int a=10;
	void sum()
	{
		int a=15;
		int c=a+a;
		System.out.println("sum:"+c);
	}
}
public class SuperVarDemo {
	public static void main(String[] args)
	{
		Child c=new Child();
		c.sum();
	}
}	
