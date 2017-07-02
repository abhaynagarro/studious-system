package abhay.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void printLevelOrderTraversasl() {

		Queue<Node> queue = new LinkedList<Node>();
		Node currentNode = null;
		queue.add(root);
		while (!queue.isEmpty()) {
			currentNode = queue.poll();
			System.out.println(currentNode.getData());
			if (currentNode.getLeft() != null) {
				queue.add(currentNode.getLeft());
			}
			if (currentNode.getRight() != null) {
				queue.add(currentNode.getRight());
			}
		}

	}
}
