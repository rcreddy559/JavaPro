package com.org.hackerrank.arrays;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Hourglass2DArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	int temp;
    	int max = Integer.MIN_VALUE;
    	
    	//[k=1][k=2][k=3] , i=1
    	//	   [k=1]      , i=2
    	//[k=1][k=2][k=3] , i=3
    	for(int i=0;i<4;i++) {
    		for(int k=0;k<4;k++) {
    			temp = arr[i][k]+arr[i][k+1]+arr[i][k+2]
    							+arr[i+1][k+1]
    					+arr[i+2][k]+arr[i+2][k+1]+arr[i+2][k+2];
    			max = Math.max(temp, max);
    		}
    	}
		
    	return max;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
//                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = rand.nextInt(5)+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int result = hourglassSum(arr);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
