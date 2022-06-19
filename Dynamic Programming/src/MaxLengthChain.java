import java.util.*;
public class MaxLengthChain {

	public static void main(String[] args) {
		
		Pair p1 = new Pair(5, 24);
		Pair p2 = new Pair(39, 60);
		Pair p3 = new Pair(15, 28);
		Pair p4 = new Pair(27, 40);
		Pair p5 = new Pair(50, 90);
		Pair[] arr = new Pair[] {p1, p2, p3, p4, p5};
		
		
		int ans = maxChainLength(arr, arr.length); 
		System.out.println("Ans: "+ans);
	}
	
	static int maxChainLength(Pair arr[], int n) {
		
		if(n==0) return 0;
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new PairSortA());
		System.out.println(Arrays.toString(arr));
		int[] T = new int[n];
		T[0] = 1;
		int max = 1;
		
		for(int i=1; i<n; i++) {
			int ans = 0;
			for(int j=0; j<i; j++) {
				if(arr[j].y < arr[i].x && T[j]>ans)
					ans = T[j];
			}
			
			T[i] = ans + 1;
			
			if(max<T[i]) max = T[i];
		}
		
		return max;
    }
	
	
}

class PairSortA implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		
		return (o1.x<o2.x)?-1:1;
	}
	
}

class Pair {
	int x,y;
	
	public Pair(int a, int b) {
		x = a;
		y = b;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+" : "+y+") ";
	}
}
