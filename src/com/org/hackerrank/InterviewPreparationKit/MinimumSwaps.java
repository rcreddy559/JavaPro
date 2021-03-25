package com.org.hackerrank.InterviewPreparationKit;

import java.util.stream.Stream;

public class MinimumSwaps {

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        int count = minimumSwaps(arr);
        count = minimumSwaps2(arr);
        System.out.println(count);
    }
    private static int minimumSwaps2(int[] arr) {

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==i+1) continue;
            count++;
            int tmp = arr[i];
            arr[i] = arr[tmp-1];
            arr[tmp-1] = tmp;
            i--;
        }
        return count;
    }

    private static int minimumSwaps(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i; j<arr.length;j++) {
                if(arr[i] < arr[j]) {
                    swap(i, j, arr);
                    count++;
                }
            }
        }


        for(int i: arr){
            System.out.println(i);
        }
        System.out.println(count);
        return count;
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
