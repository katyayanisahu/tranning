package com.techment.modal;

public class GreeterService
{
	Greeting greeting;

    public void printGreeting() {
	     	System.out.println(greeting.greet());  
	 
    }
  
//public GreeterService(Greeting greeting) {
	//super();
	//this.greeting = greeting;
//}

public Greeting getGreeting() {
	return greeting;
}

public void setGreeting(Greeting greeting) {
	this.greeting = greeting;
}

}

