import java.util.Arrays;

public class MaximumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(maxIndexDiff(new int[] {7, 3, 1, 8, 9, 10, 4, 5, 6}, 8));
	}
	
	static int maxIndexDiff(int arr[], int n) { 
        
        int i=0,j=0;
        int ans = Integer.MIN_VALUE;
        int[] RMax = new int[n];
        
        int maxTillNow = Integer.MIN_VALUE;
        for(int idx=n-1; idx>=0; idx--) {
        	if(arr[idx]>maxTillNow) {
        		maxTillNow = arr[idx];
        	}
        	RMax[idx] = maxTillNow;
        }
        
        System.out.println(Arrays.toString(RMax));
        
        while (i<n && j<n) {
        	if(arr[i]<RMax[j]) j++;
        	else {
        		int res = j-1-i;
        		ans = Math.max(ans, res);
        		i++;
        	}
        }
        
        int res = j-1-i;
		ans = Math.max(ans, res);
		
        return ans;
    }

}
