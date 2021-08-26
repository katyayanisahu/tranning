package com.techment.day12.newfeature;
import java.util.ArrayList;
import java.util.List;
public class Task7 {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
    
	names.add("Aayush");
    
	names.add("John");
	         
	names.add("Suman");
	         
	names.add("Rohan");
	         
	names.add("Kirtesh");
	         
	//Returns length of each name
	                names.stream().map(String::length).forEach(System.out::println);
	         
}
}
