package com.techment.Day5;

public class VaraiableDemo {
     int a=10;//global
     int size=100;
     void display1()
     {
    	 int height=5;//local
    	 int size=1;
    	 System.out.println("a"+a+"height"+height+"size"+size);
     }
     void display2()
     {
    	 int width=5;//local
    	 int size=1;
    	 System.out.println("a"+a+"width"+width);
     }
    
     public static void main(String[] args)
 	 {
    	 VaraiableDemo vardemo=new VaraiableDemo();
    	 vardemo.size=200;
    	 vardemo.display1();
    	 vardemo.display2();
 	 }
}
