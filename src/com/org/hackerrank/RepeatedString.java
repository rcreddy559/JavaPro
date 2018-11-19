package com.org.hackerrank;

import java.io.IOException;
import java.util.Scanner;

/*
 * Repeated String
 * https://www.hackerrank.com/challenges/repeated-string/
 */
public class RepeatedString {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long count = 0;

		if (n > s.length()) {
			long repeat = n / s.length();
			long diff = n % repeat;
			for (char c : s.toCharArray()) {
				if (c == 'a')
					count++;
			}
			count = count * repeat;
			for (int i = 0; i < diff; i++) {
				if (s.charAt(i) == 'a')
					count++;
			}
		} else {
			int len = (int) n;
			s = s.substring(0, len + 1);
			for (char c : s.toCharArray()) {
				if (c == 'a')
					count++;
			}
		}
		
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
		String s = "aba"; // scanner.nextLine();

		long n = 10;// scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
	}
}
