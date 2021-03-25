package com.org.java8.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeekDemo {
    public static void main(String[] args) {
        peekDemo123();
    }

    private static void peekDemo123() {
         var peek = Stream.of("one", "two", "three")
                 .peek(System.out::println).collect(Collectors.toList());

         peek.forEach(System.out::println);
    }
}
