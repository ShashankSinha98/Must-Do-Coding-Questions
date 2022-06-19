// https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/submissions/
public class LengthOfLongestSubarrayWithPositiveProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] {-1,-2,-3,0,1};
		int ans = solve(A, A.length);
		System.out.println("Ans: "+ans);

	}
	
	static int solve(int[] A, int n) {
		int st=0, end=0;
		int res = 0;
		
		while(st<n && end<n) {
			
			while(end < n && A[end]!=0) end++;
			
			// got 1 sub array - count pos and neg nos
			int pos=0, neg=0;
			int i = st;
			while(i<end) {
				if(A[i]>0) pos++;
				else if(A[i]<0) neg++;
				i++;
			}
			
			
			if(neg%2==0) {
				res = Math.max(res, (pos+neg));
			} else {
				int total = pos + neg;
				// remove from left
				i = st;
				while(A[i]>0) {total--; i++;}
				
				res = Math.max(res, total-1);
				
				total = pos+neg;
				i = end-1;
				while(A[i]>0) {total--; i--;}
				
				res = Math.max(res, total-1);
			}
			
			st = end+1; end = st;
		}
		
		return res;
	}

}
