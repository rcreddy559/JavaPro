package com.org.hackerrank;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = null;
        if(N % 2 != 0) {
            s = "Weird";
        } else if(N >= 2 && N <= 5) {
            s = "Not Weird";
        } else if(N >= 6 && N <= 20) {
            s =  "Weird";
        } else if(N > 20) {
            s =  "Not Weird";
        }
        System.out.println(s);
        scanner.close();
    }
}
