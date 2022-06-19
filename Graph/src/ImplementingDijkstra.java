import java.util.*;

public class ImplementingDijkstra {

	public static void main(String[] args) {
		

	}
	
	static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
    
		Comparator<DNode> comparator = (dn1, dn2) -> dn1.dist - dn2.dist;
		PriorityQueue<DNode> minQueue = new PriorityQueue<>(comparator);
		
		int[] dist = new int[V];
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[S] = 0;
		minQueue.add(new DNode(0, S));
		
		while(!minQueue.isEmpty()) {
			DNode node = minQueue.poll();
			
			for(ArrayList<Integer> child: adj.get(node.value)) {
				int childValue = child.get(0);
				int childDist = child.get(1);
				
				if(node.dist+childDist <dist[childValue]) {
					dist[childValue] = node.dist + childDist;
					minQueue.add(new DNode(childDist+node.dist, childValue));
				}
			}
		}
	
		return dist;
	}

}

class DNode {
	int dist, value;
	
	public DNode(int dist, int value) {
		this.dist = dist;
		this.value = value;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(d: "+dist+", v: "+value+"), ";
	}
}
