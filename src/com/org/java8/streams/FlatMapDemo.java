package com.org.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(
                Arrays.asList("one", "Two"),
                Arrays.asList("Five", "Four")
        );

        List<String> collect = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
