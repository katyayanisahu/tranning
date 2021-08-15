package com.techment.Collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo1 
{
 public static void main(String[] args) {
	Student student1=new Student(1,"kajal",23);
	Student student2=new Student(1,"rani",18);
	System.out.println(student1.hashCode());
	System.out.println(student2.hashCode());
	
	HashMap<Student,String> hm=new HashMap<Student,String>();
	hm.put(new Student(1,"kajal",24),"cse");
	hm.put(new Student(2,"tripti",24),"cse");
	
	for(Entry<Student, String> stu:hm.entrySet())
	{
		System.out.println(stu);
	}
  }
}
