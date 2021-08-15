package com.techment.dao;
import java.util.ArrayList;
import java.util.Collection;

import java.util.List;
import java.util.Map;

import com.techment.modal.Employee;
import com.techment.utility.CollectionUtil;



public class EmployeeDaoImpl implements IEmployeeDao
{
 CollectionUtil collectionUtil=new CollectionUtil();

@Override
public Employee getEmployeeById(int id) {
	// TODO Auto-generated method stub
	Map<Integer,Employee> empMap=collectionUtil.getEmployeeList();
	Employee  employee=empMap.get(id);
	return employee;
}

@Override
public List<Employee> getEmployeeByDept(String dept) {
	// TODO Auto-generated method stub
	List<Employee> employeeList=new ArrayList<Employee>();
	Map<Integer,Employee> empMap=collectionUtil.getEmployeeList();
	
	for(Employee employee:empMap.values())
	{
		if(employee.getDept().equalsIgnoreCase(dept))
		{
			employeeList.add(employee);
		}
	}
	
	return employeeList;
 }	
}
 
