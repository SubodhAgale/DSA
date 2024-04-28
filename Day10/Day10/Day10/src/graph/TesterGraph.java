package graph;

public class TesterGraph {
	public static void main(String[] args) {
		Graph g=new Graph(5);	
		g.init();
		g.printMatrix();
		System.out.print("\n BFS  -");
		g.bfs(0);
		System.out.print("\n DFS  -");
		g.dfs(0);
	}
}
