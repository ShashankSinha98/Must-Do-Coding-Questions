import java.util.Arrays;

public class Sort {
	
	static void MergeSort(int[] arr) {
		
		MergeSort(arr, 0, arr.length-1);
	}
	
	private static void MergeSort(int[] arr, int l, int r) {
		
		if(l < r) {
			
			int mid = (l+r)/2;
			
			MergeSort(arr, l, mid);
			MergeSort(arr, mid+1, r);
			
			Merge(arr,l,mid,r);
		}
	}
	
	private static void Merge(int[] arr, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; i++) L[i] = arr[l+i];
		
		for(int i=0; i<n2; i++) R[i] = arr[m+i+1];
		
		int i=0, j=0, k=l;
		
		while(i<n1 && j<n2) {
			
			if(L[i]<=R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}
		
		while(i<n1) {
			arr[k++] = L[i++];
		}
		
		while(j<n2) {
			arr[k++] = R[j++];
		}
	}

	
	
	static void BubbleSort(int[] arr) {
		
		int len = arr.length;
		for(int i=0; i<len-1; i++) {
			for(int j=0; j<len-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}


	static void InsertionSort(int[] arr) {
		
		int len = arr.length;
		for(int i=1; i<len; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}


	static void QuickSort(int[] arr) {
		QuickSort(arr, 0, arr.length-1);
	}
	
	private static void QuickSort(int[] arr, int l, int r) {
		if(l<r) {
			
			int pi = partition(arr, l ,r);
			
			QuickSort(arr, l, pi-1);
			QuickSort(arr, pi+1, r);
		}
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
	
	private static void swap(int[] arr, int pos1, int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}


	public static void shuffle(int[] arr) {
		
		int len = arr.length;
		for(int i=len-1; i>=1; i--) {
			
			int min=0;
			int max=i-1;
			
			int ransPos = (int)((Math.random()) * (max-min) + min);
			swap(arr, i, ransPos);
		}
	}
	
	
	public void ShellSort(int[] arr) {

		int len = arr.length;
		int gap = (int) Math.ceil(len/2);
		
		while(gap!=0) {
			
			for(int i=0; i<len-gap; i++) {
				
				int j = i+gap;
				
				if(arr[i]>arr[j]) {
					swap(arr, i, j);
					
					// look for previous
					int t = i;
					while(t-gap>=0 && arr[t-gap]>arr[t]) {
						swap(arr, i, t);
						t = t-gap;
					}
					
				}
				
			}
			
			gap = (int)Math.ceil(gap/2);
		}
		
		
	}
}











