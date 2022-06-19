import java.util.*;
public class NumberOfProvinces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int numProvinces(ArrayList<ArrayList<Integer>> mat, int V) {
		
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0; i<V; i++) {
			adj.add(new ArrayList<>());
			for(int j=0; j<V; j++) {
				if(i!=j && mat.get(i).get(j)==1) {
					adj.get(i).add(j);
				}
			}
		}
		
		for(ArrayList<Integer> ai: adj) {
			System.out.println(adj);
		}
        
		boolean[] visited = new boolean[V];
		Arrays.fill(visited, false);
		
		int count = 0;
		
		for(int i=0; i<V; i++) {
			if(!visited[i]) {
				count++;
				
				dfs(adj, i, visited); 
			}
		}
		
		return count;
    }
	
	private static void dfs(ArrayList<ArrayList<Integer>> adj, int vi, boolean[] visited) {
		visited[vi] = true;
		
		for(int ci: adj.get(vi)) {
			if(!visited[ci]) {
				dfs(adj, ci, visited);
			}
		}
	}

}
