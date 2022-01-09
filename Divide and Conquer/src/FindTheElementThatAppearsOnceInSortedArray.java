
public class FindTheElementThatAppearsOnceInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,1,2};
		int res = findOnce(arr, arr.length);
		System.out.println("res: "+res);

	}
	
	static int findOnce(int arr[], int n) {
     
		int l=0, r=n-1;
		int m = 0;
		while(l<r) {
			m = (l+r)/2;
			
			if((m&1)==0) { // even position
				
				if(arr[m]==arr[m+1]) {
					l = m+2;
				} else {
					r = m;
				}
				
			} else { // odd position
				
				if(arr[m]==arr[m-1]) {
					l = m+1;
				} else {
					r = m-1;
				}
			}
		}
    
		return arr[l];
	}

}
