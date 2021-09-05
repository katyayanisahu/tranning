package com.techment.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em =  emf.createEntityManager();

		em.getTransaction().begin();

		Employee2 e1 = new Employee2("raji", "dev");
		Employee2 e2 = new Employee2("shejal", "hr");

		em.persist(e1);
		em.persist(e2);
		
		List<Employee2> employees = new ArrayList<Employee2>();
		employees.add(e1);
		employees.add(e2);

		Department d1 = new Department();
		d1.setName("software");
		d1.setEmployees(employees);
		
		em.persist(d1);
		
	}

}

