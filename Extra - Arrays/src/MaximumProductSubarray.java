
public class MaximumProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {6, -3, -10, 0, 2};
		long ans = new MaximumProductSubarray().maxProduct(arr, arr.length);
		System.out.println("Ans: "+ans);

	}
	
	long maxProduct(int[] arr, int n) {
		
		if(n==1) return arr[0];
		
        long max_ending_here = 1, min_ending_here = 1;
        long res = 1;
        
        for(int ai: arr) {
        	
        	if(ai > 0) {
        		max_ending_here = max_ending_here * ai;
        		min_ending_here = Math.min(1, min_ending_here*ai);
        	} else if(ai < 0) {
        		long temp = max_ending_here;
        		max_ending_here = Math.max(1, min_ending_here * ai);
        		min_ending_here = temp * ai;
        	} else {
        		max_ending_here = 1;
        		min_ending_here = 1;
        	}
        	
        	res = Math.max(max_ending_here, res);
        }
        
        return res;
    }

}
