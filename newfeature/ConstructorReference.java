package com.techment.day12.newfeature;
@FunctionalInterface
interface A
{
	Student getStudentDetails();
	
}
class Student
{
	int id;
	String name;
	
	void display()
	{
		System.out.println("this is student info");
	}
}
public class ConstructorReference {
public static void main(String[] args) {
	//by using lamda multiline
	A a=()->{
		Student s=new Student();
		return s;
	};
	a.getStudentDetails().display();
	
	//by using lamda singleline
	A a1=()->new Student();
	a1.getStudentDetails().display();
	
	//by using method references
	A obj=Student::new;
	obj.getStudentDetails().display();
}
}
