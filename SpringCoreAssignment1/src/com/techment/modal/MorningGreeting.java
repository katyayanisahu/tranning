package com.techment.modal;

public class MorningGreeting implements Greeting
{
	public MorningGreeting() {
		super();
	}

	String greeting = "Good Morning.";
	
	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}	