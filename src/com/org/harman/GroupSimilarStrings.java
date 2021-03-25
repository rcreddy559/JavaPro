package com.org.harman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupSimilarStrings {

    public static void main(String[] args) {

        String[] list = new String[]{"abc","tkd","bca","fgd","cab","dfg","aabc"};
        List<String> arrayList =  Arrays.asList(list);
        Map<String,String> map = new HashMap<>();
        List<String> updatedList =  new ArrayList<>(arrayList);

        for(int i=0;i<arrayList.size();i++){
            for(int j=i+1;j<arrayList.size();j++){
                if(isMatching(arrayList.get(i), arrayList.get(j))){

                    if(map.get(arrayList.get(i))==null){
                        map.put(arrayList.get(i), arrayList.get(j));
                    }else{
                        map.put(arrayList.get(i),map.get(arrayList.get(i))+ " ; "+arrayList.get(j));
                    }
                    updatedList.remove(j);
                    arrayList = updatedList;
                }else{
                    map.put(arrayList.get(j), "");
                }
            }
            updatedList.remove(i);
            arrayList = updatedList;
        }

        System.out.println(map);
    }

    private static boolean isMatching(String first, String second) {

        String finalString = "";
        if(first.length()!=second.length()){
            return false;
        }else{
            for(int i=0; i<first.length();i++){
                for(int j=0; j<first.length();j++){
                    if(first.charAt(i)==second.charAt(j)){
                        finalString=finalString +second.charAt(j);
                    }
                }
            }
            if(first.equals(finalString))
                return true;
        }
        return false;
    }



}