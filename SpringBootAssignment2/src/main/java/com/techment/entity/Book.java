package com.techment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book501")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ISBN;
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="auth_id")
	private Author  author;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book() {
		
	}
	public Book(String title, double price, Author author) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	
	
	
}