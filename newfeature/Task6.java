package com.techment.day12.newfeature;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;
public class Task6 {
	public static void main(String[] args) {
	List<String> names = new ArrayList<>();
    
	names.add("Aayush");
    
	names.add("John");
	         
	names.add("Suman");
	         
	names.add("Rohan");
	         
	names.add("Kirtesh");
	         
	names.add("David");
	         
	names.add("Brijesh");
	         
	//Skipping first 4 names
	         
	names.stream().skip(4).forEach(System.out::println);
	}	
}
