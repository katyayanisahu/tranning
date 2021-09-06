package com.techment.modal;

public class University {
	
    Department department;
    int noofstudents;
    
    public void setDepartment(Department department) {
	this.department = department;
    }
    
    public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}

    public void displayDeptDetails()
	{
		department.DeptDetails();
		System.out.println("Noofstudents:"+noofstudents);
	}
}


