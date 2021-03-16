package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {
public static void main(String[] args) {
	Map<Integer,String> map = new HashMap<>();
	map.put(1,"Pranjal");
	map.put(5, "chris");
	map.put(null, null);
	map.put(null, "Dante");
	map.put(2, "Sharma");
	map.put(3, "Nero");
	map.put(3, "Claire");
	System.out.println(map);
	for(Entry<Integer, String> item:map.entrySet()) {
		System.out.println(item);
	}
}
}
