import java.util.Arrays;

public class KthSmallestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(kthSmallest(new int[] {7, 10, 4, 3, 20, 15}, 0, 6, 3));
		
		
	}
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
		shuffle(arr);
		return QuickSort(arr, 0, arr.length-1, k-1);
    } 
	
	private static int QuickSort(int[] arr, int l, int r, int k) {
	
		if(l<r) {
			
			int pi = partition(arr, l, r);
			System.out.println(pi);
			if(pi==k) return arr[pi];
			
			else if(pi<k) return QuickSort(arr, pi+1, r, k);
			else return QuickSort(arr, l, pi-1, k);
		} 
		
		else if(l==r && l==k) 
		{ return arr[k];}
		else 
			return -1;
	}
	
	private static int partition(int[] arr, int l, int r) {
		
		int pivot = arr[r];
		int leftEnd = l-1;
		
		for(int curr=l; curr<r; curr++) {
			if(arr[curr]<pivot) {
				leftEnd++;
				swap(arr, leftEnd, curr);
			}
		}
		
		swap(arr, leftEnd+1, r);
		return leftEnd+1;
	}
	
	private static void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
	}

	
	private static void shuffle(int[] arr) {
		int len = arr.length;
		for(int i=len-1; i>=1; i--) {
			int min = 0;
			int max = i-1;
			
			int randPos = (int)(Math.random()*(max-min)+min);
			
			swap(arr, i, randPos);
		}
	}
}
