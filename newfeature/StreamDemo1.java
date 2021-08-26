package com.techment.day12.newfeature;
import java.util.ArrayList;
public class StreamDemo1 {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<Integer>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	System.out.println(nums);
	nums.stream().forEach(i->System.out.println(i));
	
	//by using Method reference
	nums.stream().forEach(System.out::println);
 }

}

