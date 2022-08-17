package com.kh.homework.person.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String toString() {
		return salary + " // 급여" + dept + " // 부서";
	}
}
