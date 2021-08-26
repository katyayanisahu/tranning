package com.techment.day12.newfeature;
import java.util.function.Predicate;
import java.util.function.Function;
public class InbuiltFunctionalInterface {
public static void main(String[] args) {
	Predicate<Integer> predicate = (num)->num>18;
	System.out.println(predicate.test(20));
	
	Predicate<String> strPredicate=(name)->name.contains("b");
	System.out.println(strPredicate.test("kirti"));
	Function<Integer, Integer> function = (num1)-> num1;
	Function<Integer, String> function2 = (num1)-> "The value of " +num1;
	Function<String, Integer> function3 = (num1)-> num1.length();
	
	System.out.println(function.apply(25));
	System.out.println(function2.apply(25));
	System.out.println(function3.apply("Raghu"));
}	
}

