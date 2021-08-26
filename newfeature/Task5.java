package com.techment.day12.newfeature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
public static void main(String[] args) {
	List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");
    
	Stream<String> stream = nameList.stream();
	         
	stream.forEach(System.out::println);
	
	         
	stream.forEach(System.out::println);    
	         
 }
}
