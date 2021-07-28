package com.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
	public static void main(String[] args) {
		String text = "this is the text to be searched" + "for the occurence of http:// pattern";
		String patternString = ".http://.";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		System.out.println(matcher.matches());
		/*
		 * Matching the regular expression against the whole text (matches()) will
		 * return false, because the text has more characters than the regular
		 * expression.
		 */
		System.out.println(matcher.lookingAt());
		/*
		 * The regular expression says that the text must match the text "This is the"
		 * exactly, with no extra characters before or after the expression.
		 */
	}
}
