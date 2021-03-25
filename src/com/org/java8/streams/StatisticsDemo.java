package com.org.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

import static java.lang.System.*;

public class StatisticsDemo {
    public static void main(String[] args) {
        statisticsDemo();
        asIntStreamDemo();
    }

    private static void asIntStreamDemo() {
        var intStream = IntStream.of(8, 2, 3, 4, 5, 6);
        var statistics = intStream.summaryStatistics();
        out.println(statistics.getSum());
    }

    private static void statisticsDemo() {
        var list = Arrays.asList(8, 2,3,4,5,6);

        var statistics = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        var max = list.stream().max(Comparator.naturalOrder());

        max.ifPresent(out::println);
        out.println(statistics.getSum());
        out.println(statistics.getMax());
        out.println(statistics.getMin());
        out.println(statistics.getCount());
    }
}
