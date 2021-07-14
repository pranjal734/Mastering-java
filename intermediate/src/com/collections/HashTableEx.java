package com.collections;

import java.util.*;

public class HashTableEx {
	private class Entry {
		private int key;
		private String value;

		public Entry(int key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	private LinkedList<Entry>[] entries = new LinkedList[5];

	public void put(int key, String value) {
		int index = hash(key);
		if (entries[index] == null)
			entries[index] = new LinkedList<>();

		LinkedList<Entry> bucket = entries[index];
		for (Entry entry : bucket)
			if (entry.key == key) {
				entry.value = value;
			}
		bucket.addLast(new Entry(key, value));
	}

	private int hash(int key) {
		return key % entries.length;
	}

	public String get(int key) {
		int index = hash(key);
		LinkedList<Entry> bucket = entries[index];
		if (bucket != null) {
			for (Entry entry : bucket) {
				if (entry.key == key)
					return entry.value;
			}
		}
		return null;
	}
	
	public void remove(int key) {
		int index = hash(key);
		LinkedList<Entry> bucket = entries[index];
		if(bucket==null) {
			throw new IllegalStateException();
		}
		for(Entry entry:bucket) {
			if(entry.key==key)
				bucket.remove(entry);
			return;
		}
		
	}

	public static void main(String[] args) {
HashTableEx table = new HashTableEx();
table.put(6, "S");
table.put(3, "R");
table.put(3, "T");
table.put(9, "E");
table.remove(3);
System.out.println(table);
	}
}
