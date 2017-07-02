package com.abhay.datastructure;

public class LinkList {

	private Node head;

	public LinkList(Node head) {
		super();
		this.head = head;
	}

	public static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
		}

		public Node() {
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

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public static void print(LinkList list) {
		Node head = list.getHead();
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void add(LinkList list, Node node) {
		Node head = list.getHead();
		node.next = head.next;
		head.next = node;
	}

}
