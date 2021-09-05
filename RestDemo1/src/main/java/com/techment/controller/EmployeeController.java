package com.techment.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {
	
	ArrayList<Employee> employees=new ArrayList<Employee>();
	
	public EmployeeController(ArrayList<Employee> employees) {
		super();
		this.employees = employees;
		employees.add(new Employee(1,"rajshri","hr"));
		employees.add(new Employee(2,"gitika","developer"));		
	}
	
	@GetMapping(value="/showEmployee")
	public String display()
	{
		return "this is my first demo";
	}
	
	@GetMapping(value="/getAllEmployee")
	public ArrayList<Employee> showEmployees()
	{
		employees=new ArrayList<Employee>();
		
		return employees;
	}
	//@RequestMapping(method=RequestMethod.POST)
	@PostMapping(value="addNewEmployee")
	public String addEmployee(@RequestBody Employee employee)
	{ 
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDept());
		employees.add(employee);
		return "employee added";
	}
}

