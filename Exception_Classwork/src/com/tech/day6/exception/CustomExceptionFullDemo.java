package com.tech.day6.exception;
public class CustomExceptionFullDemo {

	public static void main(String[] args) {
		
		
		Account account = new Account();
		
		try    //
		{
			System.out.println(account.withdraw(20000));
		}
		catch(InsufficientFunOfException e)
		{
		System.out.println(e.getMessage());
		}
	}		
		
}


