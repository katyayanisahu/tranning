package com.techment.array;

import java.util.ArrayList;

public class IteratorDemo {
  public static void main(String args[]) {
  ArrayList<Integer> ol=new ArrayList<Integer>();
    ol.add(1);
    ol.add(2);
    ol.add(3);
    ol.add(4);
    ol.add(5);
    System.out.println("elements of ol:"+ol);
    for(int o:ol)
    {
    	System.out.println(o);
    }
    
  }
 }
