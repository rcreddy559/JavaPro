package com.org;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CutString {

	public static String splitString(String msg, int lineSize) {
		if (msg == null || msg.isEmpty() || lineSize <= 0) {
			return "";
		}

		StringBuilder sb = new StringBuilder(msg.length());

		Pattern p = Pattern.compile("\\b.{1," + lineSize + "}\\b\\W?");
		Matcher m = p.matcher(msg);

		while (m.find()) {
			sb.append(m.group());
		}
		return sb.toString();
	}

	public static String splitStringWords(String message, int K) {
		if (message == null || message.isEmpty() || K <= 0) {
			return "";
		}

		StringTokenizer st = new StringTokenizer(message);
		StringBuilder sb = new StringBuilder(K);

		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			int nextLength = sb.length() == 0 ? str.length() : sb.length() + 1 + str.length();

			if (nextLength <= K) {
				if (sb.length() > 0) {
					sb.append(' ');
				}
				sb.append(str);
			} else {
				break;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		String s = splitStringWords("The quick brown fox jumps over the lazy dog", 39);
		System.out.println(s);
	}
}
