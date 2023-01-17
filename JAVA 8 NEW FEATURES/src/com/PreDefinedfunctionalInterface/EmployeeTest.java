package com.PreDefinedfunctionalInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;
// list the employee whose salary is greater than 40000
public class EmployeeTest {
public static void main(String[] args) {
	ArrayList<Employee> al = new ArrayList<Employee>();
	al.add(new Employee("jagri", 45000));
	al.add(new Employee("Ranji", 34000));
	al.add(new Employee("vivek", 55000));
	al.add(new Employee("sita", 10000));
	al.add(new Employee("ridhima",95000));
	al.add(new Employee("vinesh", 46000));
	
// this predicate will take employee object as an argument	
	Predicate<Employee> p=s->s.salary>40000 && s.salary<55000;
	// for each employee present in arraylist
	for(Employee e : al) {
		if(p.test(e))
// test this predicate for employee object			
			System.out.println(e.name+":"+e.salary);
	}
// if 10 conditions are there then we need to write 10 times if condition
// so, its better to go for predicate using lambda expression, only 1 method we need to write called test conditional check 

}
}
