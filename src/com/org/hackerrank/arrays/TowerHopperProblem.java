package com.org.hackerrank.arrays;

/*
 * Tower Hopper problem recursive approach.
 * https://codereview.stackexchange.com/questions/186085/tower-hopper-problem-recursive-approach
 */
public class TowerHopperProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] towers = { 4, 2, 0, 0, 2, 0 };
		boolean isHoppable = IsHoppableSimple(towers, towers.length);
		System.out.println(isHoppable);
	}

	public static boolean IsHoppableSimple(int[] array, int len) {
		int current = 0;
		while (true) {
			if (current >= len)
				return true;

			if (array[current] == 0)
				return false;

			current = bestNextStep(current, array, len);
		}
	}

	private static int bestNextStep(int current, int[] array, int len) {
		int best = current + array[current]; // Assuming the current farthest is the best

		for (int i = current; i < current + array[current]; i++) // find the actual best
		{
			if (i + array[i] > len)
				return i + array[i]; // caution against getting outside of the bounds of the array

			if (i + array[i] > best)
				best = i + array[i];
		}

		return best;
	}
}
