package com.org.java8.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] iList = {11,22,33,44,55,66,77,88,99,22,44,66,88,99};
        String[] list = {"one", "two","Three", "four","five", "six", "seven", "eight", "nine"
        , "one", "two", "Three"};
        findDuplicates(list);
        findDuplicates(iList);
    }

    private static void findDuplicates(String[] list) {
        var uniqueList = new HashSet<String>();
        var duplicates = Arrays
                .stream(list)
                .filter(i-> !uniqueList.add(i))
                .collect(Collectors.toList());

        System.out.println(uniqueList);
        System.out.println(duplicates);
    }

    private static void findDuplicates(int[] iList) {
        var uniqueElements = new HashSet<>();
        var duplicateElements = Arrays.stream(iList)
                .filter(i -> !uniqueElements.add(i))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(uniqueElements);
        System.out.println(duplicateElements);
    }
}
