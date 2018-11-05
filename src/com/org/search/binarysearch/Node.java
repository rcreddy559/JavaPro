package com.org.search.binarysearch;
 
public class Node {
	 Node left;
	 Node right;
	 int data;
	 String name;
	
	public Node(int data, String name) {
		this.data = data; 
		this.name = name;
	}
	
	public Node(int data) {
		this.data = data; 
		this.name = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
