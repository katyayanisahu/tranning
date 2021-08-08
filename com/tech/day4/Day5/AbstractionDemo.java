package com.techment.Day5;
abstract class Bank {
	void Eligibilty()
	{
		System.out.println("above 18 can open an account");
    }
	abstract int rateOfInterest(int interestRate);
}	
class Axis extends Bank
{
	int rateOfInterest(int interestRate)
	{
		interestRate=2*interestRate;
		return interestRate;
	}
}
class Kotak extends Bank
{
	int rateOfInterest(int interestRate)
	{
		interestRate=2*interestRate;
		return interestRate;
	}
}
public class AbstractionDemo
{
	 public static void main(String[] args)
	    {
	       Bank bank=new Axis();
	       System.out.println(bank.rateOfInterest(5));
	       
        }
}	 
	 
