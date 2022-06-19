import java.util.*;
public class BuildHeapFromArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
		buildHeap(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	static void buildHeap(int[] arr, int n) {
		int startPos = (n/2)-1;
		
		for(int i=startPos;i>=0; i--) {
			heapify(arr,n,i);
		}
	}
	
	static void heapify(int[] arr, int n, int i) {
		
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && arr[l] > arr[largest]) largest = l;
		
		if(r<n && arr[r]>arr[largest]) largest = r;
		
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}

}
