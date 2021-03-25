package com.org.java8.StringJoinerImpl;

import java.util.List;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
       joinCommas(",");
        System.out.println("---------------");
        joinCommas("-");
    }

    public static void joinCommas(String delimiter) {
        StringJoiner joiner = new StringJoiner(delimiter, "[","]");
        joiner.add("Divija");
        joiner.add("Shobha");
//        joiner.add("Ravi");
        System.out.println(joiner.toString());
        for(String s: List.of("Jyothins", "Sothih", "Jagan", "Jayasree")) {
            joiner.add(s);
        }
        System.out.println(joiner.toString());
    }
}
