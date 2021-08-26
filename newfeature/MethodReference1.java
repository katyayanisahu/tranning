package com.techment.day12.newfeature;
interface Calculation1
{
	void display();
}
class Hello
{
	void message()
	{
	  System.out.println("today is holiday");
	}
	
}
public class MethodReference1 {
public static void main(String[] args) {
	Calculation1 calculation=()->System.out.println("display method");
	calculation.display();
	
	Hello hello=new Hello();
	Calculation1 calculation2=hello::message;
	calculation2.display();
}
}
