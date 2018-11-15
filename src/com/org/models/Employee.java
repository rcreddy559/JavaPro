package com.org.models;

public class Employee {

	private String surName;
	private String initials;
	private String foreName;
	private String title;
	private String niNumber;
	private String department;
	private String payroll;
	private String exempt;
	private String director;
	private String dateOfBirth;
	private String email;
	private String gerndar;
	private String document;
	private String location;
	private String dol;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String postCode;
	private String payetodate;
	private String salary;
	private String costCentre;
	

	public Employee(String surName, String initials, String foreName, String title, String niNumber, String department,
			String payroll, String exempt, String director, String dateOfBirth, String email, String gerndar,
			String document, String location, String dol, String address1, String address2, String address3,
			String address4, String postCode, String payetodate, String salary, String costCentre) {
		super();
		this.surName = surName;
		this.initials = initials;
		this.foreName = foreName;
		this.title = title;
		this.niNumber = niNumber;
		this.department = department;
		this.payroll = payroll;
		this.exempt = exempt;
		this.director = director;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.gerndar = gerndar;
		this.document = document;
		this.location = location;
		this.dol = dol;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.postCode = postCode;
		this.payetodate = payetodate;
		this.salary = salary;
		this.costCentre = costCentre;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getForeName() {
		return foreName;
	}

	public void setForeName(String foreName) {
		this.foreName = foreName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNiNumber() {
		return niNumber;
	}

	public void setNiNumber(String niNumber) {
		this.niNumber = niNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPayroll() {
		return payroll;
	}

	public void setPayroll(String payroll) {
		this.payroll = payroll;
	}

	public String getExempt() {
		return exempt;
	}

	public void setExempt(String exempt) {
		this.exempt = exempt;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGerndar() {
		return gerndar;
	}

	public void setGerndar(String gerndar) {
		this.gerndar = gerndar;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDol() {
		return dol;
	}

	public void setDol(String dol) {
		this.dol = dol;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPayetodate() {
		return payetodate;
	}

	public void setPayetodate(String payetodate) {
		this.payetodate = payetodate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getCostCentre() {
		return costCentre;
	}

	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;
	}

	@Override
	public String toString() {
		return "Employee [surName=" + surName + ", initials=" + initials + ", foreName=" + foreName + ", title=" + title
				+ ", niNumber=" + niNumber + ", department=" + department + ", payroll=" + payroll + ", exempt="
				+ exempt + ", director=" + director + ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", gerndar="
				+ gerndar + ", document=" + document + ", location=" + location + ", dol=" + dol + ", address1="
				+ address1 + ", address2=" + address2 + ", address3=" + address3 + ", address4=" + address4
				+ ", postCode=" + postCode + ", payetodate=" + payetodate + ", salary=" + salary + ", costCentre="
				+ costCentre + "]";
	}
	
}
