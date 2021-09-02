package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Book_Author {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Author author = new Author();
		author.setId(100);
		author.setName("Chetan Bhagat");
		
		em.persist(author);
		
		Book book1 = new Book();
		book1.setIsbn(741542);
		book1.setTitle("One Night at Call Center");
		book1.setPrice(110);
		book1.setAuthor(author);
		
		Book book2 = new Book();
		book2.setIsbn(41962);
		book2.setTitle("Three Mistakes of My Life");
		book2.setPrice(120);
		book2.setAuthor(author);
		
		em.persist(book1);
		em.persist(book2);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}