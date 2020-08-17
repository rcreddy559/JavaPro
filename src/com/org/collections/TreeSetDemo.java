package com.org.collections;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;
import java.util.*;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void defaultSorting() {
        TreeSet ts = new TreeSet();
        ts.add(20);
        ts.add(10);
        ts.add(2);
        ts.add(0);
        ts.add(7);

        System.out.println(ts);

    }

    public void sortPerson() {
        List<Employee> employees = ObjectsUtils.getEmployees();


    }

    public static void main(String[] args) {
        defaultSorting();
    }

}
