package com.org.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

	public static void main(String[] args) {
		String text    =
	            "This is the text to be searched " +
	            "for occurrences of is the pattern.";

	        String patternString  = ".*is.*";

	        boolean matches = Pattern.matches(patternString , text);

	        System.out.println("matches = " + matches);
	        Pattern p = Pattern.compile(patternString);
	        Matcher matcher = p.matcher(text);
	        
	        matches  = matcher.matches();
	        System.out.println("matches = " + matches);

	}

}
