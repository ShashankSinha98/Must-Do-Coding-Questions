import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(leaders(new int[] {1,2,3,4,0}, 5));

	}
	
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
		
		ArrayList<Integer> res = new ArrayList<>();
		int maxTillNow = arr[n-1];
		res.add(arr[n-1]);
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i]>=maxTillNow) {
				maxTillNow = arr[i];
				res.add(arr[i]);
			}
		}
		
		Collections.reverse(res);
		
		return res; 
		
    }

}
