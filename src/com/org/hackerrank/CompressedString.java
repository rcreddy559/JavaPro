package com.org.hackerrank;

/*
 * http://prepinsta.com/mettl-coding-questions-3/
 */
public class CompressedString {

	public static void main(String[] args) {
		compressedString();
	}

	static void compressedString() {
		String input = "aaaaabbbccccccccdaa";
		// output: a5b3c8d1a2

		String s1 = "";
		int count = 1;

		for (int i = 0; i < input.length(); i++) {
			if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
				count++;
			} else {
				s1 += input.charAt(i) + "" + (count);
				count = 1;
			}
		}
		System.out.println(s1);
	}

}
