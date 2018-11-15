package com.org.java8.lambda;

import java.util.Collections;
import java.util.List;

import com.org.utils.ObjectsUtils;

public class FirstLambdaPro {

    public static void main(String[] args) {
        new FirstLambdaPro().compartorLabda1();
    }
 
    public void comparatorLambda() {

       List<Integer> listOfIntegers = ObjectsUtils.getListOfIntegers();
//       listOfPersions.forEach(person -> {System.out.println(person.toString());});
        Collections.sort(listOfIntegers, (o1, o2) -> Integer.compare(o1,o2));
        listOfIntegers.forEach(person -> {System.out.println(person.toString());});
    }

    public void compartorLabda1() {
        List<com.org.utils.Person> listOfPersions = ObjectsUtils.getPersions();
        Collections.sort(listOfPersions, (o1,o2)->{
            return Integer.compare(o1.getAge(),o2.getAge());
        });
        listOfPersions.forEach(i->System.out.println(i.toString()));
    }
}
