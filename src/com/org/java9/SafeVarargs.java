package com.org.java9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SafeVarargs {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>(Arrays.asList("20","one"));
//        List<String> llList = new LinkedList<>(Arrays.asList("20","one"));
        print(sList);
//        print(llList);

//        String[] s = {"one","two"};
//        printArr(s);
    }

//    @java.lang.SafeVarargs
    static void print(List<String> ...list) {

        for(List<String> l:list) {
            System.out.println(l);
        }
    }

    static void printArr(String... s) {
        for(String i:s) {
            System.out.println(i);
        }
    }
}
