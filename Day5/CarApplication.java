package com.techment.Day5;
class Car1
{
	int model;//global variable
	String color;
	int speed;
	
	Car1(int model,String color)
	{
		this.model=model;
		this.color=color;
	
	}
	public String carstate(int speed)
	{
		if(speed>=50)
		   return "car is moving fast";
		else if(speed>0 && speed<=49)
		   return "car is moving slow";
		else
		return "car is stopped";
	}
	public void displayCarDetails()
	{
		System.out.println("Model:"+model);
		System.out.println("Color:"+color);
	}
}
public class CarApplication {
	public static void main(String[] args)
	{
		Car1 audi=new Car1(1,"red");
		Car1 benz=new Car1(2,"white");
		audi.displayCarDetails();
		benz.displayCarDetails();
	    System.out.println("audi:"+audi.carstate(29));
	    System.out.println("benz:"+benz.carstate(51));
		
	}
}
