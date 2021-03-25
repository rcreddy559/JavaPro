package com.org.java8.streams;

import com.org.utils.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FrequentlyAskedInterviewQuestions {

    public static void main(String[] args) {
        var list = List.of(Employee.of(1, 204.3, "one"),
                Employee.of(3, 212.3, "one"),
                Employee.of(5, 222.3, "one"),
                Employee.of(6, 232.3, "one"),
                Employee.of(7, 242.3, "one"),
                Employee.of(3, 252.3, "one"),
                Employee.of(9, 262.3, "one"),

                Employee.of(2, 273.3, "two"),
                Employee.of(2, 283.3, "two"),
                Employee.of(2, 293.3, "two"),
                Employee.of(2, 23.3, "two"),
                Employee.of(2, 373.3, "two"),
                Employee.of(4, 481.31, "two"));
        groupByDep(list);
        findEmpCountByDepartment(list);
        findMaxSalaryGroupByDep(list);
    }

    private static void groupByDep(List<Employee> list) {
        var collect = list.stream().collect(
                Collectors.groupingBy(Employee::getDepartment));

        collect.forEach((s, list1) -> {
            System.out.println(s+":"+list1.size());
            list1.forEach(System.out::println);
        });
    }

    private static void findEmpCountByDepartment(List<Employee> list) {
        Map<String, Long> empCount = list.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        empCount.forEach((s, aLong) -> System.out.println(s+":"+aLong));
    }


    static void findMaxSalaryGroupByDep(List<Employee> list) {
        var max = list.stream().collect(
                Collectors.toMap(Employee::getDepartment,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        var max2 = list.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,
                                        Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

        max.forEach((s, employee) -> System.out.println(s+" : "+employee.toString()));
       max2.forEach((s, employee) -> System.out.println(s+" : "+employee.toString()));
    }
}
