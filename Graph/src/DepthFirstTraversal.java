import java.util.*;
public class DepthFirstTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		ArrayList<Integer> zero = new ArrayList<>();
		zero.add(1);zero.add(2);zero.add(4);
		
		ArrayList<Integer> one = new ArrayList<>();
		ArrayList<Integer> two = new ArrayList<>();
		ArrayList<Integer> three = new ArrayList<>();
		ArrayList<Integer> four = new ArrayList<>();
		four.add(3);
		
		adj.add(zero);
		adj.add(one);
		adj.add(two);
		adj.add(three);
		adj.add(four);
		
		ArrayList<Integer> res = dfsOfGraph(5, adj);
		System.out.println("Res: "+res);
		
		
	}
	
	private static ArrayList<Integer> res;
	private static boolean[] visited;
	public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       res = new ArrayList<>();
       visited = new boolean[V+1];
       
       recursive(0, adj);
       
       return res;
    }
	
	private static void recursive(int vi, ArrayList<ArrayList<Integer>> adj) {
		res.add(vi);
		visited[vi] = true;
		
		for(int child: adj.get(vi)) {
			if(!visited[child])
				recursive(child, adj);
		}
	}

}
