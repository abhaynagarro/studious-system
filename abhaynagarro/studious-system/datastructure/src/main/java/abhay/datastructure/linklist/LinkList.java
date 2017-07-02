package abhay.datastructure.linklist;

public class LinkList {
	LinkNode head;

	public LinkNode getHead() {
		return head;
	}

	public void setHead(LinkNode head) {
		this.head = head;
	}

	public LinkList(LinkNode head) {
		super();
		this.head = head;
	}

	public void addAtBegin(LinkNode node) {
		node.setNext(head);
		head = node;
	}

	public void addAtEnd(LinkNode node) {

		if (null == head) {
			head = node;
		} else {
			LinkNode temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}

	}

	public void addAtPosition(LinkNode node, int position) {
		int i = 1;
		if (position == 1) {
			node.setNext(head);
			head = node;
		} else {
			LinkNode temp = head;
			while (i < position - 1) {
				i++;
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);

		}
	}

	@Override
	public String toString() {
		return "[" + head + "]";
	}

	public void printList() {
		LinkNode node = getHead();
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println();
	}

	public void removeFromBegin() {
		LinkNode temp = head;
		if (null != temp) {
			head = head.getNext();
			temp.setNext(null);
		}

	}

	public void removeFromEnd() {
		LinkNode prev = null;
		LinkNode curr = head;
		while (curr.getNext() != null) {
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(null);

	}

}
