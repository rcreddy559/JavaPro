package com.org.hackerrank.InterviewPreparationKit;

public class HalloweenSale {

    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        int result = 0;
        int price = p;
        while(s >= price) {
            s -= price;
            price = Math.max(m, price-d);
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
    }
}
