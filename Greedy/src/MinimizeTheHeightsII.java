import java.util.*;
public class MinimizeTheHeightsII {

	public static void main(String[] args) {
		
		int[] arr = new int[] {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
		int n = arr.length;
		int k = 5;
		int ans = getMinDiff(arr, n, k);
		System.out.println("ans: "+ans);

	}
	
	static int getMinDiff(int[] arr, int n, int k) {
		
		Arrays.sort(arr);
		
		int diff = arr[n-1] - arr[0];
		
		for(int i=1; i<n; i++) {
			
			if(arr[i]-k<0) continue;
			
			int tempMin = Math.min(arr[i]-k, arr[0]+k);
			int tempMax = Math.max(arr[i-1]+k, arr[n-1]-k);
			
			diff = Math.min(diff, tempMax-tempMin);
		}
		
		return diff;
    }
	
	static int getMinDiff2(int[] arr, int n, int k) {
       
		Arrays.sort(arr);
		
		int diff = arr[n-1] - arr[0];
		
		for(int i=0; i<n-1; i++) {
			if(arr[i+1]-k>=0) {
				int min = Math.min(arr[i+1]-k, arr[0]+k);
				int max = Math.max(arr[i]+k, arr[n-1]-k);
				
				diff = Math.min(diff, max-min);
			}
		}
		
		return diff;
		
    }
}
