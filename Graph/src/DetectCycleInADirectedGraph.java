import java.util.*;
public class DetectCycleInADirectedGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public static boolean isCyclicDFS(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V+1];
        boolean[] instack = new boolean[V+1];
        
        Arrays.fill(visited, false);
        Arrays.fill(instack, false);
        
        for(int vi=0; vi<V; vi++) {
        	if(!visited[vi]) {
        		boolean isCycle = detectCycle(vi, visited, instack, adj);
        		if(isCycle) return true;
        	}
        }
        
        return false;
    }
	
	private static boolean detectCycle(int vi, boolean[] visited, boolean[] instack, ArrayList<ArrayList<Integer>> adj) {
		visited[vi] = true;
		instack[vi] = true;
		
		for(int ci: adj.get(vi)) {
			
			if(!visited[ci]) {
				boolean isCycle = detectCycle(ci, visited, instack, adj);
				if(isCycle) return true;
			} else if(instack[ci]) {
				return true;
			}
		}
		
		instack[vi] = false;
		return false;
	}

	
	public static boolean isCyclicBFS(int V, ArrayList<ArrayList<Integer>> adj) {
		
		int[] indegree = new int[V];
		for(int i=0; i<V; i++) {
			for(int ci: adj.get(i)) indegree[ci]++;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		
		
		for(int i=0; i<V; i++) {
			if(indegree[i]==0) queue.add(i);
		}
		
		int explored = 0;
		while(!queue.isEmpty()) {
			
			int vi = queue.poll();
			explored++;
			
			for(int ci: adj.get(vi)) {
				indegree[ci]--;
				if(indegree[ci]==0) queue.add(ci);
			}
		}
		
		return explored==V;
	}
	
}
