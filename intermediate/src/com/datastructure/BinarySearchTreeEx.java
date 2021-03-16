package com.datastructure;

public class BinarySearchTreeEx {
	private class Node{
		private Node leftChild;
		private Node rightChild;
		private int value;
		public Node(int value) {
			this.value= value;
		}
		@Override
		public String toString() {
			return "Node="+ value;
		}
	}
	private Node root;
	public void insert(int value) {
		Node node = new Node(value);
		if(root==null) {
			root = node;
			return;
		}
		Node current = root;
		while(true) {
			if(value<current.value) {
				if(current.leftChild==null) {
				current = node;
					break;
				}
				current = current.leftChild;
			}
				else 
					if(current.rightChild==null) {
					current = node;
						break;
					}
					current = current.rightChild;
				
				}
			
		}
	
public static void main(String[] args) {
	BinarySearchTreeEx bst = new BinarySearchTreeEx();
	bst.insert(7);
	bst.insert(4);
	bst.insert(3);
	bst.insert(9);
	bst.insert(11);
	System.out.println("Done");
}
}
