package com.org.java9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//            dropWhileTest();

//        ofNullable(Arrays.asList("Oone","Otwo", "Otest", "adfads", "adsfasd", "Otestes"));
//        System.out.println("-----");
//        ofNullable(null);
        iterateTest();
    }
    public static void takeWhileTest() {
        List<Integer> list
                = Stream.of(22,1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);


        List<String> l = Stream.of("Oone","Otwo", "Otest", "adfads", "adsfasd", "Otestes")
                .takeWhile(s->(s.startsWith("O"))).collect(Collectors.toList());

        System.out.println(l);
        List<Object> l2 = Stream.of("Oone",34, 4.33, true, "adsfasd", "Otestes")
                .takeWhile(s->!(s instanceof Boolean)).collect(Collectors.toList());

        System.out.println(l2);
    }

    static void dropWhileTest() {
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,2,8,9,10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);

        List<String> l = Stream.of("Oone","Otwo", "Otest", "adfads", "adsfasd", "Otestes")
                .dropWhile(s->(s.startsWith("O"))).collect(Collectors.toList());
        System.out.println(l);
    }

    static void ofNullable(List<String> strings) {
        List<List<String>> l = Stream.ofNullable(strings).collect(Collectors.toList());
        Optional o = Optional.ofNullable(strings);
        while (o.isPresent()) {
            System.out.println("present");
            break;
        }
        System.out.println(l.size());
    }

    static void iterateTest() {
//        Stream.iterate(
//                1,
//                i -> i <= 10,
//                i -> i*3)
//                .forEach(System.out::println);
//
//
//        Stream.iterate("one", i -> i.length() < 100, i-> i+i).forEach(System.out::println);

        List<String> list = Arrays.asList("Oone","Otwo", "Otest", "adfads", "adsfasd", "Otestes");
        Stream.iterate(
                0,
                i -> i < list.size(),
                i -> {
                    i++;
                    return i;
                }
        ).forEach(System.out::println);
    }

    static void underscore() {
        int rr_rr = 10; // creating variable
        System.out.println(rr_rr);
    }
}
