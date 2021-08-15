package com.techment.client;
import java.util.List;
import java.util.Scanner;
import com.techment.service.EmployeeServiceImpl;
import com.techment.service.IEmployeeService;
import com.techment.modal.Employee;

public class EmployeeApplication {
public static void main(String[] args) {
	IEmployeeService service = new EmployeeServiceImpl(); 
	System.out.println("===Employee Application===");
	Scanner scanner=new Scanner(System.in);
    System.out.println("enter the id to fetch employees");
    int  id=scanner.nextInt();
    
	Employee employee=service.getEmployeeById(id);
    System.out.println(employee);
    
    System.out.println("enter the dept to fetch employee");
    String dept=scanner.next();
    List<Employee> employees=service.getEmployeeByDept("hr");
    System.out.println(employees);
  }
}


  
