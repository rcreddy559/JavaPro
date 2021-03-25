package com.org.hackerrank;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class StringTokenSplit {
    public static void main(String[] args) {

    String value = "He is a very very good boy, isn't he?";
//    fun1(value);
    fun2(value);
    }

    private static void fun2(String value) {
        StringTokenizer st = new StringTokenizer(value, " !,?.\\\\_'@");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    private static void fun1(String value) {
        String p = " !,?.\\\\_'@";
        Pattern pattern = Pattern.compile(p);
        String[] split1 = pattern.split(value);
        System.out.println(split1.length);
        for (String s : split1) {
            System.out.println(s);
        }

    }
}
