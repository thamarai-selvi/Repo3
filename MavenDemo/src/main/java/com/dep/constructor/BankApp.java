package com.dep.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Appconfig.class);
		ManagerClass m=con.getBean(ManagerClass.class);
		m.callMeeting();
		con.close();
		
	}

}
