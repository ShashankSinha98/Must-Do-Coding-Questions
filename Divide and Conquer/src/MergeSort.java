import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5,4,3,2,1};
		
		new Solution().mergeSort(arr, 0, arr.length-1);
		System.out.println("arr: "+Arrays.toString(arr));
	}

}

class Solution
{
    private void merge(int arr[], int l, int m, int r)
    {
         int tempLen = r-l+1;
         int[] T = new int[tempLen];
         int i=l, j=m+1, k=0;
         int lim1=m, lim2=r;
         
         while(i<=lim1 && j<=lim2) {
        	 
        	 if(arr[i]<=arr[j]) T[k++] = arr[i++];
        	 else T[k++] = arr[j++];
         }
         
         while(i<=lim1) {
        	 T[k++] = arr[i++];
         }
         
         while(j<=lim2) {
        	 T[k++] = arr[j++];
         }
         
         // copy data to original array
         for(i=l; i<=r; i++) {
        	 arr[i] = T[i-l];
         }
    }
 
    
    void mergeSort(int arr[], int l, int r)
    {
        if(l>=r) return;
        
        int mid = l + (r-l)/2;
        
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        
        merge(arr, l, mid, r);
    }
}
