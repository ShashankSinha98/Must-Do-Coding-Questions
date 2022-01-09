import java.util.Arrays;

public class CountInversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] arr = new long[] {5,4,3,2,1};
		System.out.println(inversionCount(arr, 5));

	}
	
	static long inversions;
	
	static long inversionCount(long arr[], long N)
    {
		inversions = 0;
        mergeSort(arr, 0, arr.length-1);
        return inversions;
    }
	
	private static void mergeSort(long[] arr, int l, int r) {
		
		if(l < r) {
			
			int mid = (l+r)/2;
			
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
		}
	}
	
	private static void merge(long[] arr, int l, int m, int r) {
		
		int l1 = m-l+1;
		int l2 = r-m;
		
		long[] L = new long[l1];
		long[] R = new long[l2];
		
		for(int i=0; i<l1; i++) L[i] = arr[l+i];
		
		for(int i=0; i<l2; i++) R[i] = arr[m+i+1];
		
		int i=0, j=0, k=l;
		
		while(i<l1 && j<l2) {
			
			if(L[i]<=R[j]) 
				arr[k++] = L[i++];
			 else {
				 inversions += (l1-i);
				arr[k++] = R[j++];
			 }
		}
		
		while(i<l1) arr[k++] = L[i++];
		
		while(j<l2) arr[k++] = R[j++];
		
	}
	
	

}
