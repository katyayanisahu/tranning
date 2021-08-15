package com.tech.day6.exception;
public class Account {
	
	int balance=5000;
	
	String withdraw(int amount)
	{
		if(amount>balance)
			throw new InsufficientFunOfException("Insufficeint Fund");
		else
			return "you have withdwar " +amount+ " amount";
	}

}
