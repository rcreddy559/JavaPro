package com.org.hackerrank.InterviewPreparationKit;

public class JumpingOnTheClouds {

    public static int raviSolution(int[] c) {
        int count = 0;
        int index = 0;
        if (c.length == 0) {
            return 0;
        } else if (c.length == 1) {
            return c[0] == 0 ? 1 : 0;
        }
        while (index < c.length - 1) {

            if (index + 2 < c.length && c[index + 2] == 0) {
                index = index + 2;
                count++;
            } else if (c[index + 1] == 0) {
                index++;
                count++;
            } else {
                index++;
            }
        }

        return count;
    }

    static int s(int[] c) {
        int n = c.length;
        int i = 0;
        int jump = 0;
        while (i < n - 1) {
            if (i + 2 < n && c[i + 2] == 0) {
                i = i + 2;
                jump++;
            } else if (c[i + 1] == 0) {
                i++;
                jump++;
            } else i++;
        }
        return jump;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1}
        };
        for (int[] a : arr) {
            System.out.println(raviSolution(a));
            System.out.println(s(a));
            System.out.println("-----");
        }
    }
}
