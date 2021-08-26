package com.techment.multithreading;
class Water
{
	synchronized public void drinkWater(int time)
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking water" + i + "times");
		}
		
	}
}
class WaterBottle implements Runnable
{
	Water water=new Water();
	@Override
	public void run()
	{
		water.drinkWater(5);
	}
}
public class SynchronizationDemo {
public static void main(String[] args) {
	WaterBottle waterBottle=new WaterBottle();
	Thread person1=new Thread(waterBottle);
	Thread person2=new Thread(waterBottle);
	Thread person3=new Thread(waterBottle);
	
	person1.start();
	person2.start();
	person3.start();
	
	person1.setName("arpit");
	person2.setName("divya");
	person3.setName("gitika");
	
}
}
