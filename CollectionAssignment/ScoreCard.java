package com.techment.CollectionAssignment;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.HashMap;
public class ScoreCard {

private static final Object a = null;

public static void main(String[] args) {
	int sum=0;
	Map.Entry<String,Integer> max=null;
	 Map<String,Integer> runs=new TreeMap<String,Integer>(); 

	runs.put("Rahane",20);
	
	runs.put("Rahul",30);
	
	runs.put("Kohli",150);
	
	runs.put("Dhoni",50);
	
	runs.put("Lokesh",2);
	
	for(Map.Entry<String,Integer> e: runs.entrySet())
	{
		
		System.out.println(e.getKey());
	}
	System.out.println();
	System.out.println("Scores by players");
	for(Map.Entry<String,Integer> e: runs.entrySet())
	{
		 
		System.out.println(e);
	
	}
	for(Map.Entry<String,Integer> e:runs.entrySet())
	{
		Integer scores=e.getValue();
		sum+=scores;
	}
	for(Map.Entry<String,Integer> e:runs.entrySet())
	{
		if(max==null || e.getValue().compareTo(max.getValue())>0)
				{
			          max=e;
				}
	}
	System.out.println("Total Score: "+sum);
	System.out.println("Name of highest Score:"+max.getKey());
	System.out.println("Runs scored by Dhoni:"+runs.get("Dhoni"));
  }
}
