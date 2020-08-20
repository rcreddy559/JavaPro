import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'getElements' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> getElements(List<Integer> arr, List<List<Integer>> queries) {
        // Write your code here

        int rowLen = arr.get(0);
        int noOfRows  = arr.size()-1/rowLen;
        int[][] newArray = new int[noOfRows][rowLen];
        int rowLenCount = 1;
        for(int i=0;i<noOfRows;i++) {
            for(int j=1;j<rowLen;j++) {
                newArray[i][j] = arr.get(rowLenCount++);
            }
        }

        int[] result = new int[queries.size()] ;
        int resultCount = 0;
        for(int i=0;i<queries.size();i++){
            List<Integer> innerQueries = queries.get(i);
            int first = innerQueries.get(0);
            int second = innerQueries.get(1);
            int firstR = newArray[first][second];
            result[resultCount] = firstR;

        }
        List<Integer> i = new ArrayList<Integer>(queries.size());
        for(int a: result) {
            i.add(a);
        }
        return i;

    }

}
