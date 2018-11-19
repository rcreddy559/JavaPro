package com.org.hackerrank.arrays;

/*
 * Left Rotation
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	int[] res = new int[a.length];
    	int newRotaIndex = d % a.length;
    	
    	for(int i=0;i<a.length;i++) {
    		int mod = (newRotaIndex+i) % a.length;
    		res[i] = a[mod];
    	}
    	
		return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String[] nd = {4,2,5,3,1,0};//scanner.nextLine().split(" ");

//        int n = //Integer.parseInt(nd[0]);

        int d = 5;//Integer.parseInt(nd[1]);

        int[] a = {4,2,5,3,1,0};

//        String[] aItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int aItem = Integer.parseInt(aItems[i]);
//            a[i] = aItem;
//        }

        int[] result = rotLeft(a, d);
        
        for(int i=0;i<result.length;i++) {
        	System.out.print(a[i]+", ");
        }
        System.out.println();
        for(int i=0;i<result.length;i++) {
        	System.out.print(result[i]+", ");
        }
        
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
