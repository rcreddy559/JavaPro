package com.org.hackerrank;

import java.util.Scanner;

public class NewYearChaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
    	 // check whether result is to chaotic 
    	for(int i=0;i<q.length;i++) {
    		if(q[i]-1-i> 2) {
    			System.out.println("Too chaotic");
    			return;
    		}
    	}
    	
    	//use Buble sort to track number of swaps needed
    	
    	int swaps = 0;
    	
    	
    	for(int i =1; i<q.length;i++) {
    		for(int j=0;j<q.length-1;j++) {
    			if(q[j]>q[j+1]) {
    				swaps++;
    				int temp = q[j+1];
    				q[j+1] = q[j];
    				q[j] = temp;
    			}
    		}
    	}
    	
    	
    	System.out.println(swaps);
    }

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}
}
