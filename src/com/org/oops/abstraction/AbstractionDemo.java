package com.org.oops.abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {
        Employee contractor = new ContractorEmployee("Contractor", 6, 10);
        Employee fullTimeEmpEmp = new FullTimeEmployee("full time emp", 10);

        System.out.println(contractor.getName()+": "+contractor.getPaymentPerHour());
        System.out.println(fullTimeEmpEmp.getName()+": "+fullTimeEmpEmp.getPaymentPerHour());
    }
}

abstract class Employee {
    private String name;
    private int paymentPerHour;

    Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public abstract int calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}

class ContractorEmployee extends Employee {
    private final int workingHours;

    public ContractorEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour()*workingHours;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}