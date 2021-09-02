package com.techment;

public class StudentDto {
 int studentId;
 String name;
 String dept;
 
 
public StudentDto() {
	
}



public StudentDto(int studentId, String name) {
	super();
	this.studentId = studentId;
	this.name = name;
}



public StudentDto(int studentId, String name, String dept) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.dept = dept;
}
 
 
}
