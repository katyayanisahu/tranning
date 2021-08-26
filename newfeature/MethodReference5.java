package com.techment.day12.newfeature;
interface CalcDemo
{
		int add(int a,int b);
}
class CalculationUtil1
{
		int addition(int a,int b)
		{
			return a+b;
		}

		int Substract(int a,int b)
		{
			return a-b;
		}
}
public class MethodReference5 {	
	public static void main(String[] args) {
		CalcDemo cal=(a,b)->a+b;
		System.out.println(cal.add(2, 4));
		
		CalcDemo cal2=(a,b)->a-b;
		System.out.println(cal.add(12, 4));
		
		CalculationUtil1 calculationUtil=new CalculationUtil1();  
		CalcDemo c1=calculationUtil::addition;
		System.out.println(c1.add(1,1));
		CalcDemo c2=calculationUtil::Substract;
		System.out.println(c2.add(1,1));
	}
}


