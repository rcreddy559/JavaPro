package com.org.hackerrank;


import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	
    	Character U = new Character('U');
    	Character D = new Character('D');
    	int count = 0;
    	int valleys = 0;
    	for(int i=0;i<n-1;i++) {
    		Character c = s.charAt(i);
    		if(U.equals(c)) {
    			count++;
    		} else {
    			count--;
    			if(count == -1) {
    				valleys++;
    			}
    		}
    	}
    	System.out.println(valleys);
    	return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        String s = scanner.nextLine();
    	int n = 8;
    	String s = "UDDDUDUU";

        int result = countingValleys(n, s);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
