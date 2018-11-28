package com.org.search.binarysearch;

import com.org.search.binarysearch.Node;

public class BinaryTree {
	static Node root;
	public static int[] array = new int[10];
	public static int i = 0;
	int treeSize = 0;

	BinaryTree() {
		this.root = null;
	}

	private void addNode(int value) {
		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
			return;
		} else {
			Node currentNode = root;
			Node parentNode = null;

			while (true) {
				parentNode = currentNode;
				if (value < currentNode.data) {
					currentNode = currentNode.left;
					if (currentNode == null) {
						parentNode.left = newNode;
						return;
					}
				} else {
					currentNode = currentNode.right;
					if (currentNode == null) {
						parentNode.right = newNode;
						return;
					}
				}
			}
		}

	}

	protected void inorderTraversal(Node root2) {
		if (root2 != null) {
			inorderTraversal(root2.left);
			System.out.print(" " + root2.data);
			array[i] = root2.data;
			i++;
			inorderTraversal(root2.right);
		}
	}

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		b.addNode(50);
		b.addNode(20);
		b.addNode(10);
		b.addNode(40);
		b.addNode(60);
		b.addNode(80);
		b.addNode(90);
		b.addNode(30);
		b.addNode(70);
		b.inorderTraversal(root);
	}
}