package com.basics;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class RegEx3 {
		public static void main(String[] args) {
			String text = "this is the text to be searched" + "for the occurence of word 'is'";
			String patternString = "is";

	        Pattern pattern = Pattern.compile(patternString);
	        Matcher matcher = pattern.matcher(text);

	        int count = 0;
	        while(matcher.find()) {
	            count++;
	            System.out.println("found: " + count + " : "
	                    + matcher.start() + " - " + matcher.end());
	        }
	    }
	}