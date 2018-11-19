package com.org.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int count = 0;
		
		Arrays.sort(ar);
		for(int i=0;i<n-1;i++) {
			if(i<n && ar[i] == ar[i+1]) {
				count++;
				i = i+1;
			}
		}
		
		System.out.println(count);

		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		
		System.out.println(n+" : "+ar.toString());

		int result = sockMerchant(n, ar);

//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();

//		bufferedWriter.close();

		scanner.close();
	}
}
