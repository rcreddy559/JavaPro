package com.org.hackerrank.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateMatrix {

	public static void main(String[] args) {
		rotate();
	}

	private static void rotate() {
		int[][] matrix = getMatrix();
		
	}

	static int[][] getMatrix() {
		int[][] matrix = new int[3][3];
		int count = 1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = count++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=====");
		return matrix;
	}

}
