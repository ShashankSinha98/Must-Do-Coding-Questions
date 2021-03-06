import java.util.Arrays;

public class MinimizeTheHeightsI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int getMinDiff(int[] arr, int n, int k) {
		Arrays.sort(arr);
		
		int diff = arr[n-1] - arr[0];
		
		for(int i=1; i<n; i++) {
			int tempMin = Math.min(arr[i]-k, arr[0]+k);
			int tempMax = Math.max(arr[i-1]+k, arr[n-1]-k);
			
			diff = Math.min(diff, Math.abs(tempMax-tempMin));
		}
		
		return diff;
    }

}
