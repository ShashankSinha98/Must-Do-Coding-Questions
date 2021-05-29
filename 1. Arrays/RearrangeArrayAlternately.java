import java.util.Arrays;

public class RearrangeArrayAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,5,6};
		
		rearrange(arr, 6);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void rearrange(int arr[], int n){
        
        int maxIdx = n-1;
        int minIdx = 0;
        
        int MAX = arr[maxIdx]+1;
        
        for(int i=0; i<n; i++) {
        	
        	if((i&1)==0) {
        		arr[i] = (arr[maxIdx] % MAX) * MAX + arr[i];
        		maxIdx--;
        	} else {
        		arr[i] = (arr[minIdx] % MAX) * MAX + arr[i];
        		minIdx++;
        	}
        }
    
        for(int i=0; i<n; i++) {
        	arr[i] /= MAX;
    	}
	}
	
	

}
