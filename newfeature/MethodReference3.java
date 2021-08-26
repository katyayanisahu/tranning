package com.techment.day12.newfeature;
interface CalculateTest
{
		int add(int a,int b);
}
class CalculationUtil
{
		int addition(int a,int b)
		{
			return a+b;
		}
}
class Sub
{
		int Substract(int a,int b)
		{
			return a-b;
		}
}
public class MethodReference3 {	
	public static void main(String[] args) {
		CalculateTest cal=(a,b)->a+b;
		System.out.println(cal.add(2, 4));
		
		CalculateTest cal2=(a,b)->a-b;
		System.out.println(cal.add(12, 4));
		
		CalculationUtil calculationUtil=new CalculationUtil();  
		CalculateTest c1=calculationUtil::addition;

		CalculateTest c2=calculationUtil::Substract;
		System.out.println(c1.add(1,1));
		System.out.println(c2.add(1,1));
	}
}
