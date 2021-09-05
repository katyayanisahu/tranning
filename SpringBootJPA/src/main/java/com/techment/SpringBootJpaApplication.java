package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;


@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
      @Autowired 
      IProductDao iProductDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
		
		
	}
	@Override
	public void run(String... args) throws Exception{
		
		System.out.println("hello this is my first spring boot");
        Product product1=new Product("laptop","laptop",45000);
        Product product2=new Product("m1","mobile",45000);
        
        iProductDao.save(product1);
        iProductDao.save(product2);
        
        System.out.println("inserted");
        
        /*
         * findAll
         */
        
        List<Product> products=iProductDao.findAll();
        products.forEach(System.out::println);
        
        /*
         * findID
         */
        
        /*
        *Optional<Product> product=iProductDao.findById(3);
        *if(product.isPresent())
        *System.out.println("Products "+product.get());
        *else
        *System.out.println("no value with the given id");
        /*
         
        //Product product3=iProductDao.findById(3).get();
        //System.out.println("Product"+ product3); 
        
        /*
         * count 
         */
        
        long totalProducts=iProductDao.count();
        System.out.println("totalProducts"+ totalProducts);
          
        
        List<Product> prod=iProductDao.findByName("mi");
        System.out.println("PRODUCT"+prod);
        
        List<Product> prodList=iProductDao.findByCategory("laptop");
        System.out.println(prodList);
        
       
        
        
	}

}
