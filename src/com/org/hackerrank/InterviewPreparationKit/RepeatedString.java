package com.org.hackerrank.InterviewPreparationKit;

import java.util.HashMap;
import java.util.Map;

public class RepeatedString {
    public static void main(String[] args) {
        Map<String, Long> strMap = new HashMap<>();
        strMap.put("a", 10L);
        strMap.put("x", 100000000L);
        strMap.put("abcac", 10L);
        strMap.put("aba", 10L);
        strMap.put("abc", 100000000L);

        for(Map.Entry e: strMap.entrySet()) {
            System.out.print(e.getKey()+": ");
            System.out.println(repeatedString2(e.getKey().toString(), Long.valueOf(e.getValue().toString())));
        }

    }

    private static long repeatedString(String s, long n) {
        long result = 0;
        if(s == null || s.length() == 0 || s.indexOf('a') == -1) {
            return 0;
        }

        long rep = n/s.length();
        long remainder = n % s.length();
        String sRepeater = "";
        while (rep >0) {
            sRepeater += s;
            rep--;
        }
        sRepeater += s.substring( 0, (int) remainder);
        for(int i = 0; i<sRepeater.length();i++) {
            if('a' == sRepeater.charAt(i)) {
                result ++;
            }
        }
        return result;
    }
    private static long repeatedString2(String s, long n) {
        long result = 0;
        if(s == null || s.length() == 0 || s.indexOf('a') == -1) {
            return 0;
        }

        long rep = n/s.length();
        long remainder = n % s.length();
        long repeatedCount = 0;
        for(int i = 0; i<s.length();i++) {
            if('a' == s.charAt(i)) {
                repeatedCount ++;
            }
        }
        long count = 0;
        String sRem = s.substring(0, (int)remainder);
        for(int i = 0; i<sRem.length();i++) {
            if('a' == s.charAt(i)) {
                count ++;
            }
        }

        result = rep * repeatedCount + count;

        return result;
    }
}
