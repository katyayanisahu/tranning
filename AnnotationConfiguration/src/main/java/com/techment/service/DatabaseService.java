package com.techment.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.Employee;
import com.techment.dao.IDao;
@Service("DbService")// same parameter to getBean()
public class DatabaseService {
   @Autowired
   @Qualifier("oracle")
   IDao dao;
   
   @Autowired
   Employee employee;
   public void displayDatabaseInfo()
   {
	   dao.dataBaseName();
	   employee.displayEmployeeInfo();
   }
}
