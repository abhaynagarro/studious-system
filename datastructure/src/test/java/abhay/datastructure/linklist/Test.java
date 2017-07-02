package abhay.datastructure.linklist;

public class Test {

	public static void main(String[] args) {
		LinkList list = new LinkList(new LinkNode(null, 10));
		list.printList();
		list.addAtBegin(new LinkNode(null, 12));
		list.printList();

		list.addAtBegin(new LinkNode(null, 15));
		list.printList();

		list.addAtBegin(new LinkNode(null, 5));
		list.printList();

		list.addAtEnd(new LinkNode(null, 13));
		list.printList();
		list.addAtEnd(new LinkNode(null, 18));
		list.printList();

		list.addAtPosition(new LinkNode(null, 3), 3);
		list.printList();

		list.addAtPosition(new LinkNode(null, 5), 5);
		list.printList();

		list.addAtPosition(new LinkNode(null, 1), 1);
		list.printList();

		list.addAtPosition(new LinkNode(null, 10), 10);
		list.printList();

		list.removeFromBegin();
		list.printList();

		list.removeFromEnd();
		list.printList();
	}

}
