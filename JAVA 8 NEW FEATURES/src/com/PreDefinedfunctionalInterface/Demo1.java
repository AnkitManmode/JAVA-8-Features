package com.PreDefinedfunctionalInterface;

import java.util.function.Predicate;

public class Demo1 {
public static void main(String[] args) {

// predicate functional interface contain only 1 method called test	
// Write a predicate to check whether length of string is greater than 5 or not
// in our coding conditional checking is very common , so we can use predicate

Predicate<String> p = s->s.length()>5;
System.out.println(p.test("AnkitManmode"));
System.out.println(p.test("we"));
}
}
