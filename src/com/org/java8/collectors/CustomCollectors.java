package com.org.java8.collectors;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;

import java.util.List;
import java.util.function.Predicate;

public class CustomCollectors {
    public static void main(String[] args) {
        List<Employee> employees = ObjectsUtils.getEmployees();
        employees.forEach(employee -> System.out.println(employee.toString()));

        System.out.println("===============Age filter =======================================================");
        employees.stream().filter(employee -> employee.getAge()> 30).forEach(employee -> System.out.println(employee.toString()));

        System.out.println("===============Female Employees filter functional interface {Predicate} =======================================================");
        Predicate<Employee> ePredicate = employee -> employee.getGender().equalsIgnoreCase("Female");
        employees.stream().filter(ePredicate).forEach(employee -> System.out.println(employee.toString()));

    }
}
