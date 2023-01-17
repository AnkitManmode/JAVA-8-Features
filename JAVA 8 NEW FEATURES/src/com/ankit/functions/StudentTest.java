package com.ankit.functions;

import java.util.function.Function;

public class StudentTest {
// write a function to find the grade of the student
// marks >=80 A Distinction
// marks >=60 B First Class
// marks >=50 C Second class
// marks >=35 D Third Class
// marks < 35 E  failed
	
public static void main(String[] args) {
	
	Function<Student,String> f=s->{
		int marks=s.marks;
		String grade = " ";
		if(marks>=80) grade = "A[Distinction]";
		else if(marks>=60) grade = "B[First class]";
		else if(marks>=50) grade = "C[Second class]";
		else if(marks>=35) grade = "D[Third class]";
		else  grade = "C[Failed]";
		return grade;
	};
	Student[]s= {new Student("Durga", 100),
			     new Student("Vidya", 89),
			     new Student("Raman", 27),
			     new Student("Sunny", 38),
			     new Student("sachin",100),
			     new Student("Pinjaika", 82),
			     new Student("Vinny", 57),
			     new Student("Sunesh", 61),
	};
	for(Student s1 :s) {
		System.out.println("Student Name:"+s1.name);
		System.out.println("Student Marks:"+s1.marks);
		System.out.println("Student Grade:"+f.apply(s1));
	}
}	
}
