package com.techment.multithreading;
class Sanika extends Thread
{
  public void run()
  {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println("sanika:"+i +"msg:welcome to banglore");
	  }
  }
}
class Parul extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		  {
			 if(i==3)
			 {
			    try {
			    	Thread.sleep(5000);
			    }
			    catch(InterruptedException e)
			    {
			    	e.printStackTrace();
			    }
			  System.out.println("Parul:"+i +"msg:Take vaccination");
		     }
	      }
    }
}	
class Amit extends Thread
{
	public void run()
	{
		 for(int i=1;i<=8;i++)
		  {
			  System.out.println("Amit:"+i +"msg:Covid 19 is not over yet");
		  }
	}
}
public class Multitasking {
public static void main(String[] args) {
	Sanika sanika=new Sanika();
	Parul parul=new Parul();
	Amit amit=new Amit();
	
	//sanika.run();
	//parul.run();
	//amit.run();
	
	sanika.start();
	parul.start();
	amit.start();
	
 }
}
