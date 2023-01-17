package com.ankit.Static;

public class EmployeeImpl implements Employee  {

	public static void main(String[] args) {
		EmployeeImpl em  = new EmployeeImpl();
		em.salary();	
}

	@Override
	public void salary() {
	System.out.println("Salary of employee");	
		
	}
}
