
public class SearchInARotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] {3, 5, 1, 2};
		int key = 2;
		int ans = new SearchInARotatedArray().search(A, 0, A.length-1, key);
		System.out.println("Ans: "+ans);

	}
	
	int search(int A[], int l, int r, int key)
    {
        while(l<=r) {
        	int m = (l+r)/2;
        	
        	if(A[m]==key) return m;
        	
        	if(A[l]<A[m]) { // left is sorted
        		
        		
        		if(A[l]<=key && key<=A[m]) { // key definitely may lie in left
        			r = m-1;
        		} else {
        			l = m+1;
        		}
        	} else { // right is sorted
        		if(A[m]<=key && key<=A[r]) { // key definitely may lie in right
        			l = m+1;
        		} else {
        			r = m-1;
        		}
        	}
        }
        
        return -1;
    }

}
