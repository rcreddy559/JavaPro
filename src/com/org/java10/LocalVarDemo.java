package com.org.java10;

import java.util.*;
import java.util.stream.Stream;

public class LocalVarDemo {
    public static void main(String[] args) {
//        localVarDemo1();

        ofVsCopyOf(1,2,3,4,5,6);
        localVarDemo1();
    }

    static void localVarDemo1() {
        var name = "Ravichandra";
        var firstName = "Ravichandra";
        String lastName = "Reddy";
        int i2 ;
        var i = 300 ;
        var b = true;
        var f = 10.30f;
        var d = 10.3d;
        var c = '2';
        var l = new ArrayList<>();
        var m = new HashMap<>();
        i = 20;
        i2 = 40;
        System.out.printf("%s, %s, %s", name, firstName, lastName);



    }

    private static void ofVsCopyOf(Integer ...i) {
        List<Integer> is = List.of(2,3,3,5,6);
        List<Integer> vars = List.of(i);

        List<String> stringList = Arrays.asList("one", "two");
        List<String> stringList1 = List.copyOf(stringList);
    }

}
