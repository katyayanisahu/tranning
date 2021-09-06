package com.techment.dao;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techment.entity.Author;

@Repository
public interface IAuthorDao extends JpaRepository<Author,Integer>{
	 List<Author> findByFirstName(String firstName);
	 List<Author> findByMiddleName(String middleName);
	 List<Author> findByLastName(String lastName);
	 List<Author> findByPhoneNo(int phoneNo);
	 

}

