package com.maven.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
	  public static void main(String[] args) {
	    System.out.println("Hello World!");
	    @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");

	    
	    CustomerBo bo = (CustomerBo) context.getBean("cust");
	    bo.addCustomer();
	    
	  }
	}


