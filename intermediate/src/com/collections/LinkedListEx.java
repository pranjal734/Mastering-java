package com.collections;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedListEx {
	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private Node first;
	private Node last;

	public void addLast(int item) {
		Node node = new Node(item);
		if (isEmpty())
			first = last = node;
		else {
			last.next = node;
			last = node;
		}
	}

	public void addFirst(int item) {
		Node node = new Node(item);
		if (isEmpty())
			first = last = node;
		node.next = first;
		first = node;
	}

	public int indexOf(int item) {
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return index;
			current = current.next;
			index++;
		}
		return -1;
	}

	public void removeFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		Node second = first.next;
		first.next = null;
		first = second;
	}

	public void removeLast() {
		if (isEmpty())
			throw new NoSuchElementException();
		Node current = first;
		while (current.next != null) {
			if (current.next == last)
				break;
			current = current.next;
		}

	}
	
	public void reverse() {
		if(isEmpty()) {
			return;
		}
		Node previous= first;
		Node current= first.next;
		while(current!=null) {
			Node next = current.next;
			current.next=previous;
			previous= current;
			current=next;
		}
		last=first;
		last.next=null;
		first=previous;
	}

	public void println() {

	}

	private boolean isEmpty() {
		return first == null;
	}

	public static void main(String[] args) {
		LinkedListEx list = new LinkedListEx();
		list.addLast(10);
		list.addLast(20);
		list.addLast(40);
		System.out.println(list);
		System.out.println(list.indexOf(10));
		System.out.print(list.reverse());
		int array= list.toArray();
		System.out.println(Arrays.toString(array));
	}
}
