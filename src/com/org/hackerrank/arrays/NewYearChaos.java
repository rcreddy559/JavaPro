package com.org.hackerrank.arrays;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos/problem
 */
public class NewYearChaos {
    public static void main(String[] args) {
         int[] q = {1,2,3,4,5};

        minimumBribes(q);
    }

    private static void minimumBribes(int[] arr) {
        int count = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] != i+1) {
                if(i-1 >= 0 && arr[i-1] == (i+1) ) {
                    count++;
                    swap(arr, i, i-1);
                } else if(i-2 >= 0 && arr[i-2] == (i+1)){
                    count += 2;
                    swap(arr, i-2, i-1);
                    swap(arr, i-1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }

            }
        }
        System.out.println(count);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
