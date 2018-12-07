package com.org.linkedlist;

//A simple Java program to introduce a linked list 
class LinkedList {
	Node head; // head of list

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		} // Constructor
	}

	void printMiddle() {
		Node slow = head;
		Node fast = head;

		if (head != null) {
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("The middle element is [" + slow.data + "] \n");

		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		for (int i = 6; i > 0; --i) {
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}

	/* method to create a simple linked list with 3 nodes */
	public static void main2(String[] args) {
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		/*
		 * Three nodes have been allocated dynamically. We have refernces to these three
		 * blocks as first, second and third
		 * 
		 * llist.head second third | | | | | | +----+------+ +----+------+ +----+------+
		 * | 1 | null | | 2 | null | | 3 | null | +----+------+ +----+------+
		 * +----+------+
		 */

		llist.head.next = second; // Link first node with the second node

		/*
		 * Now next of first Node refers to second. So they both are linked.
		 * 
		 * llist.head second third | | | | | | +----+------+ +----+------+ +----+------+
		 * | 1 | o-------->| 2 | null | | 3 | null | +----+------+ +----+------+
		 * +----+------+
		 */

		second.next = third; // Link second node with the third node

		/*
		 * Now next of second Node refers to third. So all three nodes are linked.
		 * 
		 * llist.head second third | | | | | | +----+------+ +----+------+ +----+------+
		 * | 1 | o-------->| 2 | o-------->| 3 | null | +----+------+ +----+------+
		 * +----+------+
		 */
	}
}
