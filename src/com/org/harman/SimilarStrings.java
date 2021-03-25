package com.org.harman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimilarStrings {
    public static void main(String[] args) {
        String[] list = new String[] {"abc","tkd","bca","fgd","cab","dfg","aabc"};
        getSimilarStrings(list);
        getSimilarStrings2(list);
    }

    private static void getSimilarStrings2(String[] list) {
//        String[]
    }


    private static void getSimilarStrings(String[] list) {
        Map<String , String[]> map = new HashMap<>();

        for (int i=0;i<list.length;i++) {
            String s = list[i];
            if(map.size() == 0) {
                map.put(s, new String[]{s});
            }
            else {
                for(String key: map.keySet()){

                    if(key.length() == s.length()) {
                            if(sort(key).equalsIgnoreCase(sort(s))) {
                                addToMap(key, s, map);

                            } else {
                                map.put(s, new String[]{s});
                            }
                        }
                    }
                }
            }

        map.forEach((k,v)->{
            System.out.println("Key: "+k+"; Value:"+v);
        });
        }

    private static void addToMap(String key, String value, Map<String, String[]> map) {
        String[] arr = map.get(key);
        String[] newArr = new String[arr.length+1];
        int count = 0;
        newArr[count] = value;
        for(String s: arr) {
            newArr[++count] = s;
        }
        map.put(key, newArr);
    }


    private static String sort(String s) {
        char charArray[] = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
