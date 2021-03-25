package com.org.utils;

public class Employee {

	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;
	private Double salary;
	private String department;

	public Employee(Integer id, Double salary, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public static Employee of(Integer id, Double salary, String department) {
		return new Employee(id, salary, department);
	}

	public Employee(Integer id, Integer age, String gender, String firstName, String lastName) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", salary=" + salary +
				", department='" + department + '\'' +
				'}';
	}
}
