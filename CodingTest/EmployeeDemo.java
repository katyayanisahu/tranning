package com.techment.CodingTest;

class Employee {
	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee employee1 = new Employee("kajal", "sahu");
		Employee employee2 = new Employee("rohan", "Gupta");
		Employee employee3 = new Employee("payal", "Sharma");

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}