import java.util.*;
public class CountInversions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] arr = new long[] {5,4,3,2,1};
		int count = inversionCount(arr, arr.length);
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("count: "+count);

		
	}
	
	static int count;
	static int inversionCount(long[] arr, long n) {
		count = 0;
		inversionMergeSort(arr, 0, (int)n-1);
		return count;
	}
	
	private static void inversionMergeSort(long[] arr, int l, int r) {
		if(l>=r) return;
		
		int mid = l + (r-l)/2;
		inversionMergeSort(arr, l, mid);
		inversionMergeSort(arr, mid+1, r);
		merge(arr, l, mid, r);
	}
	
	private static void merge(long[] arr, int l, int mid, int r) {
		int n = r-l+1;
		long[] T = new long[n];
		int i=l, j=mid+1;
		int k=0;
		int n1 = mid, n2 = r;
		
		while(i<=n1 && j<=n2) {
			if(arr[i]<=arr[j]) {
				T[k++] = arr[i++];
			} else {
				count += (n1-i+1);
				T[k++] = arr[j++];
			}
		}
		
		while(i<=n1) {
			T[k++] = arr[i++];
		}
		
		while(j<=n2) {
			T[k++] = arr[j++];
		}
		
		for(k=l; k<=r; k++) {
			arr[k] = T[k-l];
		}
	}
}
