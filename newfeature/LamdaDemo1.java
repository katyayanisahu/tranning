package com.techment.day12.newfeature;
interface Bank2
{
	 void display();
}	
public class LamdaDemo1 {
 public static void main(String[] args) {
	Bank2 bank=()->System.out.println("this is display method");
	bank.display();
	
	Bank2 bank2=()->
	{
		System.out.println("this is display method");
		System.out.println("this is multi line body");
	};
	bank2.display();
}
}

