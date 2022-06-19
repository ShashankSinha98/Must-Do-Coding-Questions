import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5,4,3,2,1};
		new HeapSort().heapSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}
	
	 void buildHeap(int arr[], int n) {
		 int startPos = n/2-1;
		 for(int i=startPos; i>=0; i--) {
			 heapify(arr, n, i);
		 }
	 }
 
    void heapify(int arr[], int n, int i) {
    	
    	int largest = i;
    	int l = 2*i+1;
    	int r = 2*i+2;
    	
    	if(l<n && arr[l]>arr[largest]) largest = l;
    	if(r<n && arr[r]>arr[largest]) largest = r;
    	
    	if(largest!=i) {
    		int temp = arr[i];
    		arr[i] = arr[largest];
    		arr[largest] = temp;
    		
    		heapify(arr, n, largest);
    	}
    }
    
    public void heapSort(int arr[], int n) {
    	buildHeap(arr, n);
    	
    	for(int i=n-1; i>=1; i--) {
    		int temp = arr[0];
    		arr[0] = arr[i];
    		arr[i] = temp;
    		
    		heapify(arr, i, 0);
    	}
    }

}
