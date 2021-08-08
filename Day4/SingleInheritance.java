package com.techment.Day4;

class DemoSingle
{
		int data=40;  
		void msg()
		{
			System.out.println("Hello java"); 
        }  
}		  
public class SingleInheritance extends DemoSingle
{  
		  public static void main(String[] args){  
		  SingleInheritance obj=new SingleInheritance();  
		  System.out.println(obj.data); 
		  obj.msg();
     }  
}  
