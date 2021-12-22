package com.dep.constructor;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements EmpInterface{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println("Inside  acc job profile");

	}
	
	public Accountant()
	{
		super();
		System.out.println("Inside the accountant constructor");
	}

	@Override
	public void JobDetails() {
		// TODO Auto-generated method stub
System.out.println("accountant handle all th acc related job");		
	}

}
