package com.maven.demo1;

public class Emp {
	private String emp_name;
	private int emp_id;
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	
	public void printInfo() {
		System.out.println("Employee Name : "+ emp_name+" --- Employee ID: "+ emp_id);
	}
}