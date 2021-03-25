package com.org.wildcard;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class WildcardDemo {

    static Collection copy(Collection<? super String> firstList, Collection<String> secondList) {
        firstList.addAll(secondList);
        return firstList;
    }

    public static void main(String[] args) {
        Collection c = copy(List.of("Ravi"), List.of("reddy"));
        c.forEach(System.out::println);
    }

}
