package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("s");
		EntityManager em=emf.createEntityManager();
        
		em.getTransaction().begin();
		Product product=new Product();
		product.setId(5);
		product.setName("laptop");
		product.setCategory("electronics");
		product.setPrice(45000);
		
		em.persist(product);
		
		
	}

}
