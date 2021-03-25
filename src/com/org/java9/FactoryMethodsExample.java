package com.org.java9;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class FactoryMethodsExample {

    public static void main(String[] args) {
//        List<String> list = normalCollection();
//        factoryMethodTest(list);
//
//        System.out.println("==========================");
//        factoryMethod2();

       //System.out.println("==========================");
//        factoryMethod3();

//        System.out.println("==========================");
//        factoryMethodMap();
//
//        System.out.println("==========================");
//        factoryMethodSet();
//
//        factoryMethodSet("qwer","rtyu","poiu", "qw3er","rt4yu","po5iu","q6wer","rt7yu","p8oiu", "qwe9r","r0tyu","pdoiu");
        mapFactoryMethods();
    }

    private static void mapFactoryMethods() {
        Map.Entry<String, String> factMap1 = Map.entry("Key1", "Value-1");
        Map.Entry<String, String> factMap2 = Map.entry("Key2", "Value-2");
        Map<String , String> kvMap = Map.ofEntries(factMap1, factMap2);

        for(Map.Entry<String, String> e: kvMap.entrySet()) {
            System.out.println(e.getKey()+": "+e.getValue());
        }

    }



    private static void factoryMethod2() {
        String[] s = {"one", "two", "three"};
        List<String> list = List.of(s);
    }

    private static void factoryMethod4() {
        var list = List.of("1","12","13","14","15","16","17","18","19","10","21","31","41","51","61","71","81","91");
        list.forEach(System.out::println);
    }

    static void factoryMethod3() {
        var ravi = new Employee(1, 40, "Male", "Ravichandra", "Reddy");
        var shobha = new Employee(2, 35, "Male", "Shobha", "Ravichandra");
        var divija = new Employee(3, 7, "Male", "Divija", "Ravichandra");
        var ravi2 = new Employee(1, 40, "Male", "Ravichandra", "Reddy");

        var employees = List.of(ravi, shobha, divija);
        //employees.add(ravi2);
        employees.set(2, ravi2);
        printEmp(employees);

        var employees1 = Arrays.asList(ravi, shobha, divija, null);
        employees1.set(2, ravi2);

        System.out.println("----------------");
        print(employees1);
    }

    private static void printEmp(List<Employee> employees) {
        for(var e: employees)  {
            System.out.println(e.toString());
        }
    }

    private static void factoryMethodTest(List<String> list) {
        var objects = List.of(list.toArray());
        //l.add("test");
        print(objects);
    }

    private static List<String> normalCollection() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
        print(list);
        return list;
    }

    private static void factoryMethodMap() {
        var map = Map.of(1, "Ravi",
                                        2, "Divija",
                                        3, "Shobha",
                                        4, "Sarala",
                                        5, "Bhaskar Reddy ");
//        map.put(6, "test");

        for(var e: map.entrySet()) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }

    private static void factoryMethodSet() {
        var set = Set.of("Ravi", "Divija", "Shobha", "Sarala", "Bhaskar reddy", "qwer","rtyu","poiu", "qw3er","rt4yu","po5iu","q6wer","rt7yu","p8oiu", "qwe9r","r0tyu","pdoiu");
        print(set);
    }

    private static void factoryMethodSet(String... strs) {
        var set = Set.of(strs);
        print(set);
    }

    private static void print(Set<String> set) {
        System.out.println("==========================");
        set.forEach(System.out::println);
    }

    private static void print(List list) {
        list.forEach(System.out::println);
    }
}
