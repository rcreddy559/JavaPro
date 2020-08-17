package com.org.hackerrank.InterviewPreparationKit;

public class MinimumDistances {

    static int minimumDistances(int[] a) {
        int minDist = Integer.MAX_VALUE;

        if(a.length == 0) {
            return minDist;
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

    public static void main(String[] args) {
        int []a = {1,1};
        System.out.println(minimumDistances(a));
    }
}
