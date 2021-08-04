package com.tech.day4;

class P {
		private int data=40;  
		private void msg(){System.out.println("Hello java");}  
		}  
		  
public class Simple{  
		 public static void main(String args[]){  
		   P obj=new P();  
		   System.out.println(obj.data);//Compile Time Error  
		   obj.msg();//Compile Time Error  
		   }  
		}  
}
