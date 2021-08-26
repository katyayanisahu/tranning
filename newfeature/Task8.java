package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
public static void main(String[] args) {
	List<String> names = new ArrayList<>();
    
	names.add("Aayush");
	         
	names.add("John");
	         
	names.add("Suman");
	         
	names.add("Rohan");
	         
	names.add("Kirtesh");
	         
	//Sorting the names according to their length
	         
	names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);
	         

}
}
