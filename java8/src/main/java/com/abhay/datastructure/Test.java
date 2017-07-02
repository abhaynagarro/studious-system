package com.abhay.datastructure;

public class Test {

	public static void main(String[] args) {
		LinkList linkList = new LinkList(new LinkList.Node());
		LinkList.Node node2 = new LinkList.Node(20);
		LinkList.Node node3 = new LinkList.Node(30);
		LinkList.Node node4 = new LinkList.Node(40);
		linkList.getHead().setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		LinkList.print(linkList);

		LinkList.add(linkList, new LinkList.Node(50));
		LinkList.print(linkList);
	}

}
