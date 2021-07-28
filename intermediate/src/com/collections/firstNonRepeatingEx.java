package com.collections;

import java.util.*;

public class firstNonRepeatingEx {
	public int findFirstNonRepeatingchar(String str) {
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		char[] chars = str.toCharArray();
		for (char ch : chars) {
			count = map.containsKey(ch) ? map.get(ch) : 0;
			map.put(ch, count + 1);
		}
		for(char ch:chars)
			if(map.get(ch)==1) 
				return ch;
				return Character.MIN_VALUE;
			}

	public static void main(String[] args) {
		firstNonRepeatingEx cf = new firstNonRepeatingEx();
		char ch =(char) cf.findFirstNonRepeatingchar("a green apple");
	System.out.println(ch);
	}
}
