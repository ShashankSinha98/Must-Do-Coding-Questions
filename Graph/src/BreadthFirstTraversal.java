import java.util.*;
public class BreadthFirstTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
		ArrayList<Integer> res = new ArrayList<>();
		boolean[] visited = new boolean[V+1];
		visited[0] = true;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		
		while(!queue.isEmpty()) {
			int data = queue.poll();
			res.add(data);
			
			ArrayList<Integer> childs = adj.get(data);
			for(int child: childs) {
				if(!visited[child]) {
				    queue.add(child);
		            visited[child] = true;		    
				}
			}
		}
		
		return res;
    }

}
