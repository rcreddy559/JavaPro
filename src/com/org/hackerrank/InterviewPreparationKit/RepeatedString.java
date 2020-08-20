package com.org.hackerrank.InterviewPreparationKit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedString {
    public static void main(String[] args) {
        Map<String, Long> strMap = new HashMap<>();
        strMap.put("a", 1000000000000L);
        strMap.put("x", 100000000L);
        strMap.put("abcac", 10L);
        strMap.put("aba", 10L);
        strMap.put("abc", 10000000000000L);

        for(Entry e: strMap.entrySet()) {
            System.out.println(e.getKey()+": ");
            System.out.println("Ravi:"+repeatedString2(e.getKey().toString(), Long.parseLong(e.getValue().toString())));
            System.out.println("Sravan:"+repeatedStringFromSravan(e.getKey().toString(), Long.parseLong(e.getValue().toString())));
            System.out.println();
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
        if(s == null || s.length() == 0 || s.indexOf('a') == -1) return 0;

        long repeatedCount = 0;
        for(int i = 0; i<s.length();i++) {
            if('a' == s.charAt(i)) {
                repeatedCount ++;
            }
        }

        long remainder = n % s.length();
        long rep = n/s.length();
        long result = rep * repeatedCount;
        String sRem = s.substring(0, (int)remainder);

        for(int i = 0; i<sRem.length();i++) {
            if('a' == s.charAt(i)) {
                result ++;
            }
        }

        return result;
    }

    static long repeatedStringFromSravan(String s, long n) {
        Pattern p = Pattern.compile("[a]");
        Matcher m = p.matcher(s);
        long count = 0;

        if (s == null  || s.isEmpty()) {
            return count;
        }

        if (s.length() == 1 && s.equals("a")) {
            return n;
        } else if (s.length() > 1 && m.find() && countIntValue(n) == 0) {

            // String sb = new String(new char[(int) n]).replace("\0", s);
            // String.join("", Collections.nCopies(n, s));

            String sb = s.repeat((int) n);

            // String sb = new String(new char[ (int) n]).replace("\0", s);

            for (int i = 0, j = 0; i < sb.length() && j <n; i++, j++) {
                if (sb.charAt(i) == 'a') {
                    count++;
                }
            }

            return count;

        } else if (s.length() > 1 && m.find() && countIntValue(n) > 0) {
            StringBuffer sb = new StringBuffer();
            for (int q = 0; q < countIntValue(n); q++) {
                String r = s.repeat((int) q);
                sb.append(r);

            }

            for (int i = 0, j = 0; i < sb.toString().length() && j < n; i++, j++) {
                if (sb.charAt(i) == 'a') {
                    count++;
                }
            }

            return count;
        }
        return count;
    }

    static int countIntValue(long n) {

        return (int) (n / Integer.MAX_VALUE);
    }


}
