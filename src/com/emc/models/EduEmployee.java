package com.emc.models;

import java.util.Set;

public class EduEmployee {

	private String year;
	private String employeeNum;
	private String lastName;
	private String firstName;
	private String middleInit;
	private String departmentNum;
	private String departmentName;
	private String divisionNum;
	private String divisionName;
	private String jobCode;
	private String jobTitle;
	private String currentHireDate;
	private String employmentEndDate;
	private String scheduledHours;
	private String longevityPercentage;
	private String baseHourlyRate;
	private String totalHourlyRate;
	private String overtimeHourlyRate;
	private String employmentStatus;
	private String totalBasePay;
	private String grossPay;
	private String totalOvertimeHours;
	private String totalOvertimePay;
	
	public EduEmployee() {}
	public EduEmployee(String year, String employeeNum, String lastName, String firstName, String middleInit,
			String departmentNum, String departmentName, String divisionNum, String divisionName, String jobCode,
			String jobTitle, String currentHireDate, String employmentEndDate, String scheduledHours,
			String longevityPercentage, String baseHourlyRate, String totalHourlyRate, String overtimeHourlyRate,
			String employmentStatus, String totalBasePay, String grossPay, String totalOvertimeHours,
			String totalOvertimePay) {
		super();
		this.year = year;
		this.employeeNum = employeeNum;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleInit = middleInit;
		this.departmentNum = departmentNum;
		this.departmentName = departmentName;
		this.divisionNum = divisionNum;
		this.divisionName = divisionName;
		this.jobCode = jobCode;
		this.jobTitle = jobTitle;
		this.currentHireDate = currentHireDate;
		this.employmentEndDate = employmentEndDate;
		this.scheduledHours = scheduledHours;
		this.longevityPercentage = longevityPercentage;
		this.baseHourlyRate = baseHourlyRate;
		this.totalHourlyRate = totalHourlyRate;
		this.overtimeHourlyRate = overtimeHourlyRate;
		this.employmentStatus = employmentStatus;
		this.totalBasePay = totalBasePay;
		this.grossPay = grossPay;
		this.totalOvertimeHours = totalOvertimeHours;
		this.totalOvertimePay = totalOvertimePay;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return true;
		if(!(obj instanceof EduEmployee)) {
			return false;
		}
		
		EduEmployee employee = (EduEmployee) obj;
		
		
		return employee.employeeNum.equals(employeeNum) &&
				employee.firstName.equals(firstName) &&
				employee.lastName.equals(lastName);
	}
	
	@Override
	public int hashCode() {
		int result = 17;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + Integer.parseInt(employeeNum);
        return result;
	}

	@Override
	public String toString() {
		return "EduEmployee [year=" + year + ", employeeNum=" + employeeNum + ", lastName=" + lastName + ", firstName="
				+ firstName + ", middleInit=" + middleInit + ", departmentNum=" + departmentNum + ", departmentName="
				+ departmentName + ", divisionNum=" + divisionNum + ", divisionName=" + divisionName + ", jobCode="
				+ jobCode + ", jobTitle=" + jobTitle + ", currentHireDate=" + currentHireDate + ", employmentEndDate="
				+ employmentEndDate + ", scheduledHours=" + scheduledHours + ", longevityPercentage="
				+ longevityPercentage + ", baseHourlyRate=" + baseHourlyRate + ", totalHourlyRate=" + totalHourlyRate
				+ ", overtimeHourlyRate=" + overtimeHourlyRate + ", employmentStatus=" + employmentStatus
				+ ", totalBasePay=" + totalBasePay + ", grossPay=" + grossPay + ", totalOvertimeHours="
				+ totalOvertimeHours + ", totalOvertimePay=" + totalOvertimePay + "]";
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInit() {
		return middleInit;
	}

	public void setMiddleInit(String middleInit) {
		this.middleInit = middleInit;
	}

	public String getDepartmentNum() {
		return departmentNum;
	}

	public void setDepartmentNum(String departmentNum) {
		this.departmentNum = departmentNum;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDivisionNum() {
		return divisionNum;
	}

	public void setDivisionNum(String divisionNum) {
		this.divisionNum = divisionNum;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCurrentHireDate() {
		return currentHireDate;
	}

	public void setCurrentHireDate(String currentHireDate) {
		this.currentHireDate = currentHireDate;
	}

	public String getEmploymentEndDate() {
		return employmentEndDate;
	}

	public void setEmploymentEndDate(String employmentEndDate) {
		this.employmentEndDate = employmentEndDate;
	}

	public String getScheduledHours() {
		return scheduledHours;
	}

	public void setScheduledHours(String scheduledHours) {
		this.scheduledHours = scheduledHours;
	}

	public String getLongevityPercentage() {
		return longevityPercentage;
	}

	public void setLongevityPercentage(String longevityPercentage) {
		this.longevityPercentage = longevityPercentage;
	}

	public String getBaseHourlyRate() {
		return baseHourlyRate;
	}

	public void setBaseHourlyRate(String baseHourlyRate) {
		this.baseHourlyRate = baseHourlyRate;
	}

	public String getTotalHourlyRate() {
		return totalHourlyRate;
	}

	public void setTotalHourlyRate(String totalHourlyRate) {
		this.totalHourlyRate = totalHourlyRate;
	}

	public String getOvertimeHourlyRate() {
		return overtimeHourlyRate;
	}

	public void setOvertimeHourlyRate(String overtimeHourlyRate) {
		this.overtimeHourlyRate = overtimeHourlyRate;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getTotalBasePay() {
		return totalBasePay;
	}

	public void setTotalBasePay(String totalBasePay) {
		this.totalBasePay = totalBasePay;
	}

	public String getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(String grossPay) {
		this.grossPay = grossPay;
	}

	public String getTotalOvertimeHours() {
		return totalOvertimeHours;
	}

	public void setTotalOvertimeHours(String totalOvertimeHours) {
		this.totalOvertimeHours = totalOvertimeHours;
	}

	public String getTotalOvertimePay() {
		return totalOvertimePay;
	}

	public void setTotalOvertimePay(String totalOvertimePay) {
		this.totalOvertimePay = totalOvertimePay;
	}
	 

}
