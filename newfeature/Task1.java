package com.techment.day12.newfeature;
import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Stream;

public class Task1 {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
    
	names.add("David");
	         
	names.add("Johnson");
	         
	names.add("Samontika");
	         
	names.add("Brijesh");
	         
	names.add("John");
	         
	names.add("David");
	         
	names.add("Brijesh");
	         
	//Selecting only unique names
	         
	names.stream().distinct().forEach(System.out::println);
	         
}
}
