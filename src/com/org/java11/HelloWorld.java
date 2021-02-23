package com.org.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Computation<T> {
    public boolean compute(List<Double> l);
}

class Ascending implements Computation<List<Double>> {
    public static boolean isSorted(List<Double> listOfStrings, int index) {
        if (index < 2) {
            return true;
        } else if (listOfStrings.get(index - 2).compareTo(listOfStrings.get(index - 1)) > 0) {
            return false;
        } else {
            return isSorted(listOfStrings, index - 1);
        }
    }
    public boolean compute(List<Double> list) {
        return isSorted(list, list.size());

    }
}

class Descending implements Computation<List<Double>> {

    public static boolean isSorted(List<Double> listOfStrings, int index) {
        if (index < 2) {
            return true;
        } else if (listOfStrings.get(index - 2).compareTo(listOfStrings.get(index - 1)) < 0) {
            return false;
        } else {
            return isSorted(listOfStrings, index - 1);
        }
    }

    public boolean compute(List<Double> list) {
        return      isSorted(list, list.size());

    }
}

public class HelloWorld{

    public static void main(String []args){
        List<Double> list = new ArrayList<>(5);
//        list.add(1.71);
//        list.add(2.72);
//        list.add(3.73);
//        list.add(4.74);
//        list.add(5.75);
//        list.add(6.76);
//        list.add(7.77);

//        list.add(7.71);
//        list.add(6.72);
//        list.add(5.73);
//        list.add(4.74);
//        list.add(3.75);
//        list.add(2.76);
//        list.add(1.77);

//        list.add(1.71);
//        list.add(2.72);
//        list.add(9.73);
//        list.add(2.74);
//        list.add(1.75);
//        list.add(0.76);
//        list.add(10.77);

//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);
//        list.add(10.77);

//        list.add(7.71);
//        list.add(6.72);
//        list.add(5.73);
        List<Computation> computations =
                Arrays.asList(
                        new Ascending(),
                        new Descending()
                );

        for (Computation comp : computations) {
            System.out.println(comp.compute(list));
        }
    }
}