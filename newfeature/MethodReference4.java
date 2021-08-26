package com.techment.day12.newfeature;
interface LargeNumber
{
		int largest(int a,int b,int c);
}
class CalculationDemo
{
		int findLargest(int a,int b,int c)
		{
			if(a>b&&a>c)
				return a;
			else if(b>a&&b>c)
				return b;
			else
				return c;
		}
}
public class MethodReference4 {
public static void main(String[] args) {
	LargeNumber largeno=(a,b,c)->
	{

		if(a>b&&a>c)
			return a;
		else if(b>a&&b>c)
			return b;
		else
			return c;
	};
	System.out.println("Func. output:"+largeno.largest(13,15,17));
	CalculationDemo calculationUtil=new CalculationDemo();  
	LargeNumber number=calculationUtil::findLargest;
	System.out.println("number"+largest(34,99,32));
	
  }
}
