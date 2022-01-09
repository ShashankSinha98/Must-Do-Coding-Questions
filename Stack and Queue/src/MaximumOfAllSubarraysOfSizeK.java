import java.util.*;

public class MaximumOfAllSubarraysOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		max_of_subarrays(new int[] {1, 2, 3, 1, 4, 5, 2, 3, 6}, 9, 3);
	}
	
	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
		
		ArrayList<Integer> res = new ArrayList<>();
		
		Deque<Integer> dq = new LinkedList<>();
		
		for(int i=0; i<k; i++) {
			
			while(!dq.isEmpty() && arr[i]>arr[dq.getLast()]) 
				dq.removeLast();
			
			dq.addLast(i);				
		}
		
		res.add(arr[dq.getFirst()]);
		
		for(int i=k; i<n; i++) {
			
			
			while(!dq.isEmpty() && dq.getFirst()<=i-k) 
				dq.removeFirst();
			
			while(!dq.isEmpty() && arr[i]>arr[dq.getLast()])
				dq.removeLast();
			
			dq.addLast(i);
			
			res.add(arr[dq.getFirst()]);
		}
		
		return res;
        
    }

}
