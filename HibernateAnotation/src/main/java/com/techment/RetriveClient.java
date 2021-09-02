package com.techment;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class RetriveClient {

	public static void main(String[] args) {
		
		
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
				
		Transaction transaction=session.beginTransaction();
		
		Student student =session.load(Student.class,new Integer(2));
		System.out.println("id"+student.getStudentid()+"Name"+student.getName());
		
		transaction.commit();
	}

}