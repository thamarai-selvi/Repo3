package com.dep.constructor;

import org.springframework.stereotype.Component;

@Component
public class ManagerClass implements EmpInterface{
Accountant acc;
public ManagerClass(Accountant acc) {
	super();
	System.out.println("Manager constructor");
	this.acc = acc;
}
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Employee is a manager");
	}

	

	@Override
	public void JobDetails() {
		// TODO Auto-generated method stub
System.out.println("manager will manage respectiev dept work");		
	}
	
	public void callMeeting()
	{
		acc.doWork();
	}

}
