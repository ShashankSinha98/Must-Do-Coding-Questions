
public class SumOfMiddleElementsOfTwoSortedArrays {

	int findMidSum(int[] A1, int[] A2, int n) {
		
		int lo=0, hi=n;
		while(lo<=hi) {
			
			int cut1 = lo + (hi-lo)/2;
			int cut2 = n - cut1;
			
			// TODO - check if cut2 is out of bound for A2
			
			int l1 = (cut1==0)?Integer.MIN_VALUE : A1[cut1-1];
			int l2 = (cut2==0)?Integer.MIN_VALUE : A2[cut2-1];
			int r1 = (cut1==n)?Integer.MAX_VALUE : A1[cut1];
			int r2 = (cut2==n)?Integer.MAX_VALUE : A2[cut2];
			
			// l1 < r2 && l2 < r1
			if(l1 > r2) {
				hi = cut1-1;
			} else if(l2 > r1) {
				lo = cut1+1;
			} else {
				return (Math.max(l1, l2)+Math.min(r1, r2));
			}
		}
		
		return -1;
    }
}
