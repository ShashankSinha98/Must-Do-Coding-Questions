import java.util.Arrays;

public class SmallestPositiveMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ans = missingNumber(new int[] {0,-10,1,3,-20}, 5);
		System.out.println(ans);
	}
	
	static int missingNumber(int arr[], int size)
    {
        for(int i=0; i<size; i++) {
        	
        	while(arr[i]>=1 && arr[i]<=size && arr[i]!=arr[arr[i]-1]) {
        		int temp = arr[arr[i]-1];
        		arr[arr[i]-1] = arr[i];
        		arr[i] = temp;
        	}
        }
        
        for(int i=0; i<size; i++) {
        	if(arr[i]!=i+1) return i+1;
        }
        
        return size+1;
    }

}
