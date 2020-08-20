package com.org.hackerrank.InterviewPreparationKit;

public class SavethePrisoner {
    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int nRep = s;

        while (m > 0) {
             if(nRep == n) {
                 nRep = 0;
             } else {
                 nRep++;
             }

            m--;
        }
        System.out.println(nRep);
        return nRep;
    }

    private static int getConcernedPrisoner(int N, int M, int S) {
        final int prisonerId = (S + (M - 1)) % N;
        //if prisonerId comes as 0 means we are talking about Nth as Mod will never give us N
        return prisonerId == 0 ? N : prisonerId;
    }

    public static void main(String[] args) {
       // saveThePrisoner(4,6,2);
//        saveThePrisoner(5,2,1);
        System.out.println(getConcernedPrisoner(5,2,1));
        System.out.println(getConcernedPrisoner(4,6,2));
    }
}
