package com.techment.CodingTest;
class Employee1{
	private String firstName;
	private String lastName;
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}


class NameLenSmallException extends Exception{
	
	String msg;

	public NameLenSmallException(String msg) {
		super();
		this.msg = msg;
	}
}
public class Question3 {

	public static void main(String[] args) throws NameLenSmallException {
			
		Employee1 e1=new Employee1("kajal","sahu");
		Employee1 e2=new Employee1("he","world");
		
		
		if(e1.getFirstName()==null||e1.getLastName()==null)
		{
			throw new NullPointerException("Entry Missing");
		}
		
		if(e1.getFirstName().length()<3||e2.getFirstName().length()<3)
		{
			throw new NameLenSmallException("name should be minimum 3 character");
		}
		
	}

}
