package com.org.search.binarysearch;

public class BinarySearchTree {
	private Node root;

	BinarySearchTree(Integer ...args) {

		for(Integer i: args) {
			add(i);
		}
	}

	public boolean isEmpty() {
		return root == null;
	}
	public int size() {
		return sizeRecursive(root);
	}

	private int sizeRecursive(Node root) {
		return root == null ? 0 : sizeRecursive(root.left) + 1 + sizeRecursive(root.right);
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public boolean contains(int value) {
		return containsNode(root, value);
	}

	public void delete(int value) {
		root = deleteRecursive(root, value);
	}

	private Node deleteRecursive(Node current, int value) {
		if(current == null) {
			return null;
		}

		if(value == current.data) {
			if(current.right == null && current.left == null) {
				return null;
			}

			if(current.left == null) {
				return current.right;
			}

			if(current.right == null) {
				return current.left;
			}

			int small = findSmallRecursive(current.right);
			current.data = small;
			current.right = deleteRecursive(current.right, small);
			return current;
		}

		if(value < current.data) {
			current.left = deleteRecursive(current.left, value);
		}

		current.right = deleteRecursive(current.right,value);
		return current;
	}

	public int findSmall() {
		return findSmallRecursive(root);
	}

	private int findSmallRecursive(Node root) {
		return root.left == null ? root.data : findSmallRecursive(root.left);
	}

	public int findLarge() {
		return findLargeRecursive(root);
	}

	private int findLargeRecursive(Node root) {
		return root.right == null ? root.data : findSmallRecursive(root.right);
	}

	private boolean containsNode(Node root, int value) {
		if(root == null) {
			return false;
		}
		if(value == root.data) {
			return true;
		}

		return value < root.data ? containsNode(root.left, value) : containsNode(root.right, value);
	}

	private Node addRecursive(Node root, int value) {
		if(root == null) {
			root = new Node(value);
		}
		if(value < root.data) {
			root.left = addRecursive(root.left, value);
		} else if(value > root.data) {
			root.right = addRecursive(root.right, value);
		} else {
			return root;
		}
		return root;
	}

	public void traversePostOrder() {
		traversePostOrder(root);
	}

	public void traversePostOrder(Node current) {
		if(current != null) {
			traversePostOrder(current.left);
			traversePostOrder(current.right);
			System.out.print(" "+current.data);
		}
	}
	public void traversePreOrder() {
		traversePreOrder(root);
	}

	public void traversePreOrder(Node current) {
		if(current != null) {
			System.out.print(" "+current.data);
			traversePostOrder(current.left);
			traversePostOrder(current.right);
		}
	}

	public void traverseInOrder() {
		traverseInOrder(root);
	}

	public void traverseInOrder(Node current) {
		if(current != null) {
			traversePostOrder(current.left);
			System.out.print(" "+current.data);
			traversePostOrder(current.right);

		}
	}

	public int maxDepth() {
		return maxDepth(root);
	}

	public int maxDepth(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null){
			return 1;
		}
		else{
			int l = maxDepth(root.left);
			int r = maxDepth(root.right);
			return (1 + (Math.max(l, r)));
		}
	}

	public static void main(String[] args) {
		Integer[] nodeArray = {10,20,1,5,6,8,24,11,15,18,3};
		BinarySearchTree b = new BinarySearchTree(nodeArray);
		b.traversePostOrder();
		System.out.println();
		b.traverseInOrder();
		System.out.println();
		b.traversePreOrder();
		System.out.println();
		System.out.println(b.maxDepth());
	}
}
