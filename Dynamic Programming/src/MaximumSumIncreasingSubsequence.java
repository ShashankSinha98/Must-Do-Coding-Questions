import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {1, 2, 3};
		int res = maxSumIS(arr, arr.length);
		System.out.println("res: "+res);
	}
	
	
	public static int maxSumIS(int arr[], int n)  {  
	    
		if(n==0) return 0;
		
		int[] T = new int[n];
	    T[0] = arr[0];
	    
	    int res = T[0];
	    
	    for(int i=1; i<n; i++) {
	    	for(int j=0; j<i; j++) {
	    		if(arr[j]<arr[i]) {
	    			T[i] = Math.max(T[i], T[j]);
	    		}
	    	}
	    	
	    	T[i]+=arr[i];
	    	res = Math.max(res, T[i]);
	    }
	    
	    //System.out.println(Arrays.toString(T));
	    
	    return res;
	}

}
