package com.onetomany;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoManyClient {
public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Book_issued" );  
     EntityManager em = emf.createEntityManager( );  
     em.getTransaction( ).begin( );  
     
     Course java=new Course(20,"java",2);
     Course python=new Course(21,"python",3);
     Course bigDatab=new Course(22,"big data",4);
     
     List<Course> courses=new ArrayList<Course>();
     courses.add(java);
     courses.add(python);
     courses.add(bigDatab);
     
     em.persist(java);
     em.persist(python);
     em.persist(bigDatab);
     
     Student gitika =new Student();
     gitika.setId(1); 
     gitika.setName("kirti");
     gitika.setCourse(courses);
     
     em.persist(gitika);
     
     System.out.println("Inserted");
     
     
}
}
