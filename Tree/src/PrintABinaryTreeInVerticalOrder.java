import java.util.*;

public class PrintABinaryTreeInVerticalOrder {

	static int max, min;
	
	static class Pair {
		int value, depth;
		
		public Pair(int v, int d) {
			value = v;
			depth = d;
		}
	}
	
	static ArrayList<Integer> verticalOrder(Node root)
    {
        HashMap<Integer, ArrayList<Pair>> map = new HashMap<>();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        
        getVerticalOrder(root, 0, 0, map);
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=min; i<=max; i++) {
        	ArrayList<Pair> arr = map.get(i);
        	Collections.sort(arr, new CustomSort());
        	
        	for(Pair p: arr) {
        		res.add(p.value);
        	}
        }
        
        
        return res;
    }
	
	static class CustomSort implements Comparator<Pair> {

		@Override
		public int compare(Pair o1, Pair o2) {
			
			return o1.depth-o2.depth;
		}
		
	}
	
	static void getVerticalOrder(Node root, int dist, int depth, HashMap<Integer, ArrayList<Pair>> map) {
		
		if(root==null) return;
		
		
		ArrayList<Pair> arr;
		if(map.containsKey(dist)) {
			arr = map.get(dist);
		} else {
			arr = new ArrayList<>();
		}
		
		arr.add(new Pair(root.data, depth));
		map.put(dist, arr);
		
		if(dist>max) max = dist;
		if(dist<min) min = dist;
		
		getVerticalOrder(root.left, dist-1, depth+1, map);
		getVerticalOrder(root.right, dist+1, depth+1, map);
		
	}
}
