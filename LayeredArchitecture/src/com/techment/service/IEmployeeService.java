package com.techment.service;
import java.util.List;
import com.techment.modal.Employee;

public interface IEmployeeService {
	 Employee getEmployeeById(int id);
	 List<Employee> getEmployeeByDept(String Dept);
}


