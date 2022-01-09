
public class KadanesAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = new KadanesAlgo().maxSubarraySum(new int[] {1,2,3,-2,5}, 5);
		System.out.println(ans);
	}
	
	int maxSubarraySum(int arr[], int n){
        
        int currSum=0, maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
        	currSum += arr[i];
        	
        	if(currSum > maxSum) maxSum = currSum;
        	
        	if(currSum<0) 
        		currSum = 0;
        	
        }
        
        return maxSum;
    }

}
