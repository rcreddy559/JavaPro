package com.org.hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class  MaxMinArray {
    public static void main(String[] args) {
        List arr = Arrays.asList(54, 24, -4, 0, 2, 45, 54, -9, 7, 20, 30,40,50,60);



        List l = (List) arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(l.get(10));
    }
}
