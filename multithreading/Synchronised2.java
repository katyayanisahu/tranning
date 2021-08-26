package com.techment.multithreading;
class Water1
{

		    
	         public void drinkWater(int time)
	         {
	         synchronized(this)
		     {
			  for(int i=1;i<=time;i++)
			  {
				System.out.println(Thread.currentThread().getName()+" is drinking water" + i + "times");
			  }
		    }
			for(int i=1;i<=time;i++)
			{
				System.out.println(Thread.currentThread().getName()+" is drinking water" + i + "times");
			}
	        }			
}
class WaterBottle1 implements Runnable
{
		Water1 water=new Water1();
		@Override
		public void run()
		{
			water.drinkWater(5);
		}
}
public class Synchronised2 {
public static void main(String[] args) {
		WaterBottle1 waterBottle=new WaterBottle1();
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
