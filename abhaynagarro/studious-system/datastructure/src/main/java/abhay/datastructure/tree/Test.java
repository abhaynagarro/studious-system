package abhay.datastructure.tree;

public class Test {

	public static void main(String[] args) {
		Node root = new Node(10);

		root.setLeft(new Node(11));
		root.setRight(new Node(12));
		root.getLeft().setLeft(new Node(13));
		root.getLeft().setRight(new Node(14));
		root.getRight().setLeft(new Node(15));
		root.getRight().setRight(new Node(16));
		BinaryTree tree = new BinaryTree(root);
		tree.printLevelOrderTraversasl();
	}
}
