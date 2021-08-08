package com.techment.Day4;

class M {
		int data=40;  
		void msg(){System.out.println("Hello java");}  
}  
		  
public class P extends M{  
		  public static void main(String[] args){  
		   P obj=new P();  
		   System.out.println(obj.data); 
		   obj.msg();
		   }  
}  
