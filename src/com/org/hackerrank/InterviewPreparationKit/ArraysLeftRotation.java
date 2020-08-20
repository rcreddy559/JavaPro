package com.org.hackerrank.InterviewPreparationKit;

import java.util.Arrays;

public class ArraysLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] result = a.clone();
            while (d > 0) {
                int[] temp = result.clone();
                int lastValue = 0;
                for(int i=0;i<a.length;i++) {
                    if(i ==0 ) {
                        lastValue = result[0];
                        temp[0] = result[1];
                    } else if(i == result.length -1) {
                        temp[i] = lastValue;
                    } else {
                        temp[i] = result[i+1];
                    }

                }
                result = temp;
                d--;
            }
        return result;
    }

    static int[] rotLeft2(int[] a, int d) {
        int[] b = Arrays.copyOfRange(a, 0, d);
        int[] c = Arrays.copyOfRange(a, d, a.length);
        int y =0;
        int[] result = new int[a.length];

        for (int k : c) {
            result[y] = k;
            y++;
        }

        for (int j : b) {
            result[y] = j;
            y++;
        }
        return result;
    }
    // 9490609015

    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        int d = 4;
//        int[] a = {1,2,3,4,5};
//        int d = 2;

        int[]  a =  {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60 ,87, 97};
        int d = 13;


        int[] result = rotLeft(a, d);

        System.out.println(Arrays.toString(a));
        System.out.println("--------");
        System.out.println(Arrays.toString(result));
        result = rotLeft2(a, d);
        System.out.println(Arrays.toString(result));
    }
}
