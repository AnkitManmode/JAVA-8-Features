package com.ankit.collect.functional;

public class Employee {
int eno;
String name;
public Employee() {
	
}

public Employee(int eno, String name) {
	super();
	this.eno = eno;
	this.name = name;
}

@Override
public String toString() {
	return "Employee [eno=" + eno + ", name=" + name + "]";
}




}
