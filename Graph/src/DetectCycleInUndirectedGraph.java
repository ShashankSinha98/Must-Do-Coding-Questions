import java.util.*;


public class DetectCycleInUndirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public static boolean isCycleDFS(int V, ArrayList<ArrayList<Integer>> adj) {
		 boolean[] visited = new boolean[V+1];
		 Arrays.fill(visited, false);
		 
		 for(int vi=0; vi<V; vi++) {
			 if(!visited[vi]) {
				 boolean isCyclePresent = detectCycle(vi, adj, visited, -1);
				 if(isCyclePresent) return true;
			 }
		 }
		 return false;
	 }
	 
	 private static boolean detectCycle(int vi, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int parent) {
		 
		 visited[vi] = true;
		 
		 for(Integer ci: adj.get(vi)) {
			 if(!visited[ci]) {
				 boolean isCyclePresent = detectCycle(ci, adj, visited, vi);
				 if(isCyclePresent) return true;
				 
			 } else if(ci!=parent) return true;
		 }
		 return false;
	 }

	 
	 public static boolean isCycleBFS(int V, ArrayList<ArrayList<Integer>> adj) {
		 	
		 Queue<Node> queue = new LinkedList<>();
		 
		 boolean[] visited = new boolean[V+1];
		 Arrays.fill(visited, false);
		 
		 for(int i=0; i<V; i++) {
			 if(!visited[i]) {
				 queue.add(new Node(i, -1));
				 visited[i] = true;
				 
				 while(!queue.isEmpty()) {
					 
					 Node n = queue.poll();
					 
					 for(int ci: adj.get(n.data)) {
						 
						 if(!visited[ci]) {
							 queue.add(new Node(ci, n.data));
							 visited[ci] = true;
							 
						 } else {
							 if(ci!=n.parent) return true;
						 }
					 }
				 }
			 }
		 }
		 return false;
	 }
	 
	
}

class Node{
	 int data, parent;
	 
	 public Node(int data, int parent) {
		 this.data = data;
		 this.parent = parent;
	 }
}


