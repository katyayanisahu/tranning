package com.techment.Day4;
class Hello
{
	public void write(int num)
	{
		System.out.println("you have written numbers & number is"+num);
	}
	public void write(String msg)
	{
		System.out.println("you have character & character is"+msg);
	}
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int addition(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class OverloadingDemo {
	public static void main(String[] args)
	{
		Hello hello=new Hello();
		hello.write(3);
		hello.write("welcome");
		System.out.println(hello.addition(2,4,10));
    }
}	
	
