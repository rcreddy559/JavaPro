package com.org.hackerrank.java;

import java.util.Scanner;

public class PrinrdDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s =scanner.next();
        scanner.nextLine();
        int d = scanner.nextInt();
        System.out.printf("%-14s%03d", s, d);
    }
}
