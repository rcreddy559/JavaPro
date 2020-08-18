package com.org.hackerrank.InterviewPreparationKit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumDistances {

    static int minimumDistances(int[] a) {
        int minDist = Integer.MAX_VALUE;

        if(a.length == 0) {
            return -1;
        } else if(a.length == 2 && a[0] == a[1]) {
            return 1;
        }

        for(int i=0;i<a.length-1;i++) {
            for(int j=i+1;j<a.length-1;j++) {
                if(a[i] == a[j]) {
                        minDist = Math.min(minDist, Math.abs(j-i));
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    static int minimumDistancesKrishna(int[] a) {
        int minDist =Integer.MAX_VALUE;
        Map<Integer, Integer> map=new HashMap<>();
        int value = 0;

        for(int i=0;i<a.length;i++) {
            if(map.get(a[i]) != null &&
                    minDist > (i-(value = map.get(a[i])))){
                minDist=(i-value);
            }
            map.put(a[i], i);
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }

    public static void main(String[] args) {
        int [][]arr = {{7,1,3,4,1,7}, {1,1}, {3,2,1,2,3},{}};

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
            System.out.println("a: "+minimumDistances(a));
            System.out.println("b: "+minimumDistancesKrishna(a));
            System.out.println("----");
        }
    }
}
