package com.techment.Day4;
class Faculty
{
	int id;
	String name;
	String designation;
	static String companyName="techment";
	public Faculty(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	void displayEmployeeDetails() {
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("designation "+designation);
	    System.out.println("companyName "+companyName);
	}
}
public class StaticDemo2 {
	public static void main(String[] args)
	{
		Faculty emp1=new Faculty(10,"rani","CSE");
		Faculty emp2=new Faculty(20,"kavi","Civil");
		Faculty.companyName="techment technology";
		emp1.id=1;
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
	}
}
