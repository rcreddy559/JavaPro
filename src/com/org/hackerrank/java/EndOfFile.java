package com.org.hackerrank.java;

import java.awt.*;
import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line;
        int count = 1;
        while (scanner.hasNext()) {
            line = scanner.next();
            System.out.println(count+" "+line);
            count++;
        }

    }
}
