package com.org.hackerrank;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraytest {
    public static List<Integer> getElements(List<Integer> arr, List<List<Integer>> queries) {
        // Write your code here

        int rowLen = arr.get(0);
        int noOfRows  = (arr.size()-1)/rowLen;
        int newArray[][] = new int[noOfRows][rowLen];

        int rowLenCount = 1;

        for(int j=0;j<noOfRows;j++) {
            for(int i=0;i<rowLen;i++) {
                newArray[j][i] = arr.get(rowLenCount++);
            }
        }

        int result[] = new int[queries.size()] ;
        int resultCount = 0;

        for(int i=0;i<queries.size();i++){
            List<Integer> innerQueries = queries.get(i);
            int first = innerQueries.get(0)-1;
            int second = innerQueries.get(1)-1;
            int firstR = newArray[first][second];
            result[resultCount++] = firstR;

        }
        List<Integer> i = new ArrayList<Integer>(queries.size());
        for(int a: result) {
            i.add(a);
        }
        return i;

    }

    public static void main(String[] args) throws IOException {
        List<List<Integer>> queries = new ArrayList<>();

        int[] a = {4, 1,2,3,4,5,6,7,8,9,10,11,12};
        //1  2  3  4
        //5  6  7  8
        //9 10 11 12
        List<Integer> l = new ArrayList(a.length);
        for(int a1: a) {
            l.add(a1);
        }
        List<Integer> b1l =  new ArrayList<>();
        b1l.add(3);
        b1l.add(2);
        List<Integer> b2l =  new ArrayList<>();
        b2l.add(2);
        b2l.add(1);

        queries.add(b1l);
        queries.add(b2l);

        getElements(l, queries);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < arrCount; i++) {
//            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
//            arr.add(arrItem);
//        }
//
//        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());
//        int queriesColumns = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<Integer>> queries = new ArrayList<>();
//
//        for (int i = 0; i < queriesRows; i++) {
//            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            List<Integer> queriesRowItems = new ArrayList<>();
//
//            for (int j = 0; j < queriesColumns; j++) {
//                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
//                queriesRowItems.add(queriesItem);
//            }
//
//            queries.add(queriesRowItems);
//        }
//
//        List<Integer> result = getElements(arr, queries);


    }
}
