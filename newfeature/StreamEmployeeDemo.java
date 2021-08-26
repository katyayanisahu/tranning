package com.techment.day12.newfeature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEmployeeDemo {
	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"kajal","developer",12000,38));
		employees.add(new Employee(2,"sonal","manager",23000,23));
		employees.add(new Employee(3,"punam","developer",26000,31));
		employees.add(new Employee(4,"puja","hr",22000,38));
		employees.add(new Employee(5,"rahul","developer",14000,28));
		employees.add(new Employee(6, "sourab", "developer", 70000, 27));
		employees.stream().forEach(s->System.out.println(s));
		
		//to count no of employee
		Long empcount =employees.stream().count();
		System.out.println("total number of employee are "+ empcount);
		
		Long devCount = employees.stream().filter(e->e.getDept1().equals("developer")).count();
		System.out.println("developer count "+ devCount);
		
		employees.stream().filter(e->e.getDept1().equals("developer")).forEach(e->System.out.println("name of developer :"+e.getName()));
		
	  List<Employee> emp=employees.stream().filter(e->e.getDept1().equals("developer")).collect(Collectors.toList());
       System.out.println(emp);
     Long numberOfEmployee =  employees.stream().collect(Collectors.counting());
     System.out.println("no of employee "+numberOfEmployee);
     StreamEmployeeDemo obj = new StreamEmployeeDemo();
     List<Employee> empDepts= obj.filterByDept(employees, "developer");
     System.out.println(empDepts);
		
	Long totalSalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
	System.out.println("total salary :"+totalSalary);
	
	int maxSalary =employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getMax();
	System.out.println("total salary :"+maxSalary);
	
	
	}
	
	
	
	
	List filterByDept(ArrayList<Employee> empList, String dept)
	{
		List<Employee> emp =empList.stream().filter(e->e.getDept1().equals(dept)).collect(Collectors.toList());
		
		return emp;
		
	}
	
	
	
	
}
