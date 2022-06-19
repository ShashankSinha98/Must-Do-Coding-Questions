
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

    public double findMedianSortedArrays(int[] A1, int[] A2) {
		
		int n1 = A1.length;
		int n2 = A2.length;
		
		int lo=0, hi=n1;
		
		while(lo<=hi) {
			
			int cut1 = lo + (hi-lo)/2;
			int cut2 = (n1+n2)/2 - cut1;
			
			// checking if cut 2 is out of bounds for A2
            if(cut2>n2) {
                lo = cut1+1;
                continue;
            }
            
            if(cut2<0) {
                hi = cut1-1;
                continue;
            }
            
			int l1 = (cut1==0)? Integer.MIN_VALUE : A1[cut1-1];
			int l2 = (cut2==0)? Integer.MIN_VALUE : A2[cut2-1];
			int r1 = (cut1==n1)? Integer.MAX_VALUE : A1[cut1];
			int r2 = (cut2==n2)? Integer.MAX_VALUE : A2[cut2];
			
			// l1 < r2 && l2 < r1
			if(l1 > r2) {
				hi = cut1-1;
			} else if(l2 > r1) {
				lo = cut1 + 1;
			} else {
				if(((n1+n2)&1)==0) { // even
					return ((Math.max(l1, l2) + Math.min(r1, r2))*1.0)/2;
				} else return (Math.min(r1, r2)*1.0);
			}
		}
		
		return -1;
    }
}
