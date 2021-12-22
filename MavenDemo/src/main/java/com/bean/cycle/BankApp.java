package com.bean.cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
Employee e=(Employee) context.getBean("manager");
	e.job();
	context.close();
	}

}
