package com.org.hackerrank;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class CompareTheTriplets {

	public final static int SIZE = 3;
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> result = new ArrayList<>();
    	int aCount = 0;
    	int bCount = 0;
    	
    	for(int i=0;i<SIZE;i++) {
    		if(a.get(i) > b.get(i)) {
    			aCount++;
    		} else if(b.get(i) > a.get(i)) {
    			bCount++;
    		}
    	}
    	result.add(aCount);
    	result.add(bCount);
    	return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);
        result.forEach(i->System.out.println(i));

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }

}
