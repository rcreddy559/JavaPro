package com.org.hackerrank;

import java.io.IOException;
import java.util.Scanner;
/*
 * Jumping on the Clouds
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/
 */
public class JumpingOnTheClouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		int i = 0;
		int n = c.length;
		while (i < n - 1) {
			if (i < n - 2 && c[i + 2] == 0) {
				i++;
			}
			if (i != n - 1) {
				count++;
			}
			i++;
		}

		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = 7;// scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = { 0, 0, 1, 0, 0, 1, 0 };

//		String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//		for (int i = 0; i < n; i++) {
//			int cItem = Integer.parseInt(cItems[i]);
//			c[i] = cItem;
//		}

		int result = jumpingOnClouds(c);
		System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

		scanner.close();
	}
}
