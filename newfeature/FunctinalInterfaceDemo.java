package com.techment.day12.newfeature;
@FunctionalInterface
interface Bank1
{
	 void rateOfInterest();
	 default void display() {
		 System.out.println("this is a default method");
	 }
	 static void loan()
	 {
		 System.out.println("you can apply for loan");
	 }
}
public class FunctinalInterfaceDemo {
 public static void main(String[] args) {
	
}
}


