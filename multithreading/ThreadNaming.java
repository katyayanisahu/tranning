package com.techment.multithreading;
class Apple extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("eat apple"+Thread.currentThread().getName());
	    }
    }
}	
class Banana extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("eat banana"+Thread.currentThread().getName());
		}
    }	
}
public class ThreadNaming {
  public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName()); 
	Apple apple=new Apple();
	Banana banana=new Banana();
	
	apple.setName("Apple thread");
	banana.setName("banana thread ");
	
	banana.setPriority(8);
	apple.setPriority(1);
	apple.start();
	banana.start();
 }
}
