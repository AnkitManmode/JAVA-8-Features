package com.ankit.collect;

import java.util.ArrayList;
import java.util.Collections;


public class Test {
public static void main(String[] args) {
ArrayList<Employee> l = new ArrayList<Employee>();

l.add(new Employee(56748, "Sachin"));
l.add(new Employee(36748, "Prem"));
l.add(new Employee(76748, "Dhanaji"));
l.add(new Employee(58748, "Vishalya"));
l.add(new Employee(93748, "Priya"));
l.add(new Employee(10748, "CHikki"));

System.out.println(l);
Collections.sort();
}
}
