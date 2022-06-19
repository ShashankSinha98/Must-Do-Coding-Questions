
public class KthElementOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public long kthElement(int A1[], int A2[], int n, int m, int k) {
	       
		 int lo=0, hi=n;
		 while(lo<=hi) {
			 
			 int cut1 = lo + (hi-lo)/2;
			 int cut2 = k - cut1;
			 
			 if(cut2<0) {
				 hi = cut1-1;
				 continue;
			 }
			 
			 if(cut2>m) {
				 lo = cut1+1;
				 continue;
			 }
			 
			 int l1 = (cut1==0)? Integer.MIN_VALUE : A1[cut1-1];
			 int l2 = (cut2==0)? Integer.MIN_VALUE : A2[cut2-1];
			 int r1 = (cut1==n)? Integer.MAX_VALUE : A1[cut1];
			 int r2 = (cut2==m)? Integer.MAX_VALUE : A2[cut2];

			// l1 < r2 && l2 < r1
			if(l1 > r2) {
				hi = cut1-1;
			} else if(l2 > r1) {
				lo = cut1 + 1;
			} else {
				return Math.max(l1, l2);
			}
		 }
		 return -1;
	 }

}
