package com.collections;

import java.util.LinkedList;

public class GetElementLL {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("AA");
		list.add("BB");
		list.add("KI");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index " + i + " is: " + list.get(i));
		}

	}

}
