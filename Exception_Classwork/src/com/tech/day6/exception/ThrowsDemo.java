package com.tech.day6.exception;
class Student{
	void checkEligibility(int age) throws ArithmeticException
	{
		if(age>=18)
			System.out.println("you can apply for loan");
		else
			throw new ArithmeticException("you cannot apply for loan");
	}
}
public class ThrowsDemo {
  public static void main(String[] args) {
	Student student=new Student();
	student.checkEligibility(15);
}
}
