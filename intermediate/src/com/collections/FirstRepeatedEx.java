package com.collections;

import java.util.*;

public class FirstRepeatedEx {
	public int firstReapeatedCharacter(String str) {
		Set<Character> set = new HashSet<>();
		for(char ch:str.toCharArray()) {
			if(set.contains(ch))
					return ch;
			set.add(ch);
		}
		return 0;
		
	}
public static void main(String[] args) {
	FirstRepeatedEx fr = new FirstRepeatedEx();
	char ch = (char)fr.firstReapeatedCharacter("a green apple");
	System.out.println(ch);
}
}
