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
		Product product2 = new Product();
		product.setId(5);
		product.setName("laptop");
		product.setCategory("electronics");
		product.setPrice(45000);
		
		product2.setId(4);
		product2.setName("Mobile");
		product2.setPrice(15000);
		product2.setCategory("Electronics");
		
		em.persist(product2);
		
		
		
		
		em.getTransaction().commit();
		

		
		/**
		*System.out.println("====Deleting===");
		*em.find(Product.class, 1);
		*System.out.println("product id:"+product.getId());
		*System.out.println("product id:"+product.getId());
		*System.out.println("product id:"+product.getId());
		*System.out.println("product id:"+product.getId());
		*em.remove(product);
		*/
		
		
		
		
		em.persist(product);
		
		
	}

}
