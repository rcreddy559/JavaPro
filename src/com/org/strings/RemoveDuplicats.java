package com.org.strings;

public class RemoveDuplicats {

	public static String removeDupsSorted(String str) {
		str = StringSorting.sortString(str);

		int res_ind = 1, ip_ind = 1;

		// Character array for removal of duplicate characters
		char arr[] = str.toCharArray();

		/* In place removal of duplicate characters */
		while (ip_ind != arr.length) {
			if (arr[ip_ind] != arr[ip_ind - 1]) {
				arr[res_ind] = arr[ip_ind];
				res_ind++;
			}
			ip_ind++;

		}

		str = new String(arr);
		return str.substring(0, res_ind);
	}

	public static void main(String[] args) {
		System.out.println(removeDupsSorted("ravichandrareddyshobha"));
	}
}
