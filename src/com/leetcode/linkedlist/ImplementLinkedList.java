package com.leetcode.linkedlist;

public class ImplementLinkedList {
	public static void main(String[] args) {
		Node ten = new Node(10);
		Node twenty = new Node(20);
		Node thirty = new Node(30);
		Node forty = new Node(40);
		Node fifty = new Node(50);

		Node head = ten;
		ten.setNext(twenty);
		twenty.setNext(thirty);
		thirty.setNext(forty);
		forty.setNext(fifty);
		fifty.setNext(null);
		
		

		printLinkedList(head);
	}

	public static void printLinkedList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}

	}
}

class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
