package abhay.datastructure.bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {

	private int vertices;
	private List<Integer> adj[];

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int virtices) {
		this.vertices = virtices;
	}

	public List<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(List<Integer>[] adj) {
		this.adj = adj;
	}

	public Graph(int virtices) {
		super();
		this.vertices = virtices;
		adj = new LinkedList[vertices];
		for (int i = 0; i < virtices; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int i, int j) {
		adj[i].add(j);
	}

	public void bfs(int i) {
		boolean[] visited = new boolean[vertices];
		Queue<List<Integer>> bfsQueue = new LinkedList<List<Integer>>();
		System.out.println(i);
		visited[i] = true;
		bfsQueue.add(adj[i]);
		while (!bfsQueue.isEmpty()) {
			Iterator<Integer> itr = bfsQueue.poll().iterator();
			while (itr.hasNext()) {
				Integer j = itr.next();
				if (!visited[j]) {
					System.out.println(j);
					visited[j] = true;
					bfsQueue.add(adj[j]);
				}
			}
		}

	}

	public static void main(String args[]) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.bfs(2);
	}

}
