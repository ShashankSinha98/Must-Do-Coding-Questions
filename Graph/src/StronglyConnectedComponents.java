import java.util.*;
public class StronglyConnectedComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
    	int[] topologicalOrder = topologicalSort(V, adj);
    	
    	ArrayList<ArrayList<Integer>> transposeAdj = transpose(V, adj);
    	
    	int count = 0;
    	boolean[] visited = new boolean[V];
    	Arrays.fill(visited, false);
    	
    	for(int i=0; i<V; i++) {
    		
    		int vi = topologicalOrder[i];
    		
    		if(!visited[vi]) {
    			count++;
    			performDFS(vi, transposeAdj, visited);
    		}
    	}
    	
    	return count;
    }

    // Topological Sort
    
    private static int[] topologicalSort(int V, ArrayList<ArrayList<Integer>> adj) {
    	
    	Stack<Integer> stack = new Stack<>();
    	boolean[] visited = new boolean[V];
    	Arrays.fill(visited, false);
    	
    	for(int i=0; i<V; i++) {
    		if(!visited[i]) {
    			performDFS(i, adj, visited, stack);
    		}
    	}
    	
    	int[] res = new int[V];
    	int idx=0;
    	while(!stack.isEmpty()) {
    		res[idx++] = stack.pop();
    	}
    	
    	return res;
    }
    
    private static void performDFS(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> stack) {
    	
    	visited[i] = true;
    	
    	for(int ci: adj.get(i)) {
    		if(!visited[ci]) performDFS(ci, adj, visited, stack);
    	}
    	
    	stack.add(i);
    }


    private static void performDFS(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
    	
    	visited[i] = true;
    	
    	for(int ci: adj.get(i)) {
    		if(!visited[ci]) performDFS(ci, adj, visited);
    	}
    }



    // Transpose
    private static ArrayList<ArrayList<Integer>> transpose(int V, ArrayList<ArrayList<Integer>> adj) {
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	
    	for(int i=0; i<V; i++) {
    		res.add(new ArrayList<Integer>());
    	}
    	
    	for(int i=0; i<V; i++) {
    		for(int ci: adj.get(i)) {
    			res.get(ci).add(i);
    		}
    	}
    	
    	return res;
    }
    
}
