package abhay.datastructure.linklist;

public class LinkNode {
	private LinkNode next;
	private int data;

	public LinkNode getNext() {
		return next;
	}

	public void setNext(LinkNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkNode(LinkNode next, int data) {
		super();
		this.next = next;
		this.data = data;
	}

	@Override
	public String toString() {
		return "LinkNode [next=" + next + ", data=" + data + "]";
	}

}
