package com.org.java9;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIImprovement {
     static void takeWhileDemo() {

        List<Integer> list = Stream.of(1,2,3,4,5,6,7,8,2,10, 1,2,3,4)
                .takeWhile(i -> (i *2 < 10)).collect(Collectors.toList());
        System.out.println(list);
    }
    static void dropWhileDemo() {
        List<Integer> list = Stream.of(10,2,3,4,5,6,7,8,9,10)
                .dropWhile(i->(i*3 < 30)).collect(Collectors.toList());
        System.out.println(list);
    }

    static void ofNullableDemo(){
        List<String> list = List.of("one", "two", "Three");
        Stream<List<String>> stream = Stream.ofNullable(list);
        stream.forEach(System.out::println);
    }
    public static void main(String[] args) {
        takeWhileDemo();
        dropWhileDemo();
        ofNullableDemo();

        List<String> stringStream = Stream.of("Test", "Test2", null, "Test2", null)
                .takeWhile(Objects::nonNull).collect(Collectors.toList());

        stringStream.forEach(System.out::println);
    }


}
