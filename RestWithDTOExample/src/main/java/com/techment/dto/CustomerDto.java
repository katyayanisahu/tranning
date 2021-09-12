package com.techment.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CustomerDto {

	
	private int id;
	
	@Size(min = 3,message = "name Should be Minimum 3 Characters")
	private String name;
	
	
	private int age;
	
	@NotEmpty(message = "Address Should not be empty")
	private String address;
	
	
	
	@Email(message = "Email Not valid ")
	private String email;
	
	@Size(min = 10,max = 10,message = "Please Give A Proper Mobile Number of 10 Digits")
	private String mobile;
	
	
	public CustomerDto(int id, String name, int age, String address, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.mobile = mobile;
	}
	
	
	public CustomerDto(int id, String name, int age, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
	}
	


	public CustomerDto(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public CustomerDto(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public CustomerDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
}
