package com.builder;

public class MyClass {
public static void main(String[] args) {
	StudentBuilder builder = new StudentBuilder();
	builder.setAge(25);
	builder.setName("Srikanth");

	Student student = builder.buildStudent();
	System.out.println(student);
}
}
