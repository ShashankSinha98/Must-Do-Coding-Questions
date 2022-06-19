import java.util.*;
public class KthLargestElementInAStream {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
		int k = 4;
		int[] ans = kthLargest(k, arr, arr.length);
		System.out.println("Ans: "+Arrays.toString(ans));
	}
	
	static PriorityQueue<Integer> pq = new PriorityQueue<>();
 	
	static int[] kthLargest(int k, int[] arr, int n) {
		int[] res = new int[n];
		int i=0;
		while(i<n) {
			
			if(i<k) 
				pq.add(arr[i]);
			else {
				if(arr[i]>pq.peek()) {
					pq.poll();
					pq.add(arr[i]);
				}
			}
			
			if(pq.size()<k) res[i] = -1;
			else res[i] = pq.peek();
			i++;
		}
		return res;
    }

}
