package com.techment.OnetoOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoOneClientDemo {
public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Book_issued" );  
     EntityManager em = emf.createEntityManager( );  
     em.getTransaction( ).begin( );  
     
     Address address=new Address();
     address.setDoorNo(100);
     address.setStreetName("BTM");
     address.setCity("Banglore");
     
     Employee1 employee=new  Employee1();
     employee.setId(100);
     employee.setName("mahesh");
     employee.setDesignation("hr");
     employee.setAddress(address);
     
     
     
     
}
}
