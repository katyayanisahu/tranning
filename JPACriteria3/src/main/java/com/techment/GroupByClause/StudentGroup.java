package com.techment.GroupByClause;
import javax.persistence.*;  
import javax.persistence.criteria.*;  

import java.util.*;  
public class StudentGroup {  


	public static void main( String args[]) {  


		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
		EntityManager em = emf.createEntityManager();  
		em.getTransaction().begin( );  


		CriteriaBuilder cb = em.getCriteriaBuilder();  
		CriteriaQuery<Object[]> cq = cb.createQuery(Object[].class);  
		Root<StudentEntity> stud = cq.from(StudentEntity.class);  
		cq.multiselect(stud.get("s_age"),cb.count(stud)).groupBy(stud.get("s_age"));  


		System.out.print("s_age");  
		System.out.println("\t Count");  
		List<Object[]> list = em.createQuery(cq).getResultList();  
		for(Object[] object : list){  
			System.out.println(object[0] + "     " + object[1]);  

		}  

		em.getTransaction().commit();  
		em.close();  
		emf.close();    
	}  
}  
