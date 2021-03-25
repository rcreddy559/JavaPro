package com.org.hackerrank;

import java.util.Arrays;

public class PalindromeFinder {

    public static void main(String[] args) {
//        System.out.println(longestPalindromeString("1234"));
//        System.out.println(longestPalindromeString("12321"));
//        System.out.println(longestPalindromeString("9912321456"));
//        System.out.println(longestPalindromeString("9912333321456"));
//        System.out.println(longestPalindromeString("12145445499"));
//        System.out.println(longestPalindromeString("1223213"));
//        System.out.println(longestPalindromeString("abb"));

        System.out.println(isPalindrome("testset"));
        System.out.println(isPalindrome(12321));
    }

    public static boolean isPalindrome(String value) {
        if(value == null || value.length() == 0 || value.equalsIgnoreCase(" "))
            return false;

        return reverse(value).equalsIgnoreCase(value);
    }

    public static boolean isPalindrome(int value) {
        if(value == 0 || value < 0)
            return false;

        return value == reverse(value);
    }
    public static String reverse(String value) {
        char[] arr = value.toCharArray();
        int n = arr.length-1;
        for(int i=0;i<n/2;i++) {
            char tmp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = tmp;
        }
        return new String(arr);
    }

    public static int reverse(int value) {
        int n = value;
        int rev = 0;

        while (n > 0) {
            int rm = n %10;
            rev = rev *10 + rm;
            n = n/10;
        }
        return rev;
    }
    public static String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    // O(n^2)
    public static String longestPalindromeString(String s) {
        if (s == null) return null;
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            //odd cases like 121
            String palindrome = intermediatePalindrome(s, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            //even cases like 1221
            palindrome = intermediatePalindrome(s, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }

}
