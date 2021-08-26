package com.techment.client;

import com.techment.modal.Bank;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class ClientApp {
public static void main(String[] args) {
	 Resource resource=new ClassPathResource("object.xml");
	 BeanFactory factory=new XmlBeanFactory(resource);
	  
	 Bank bank=(Bank)factory.getBean("obj");
	 bank.displayBankDetails();
}
}
