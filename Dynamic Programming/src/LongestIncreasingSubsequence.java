import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {0,8,4,12,2,10,6,14,1,9,5, 13,3,11,7,15};
		int ans = longestSubsequence(arr.length, arr);
		
		System.out.println("Ans: "+ans);
	}
	
	//Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int arr[]) {
        
    	if(size==0) return 0;
    	
    	int[] T = new int[size];
    	T[0] = 1;
    	int max = 1;
    	
    	for(int i=1; i<size; i++) {
    		int ans=0;
    		for(int j=0; j<i; j++) {
    			if(arr[j] < arr[i] && T[j]>ans) 
    				ans = T[j];
    		}
    		T[i] = ans + 1;
    		
    		if(T[i]>max) max = T[i];
    	}
    	
    	return max;
    }

}
