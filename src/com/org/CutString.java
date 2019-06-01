package com.org;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CutString {

	public static String splitString(String msg, int lineSize) {
		StringBuffer sb = new StringBuffer();

		Pattern p = Pattern.compile("\\b.{1," + (lineSize - 1) + "}\\b\\W?");
		Matcher m = p.matcher(msg);

		while (m.find()) {
//			System.out.println(m.group().trim()); // Debug
			sb.append(m.group());
		}
		return sb.toString();
	}

	public static String splitStringWords(String message, int K) {
		StringTokenizer st = new StringTokenizer(message);
		StringBuffer sb = new StringBuffer(K);
		System.out.println(st.countTokens());

		String str = "";
		int temp = 0;
		while (st.hasMoreElements()) {

			str = st.nextToken();
			temp = (str.length() + 1 + sb.toString().trim().length());
			if (sb.length() <= K && temp <= K) {
				System.out.println(sb.length() + " : " + str);
				sb.append(str + " ");
			}
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {

		String s = splitStringWords("The quick brown fox jumps over the lazy dog", 39);
		System.out.println(s);
	}
}
