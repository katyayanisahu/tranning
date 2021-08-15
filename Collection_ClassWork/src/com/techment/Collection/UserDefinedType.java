package com.techment.Collection;
import java.util.ArrayList;

public class UserDefinedType {

	public static void main(String[] args) {
		
		
		Employee1 emp1 = new Employee1(1,"kirti","Developer");
		Employee1 emp2 = new Employee1(2,"payal","Hr");

		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee1(3,"shubham","developer"));
		
		
		/*for(Employee emp : employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
		}
		*/
		
		for (Employee1 emp :employees)           // for gutter and setter
				 {
			if(emp.getId()>2)
				emp.setDept("Manager");
			
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept());
			
		}
		
		
	}

}
