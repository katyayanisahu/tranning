package com.techment.dao;
import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.techment.entity.Author;
import com.techment.entity.Book;
@Repository
public interface IBookDao extends JpaRepository<Book,Integer>{
	List<Book> findByAuthorName(String name);
	List<Book> findByPriceBetween(double s,double b);

}
