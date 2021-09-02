package com.techment;

import javax.persistence.Query;  //JPA
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
//import org.hibernate.Query;

public class SelectUsingWhere {

	public static void main(String[] args) {
			Configuration configuration= new Configuration();
			configuration.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Query qry=session.createQuery("select s from Student s.dept=:x");
			qry.setParameter("x", "hr");
			
			List<Student> list=qry.getResultList();
			
			list.forEach(s->System.out.println(s.getStudentid() +" "+s.getName() +" "+s.getDept()));
			
			
	}

}
