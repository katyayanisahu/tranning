package com.techment.utility;

import java.util.HashMap;
import java.util.Map;
import com.techment.modal.Employee;

public class CollectionUtil {
  static Map<Integer,Employee> employees=new HashMap<Integer,Employee>();
  static
  {
	  employees.put(1,new Employee(1,"john","hr",45000));
	  employees.put(2,new Employee(2,"punam","developer",25000));
	  employees.put(3,new Employee(3,"raj","manager",35000));
	  employees.put(4,new Employee(4,"deepak","hr",15000));
	  
  }
  public static Map<Integer,Employee> getEmployeeList()
  {
	  return employees;
  }
}
