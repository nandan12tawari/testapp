package com.db.example.testapp;


import java.util.ArrayList;





public class Employee {
	
	
	private String name;
	private double salary;
	//public static ArrayList<Employee> list = new ArrayList<Employee>();
	public Employee(String name, double salary) {
		super();
		
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ name=" + name + ", salary=" + salary + "]";
	} 

	
}
