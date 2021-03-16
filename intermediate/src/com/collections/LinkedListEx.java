package com.collections;

public class LinkedListEx {
	private class Node{
		private int value;
		private Node next;
		public Node(int value) {
this.value=value;		}
	}
private Node first;
private Node last;
public void addLast(int item) {
	Node node = new Node(item);
	if(first==null)
		first=last=node;
	else {
		last.next=node;
		last=node;
	}
}

public void addFirst(int item) {
	
}

public void println() {
	
}
public static void main(String[] args) {
	LinkedListEx list = new LinkedListEx();
	list.addLast(10);
	list.addLast(20);
	list.addLast(40);
	System.out.println(list);
}
}
