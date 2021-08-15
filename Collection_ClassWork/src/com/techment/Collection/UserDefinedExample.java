package com.techment.Collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int id;
	String name;
	String dept;
	int age;
	public Employee(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	public int compareTo(Employee o)
	{
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return -1;
		else return 1;
	}
	
}    
public class UserDefinedExample
{
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"ram","hr",32));
		employees.add(new Employee(2,"kajal","manager",35));
		employees.add(new Employee(3,"sohan","developer",26));
		
		for(Employee emp:employees)
		{
			System.out.println(emp.id+" "+emp.name +" "+emp.dept+" "+emp.age);
			
		}
		Collections.sort(employees);
		System.out.println("==after sorting==");
		for(Employee emp:employees)
		{
			System.out.println(emp.id+" "+emp.name +" "+emp.dept+" "+emp.age);
			
		}
		
	}
}


