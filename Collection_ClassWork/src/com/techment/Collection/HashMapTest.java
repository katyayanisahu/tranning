package com.techment.Collection;
import java.util.Map;
import java.util.HashMap;
public class HashMapTest {
        	public static void main(String[] args) 
        	{
        		System.out.println("\nHashMap");
        		HashMap<String,Integer> hashMap =new HashMap<String,Integer>();
        		hashMap.put("ravi",2);
        		hashMap.put("rani",5);
        		hashMap.put("raja",8);
        		hashMap.put("hii",2);
        		hashMap.put("hello",3);
        		
        	   System.out.println(hashMap);
        	   for(Map.Entry<String,Integer>e:hashMap.entrySet())
        	   System.out.println(e.getKey()+ ":"+ e.getValue());
        }
}       

