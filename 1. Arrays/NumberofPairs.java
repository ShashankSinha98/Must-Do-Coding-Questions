import java.util.Arrays;

public class NumberofPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countPairs(new int[] {2,1,6}, new int[]{1,5},3,2));
		System.out.println(countPairs(new int[] {2,3,4,5}, new int[]{1,2,3},4,3));
		
	}
	
	static long countPairs(int x[], int y[], int M, int N)
    {
        long count = 0;
        
        int zeros=0, ones = 0, twos = 0;
        
        for(int yi: y) {
        	if(yi==0) zeros++;
        	if(yi==1) ones++;
        	if(yi==2) twos++;
        }
        
        Arrays.sort(y);
        
        for(int xi: x) {
        	
        	if(xi==0) continue;
        	else if(xi==1) count+=zeros;
        	else if(xi==2) {
        		int idx = getIndex(y, 5);
        		int inc = (idx==-1)? 0: N-idx;
        		
        		count += (zeros+ones+inc);
        	} else if(xi==3){
        		int idx = getIndex(y, xi+1);
        		int inc = (idx==-1)? 0: N-idx;
        		
        		count += (zeros+ones+twos+inc);
        	} else {
        		int idx = getIndex(y, xi+1);
        		int inc = (idx==-1)? 0: N-idx;
        		
        		count += (zeros+ones+inc);
        	}
        	
        }
        
        return count;
        
    }
	
	static int getIndex(int[] arr, int target) {
		int len = arr.length;
		int l = 0, r = len-1;
		
		int possibleAns = -1;
		
		while(l<=r) {
			
			int mid = (l+r)/2;
			
			if(arr[mid]<target) {
				l = mid+1;
			} else {
				possibleAns = mid;
				r = mid-1;
			}
			
		}
		
		return possibleAns;
	}

}
