package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
    
	names.add("Aayush");
    
	names.add("John");
	         
	names.add("Suman");
	         
	names.add("Rohan");
	         
	names.add("Kirtesh");
	         
	if(names.stream().anyMatch((String name) -> name.length() == 5))
	{
	    System.out.println("Yes... There is a name exist with 5 letters");
	}
}
}
