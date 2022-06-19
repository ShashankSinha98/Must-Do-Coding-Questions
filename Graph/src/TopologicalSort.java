import java.util.*;
public class TopologicalSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static boolean[] visited;
	private static Stack<Integer> stack;
	static int[] topoSortDFS(int V, ArrayList<ArrayList<Integer>> adj) {
		
		visited = new boolean[V+1];
		Arrays.fill(visited, false);
		
		stack = new Stack<>();
		
		for(int vi=0; vi<V; vi++) {
			if(!visited[vi]) {
				dfs(vi, adj);
			}
		}
		
		int[] res = new int[V];
		int i=0;
		while(!stack.isEmpty()) {
			res[i++] = stack.pop();
		}
		
		return res;
    }
	
	private static void dfs(int vi, ArrayList<ArrayList<Integer>> adj) {
		visited[vi] = true;
		
		for(int ci: adj.get(vi)) {
			if(!visited[ci]) dfs(ci, adj);
		}
		
		stack.push(vi);
	}

	
	static int[] topoSortBFS(int V, ArrayList<ArrayList<Integer>> adj) {
		int[] indegree = new int[V];
		for(int i=0; i<V; i++) {
			for(int ci: adj.get(i)) {
				indegree[ci]++;
			}
		}
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<V; i++) {
			if(indegree[i]==0) queue.add(i);
		}
		
		int[] res = new int[V];
		int i=0;
		
		while(!queue.isEmpty()) {
			int vi = queue.poll();
			res[i++] = vi;
			
			for(int ci: adj.get(vi)) {
				indegree[ci]--;
				if(indegree[ci]==0) queue.add(ci);
			}
		}
		
		return res;
	}
}
