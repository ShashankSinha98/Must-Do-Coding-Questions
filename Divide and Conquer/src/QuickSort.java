import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {4, 1, 3, 9, 7};
		
		QuickSort.Solution.quickSort(arr, 0, arr.length-1);
		
		System.out.println("Arr: "+Arrays.toString(arr));

	}

	static class Solution
	{
	    
	    static void quickSort(int arr[], int low, int high)
	    {	
	        if(low>=high) return;
	        
	        int p = randomPartition(arr, low, high);
	        quickSort(arr, low, p-1);
	        quickSort(arr, p+1, high);
	    }
	    
	    
	    static int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[high];
	        int i=low-1;
	        int j=low;
	        
	        while(j<high) {
	        	if(arr[j]<=pivot) {
	        		i++;
	        		swap(arr, i, j);
	        	}
	        	j++;
	        }
	        
	        swap(arr, i+1, high);
	        return i+1;
	    }
	    
	    static int randomPartition(int arr[], int low, int high)
	    {
	    	int pivotIdx = (int) ((Math.random() * (high-low)) + low);
	        swap(arr, high, pivotIdx);
	        
	        int pivot = arr[high];
	        int i=low-1;
	        int j=low;
	        
	        while(j<high) {
	        	
	        	if(arr[j]<=pivot) {
	        		i++;
	        		swap(arr, i, j);
	        	}
	        	j++;
	        }
	        
	        
	        swap(arr, i+1, high);
	        return i+1;
	    }
	    
	    private static void swap(int[] arr, int i1, int i2) {
	    	int temp = arr[i1];
	    	arr[i1] = arr[i2];
	    	arr[i2] = temp;
	    }
	}
}

