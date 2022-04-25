package com.builder;

public class StudentBuilder {

	private Student student = new Student();

	public void setName(String name) {
		student.name = name;
	}

	public void setRoll(String roll) {
		student.roll = roll;
	}

	public void setAge(int age) {
		student.age = age;
	}

	public void setBranch(String branch) {
		student.branch = branch;
	}

	public Student buildStudent() {
		return this.student;
	}
}
