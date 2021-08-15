package com.techment.array;

import java.util.ArrayList;

public class UserDefinedType 
{
   Employee emp1=new Employee(1,"kajal","hr");
   Employee emp2=new Employee(2,"rani","hr");
   
   ArrayList<Employee> emp=new ArrayList<Employee>();
   emp.add(emp1);
   emp.add(emp2);
   emp.add(new Employee(3,"raj","developer"));
   
   for(Employee e:emp)
   {
	   System.out.println(e.id+""+e.name+""+e.dept)
	   
   }
   e.set(1,new Employee(100,"daddu","manager");
   for(Employee e:emp)
   {
	   System.out.println(e.id+""+e.name+""+e.dept)
	   
   }
   
	
}
