package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Query;

public class RetriveDemo2 {
public static void main(String[] args) {
	Configuration configuration = new Configuration();
	configuration.configure("hibernate.cfg.xml");
	
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	Query<Student> query = session.createQuery("Select s.studentId, s.name from student500 s");
	List<Student> st= query.list();
	
	for(Student stu: st)
	{
//		Student stu = (Student) s;
//		System.out.println(stu.getStudentId()+ " "+stu.getName());
		System.out.println(stu);
	}
	

	session.close();
	sessionFactory.close();
}
}
