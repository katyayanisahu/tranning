package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.List;
class Task2 
{

	public static void main(String[] args) {
		List<String> names=new ArrayList();
		names.add("Sachin");
		names.add("Ravi");
		names.add("Kumar");
		names.add("Santosh");
		names.add("Dhoni");
		System.out.println("various names in the list "+names);
		//Normal Execution
        
		names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
		         
		//Parallel Execution
		         
		names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);

		
    }
}	
	