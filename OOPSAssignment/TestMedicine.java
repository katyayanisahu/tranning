package com.techment.OOPSAssignment;
import java.util.Random;
import java.util.stream.IntStream;
abstract class Medicine {
	int price;
	int expirydate;
	abstract void displayLabel();	
	public void getDetails()
	{
		System.out.println("price:"+price);
		System.out.println("expiry date:"+expirydate);
	}
	
}
class Tablet extends Medicine
{
	public void displayLabel()
	{
	   System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicine
{
	public void displayLabel()
	{
	   System.out.println("store in a cool dry place");
	}
}
class Ointment extends Medicine
{
	public void displayLabel()
	{
	   System.out.println("for external use only");
	}
}

public class TestMedicine {
   public static void main(String[] args) {
	    int[] Arr = new int[5];
	    IntStream random_no;
	    Random random1 = new Random();
	    random_no = random1.ints(1, 3);
	    //Medicine obj=new Medicine;
	    if(random_no==1)
	    {	
	    	Tablet obj1=new Tablet();
	    	obj1.displayLabel();
	    	
	    	elseif(random_no==2)
	    	{
	    		System.out.println("Syrup");
	    	}
	    	else 
	    	{
	    	System.out.println("Ointment");
	    	}
	    }
	    
	    Syrup obj2=new Syrup();
	    Ointment obj3=new Ointment();
	    
   }
}  

