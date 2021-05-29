import java.util.Arrays;

public class ElementWithLeftSideSmallerAndRightsideGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new ElementWithLeftSideSmallerAndRightsideGreater()
				.findElement(new int[] {4, 2, 5, 7}, 4));
	}
	
	public int findElement(int arr[], int n){

		int[] left = new int[n];
		int[] right = new int[n];
		
		int maxTillNow = Integer.MIN_VALUE;

		for(int i=0; i <n; i++) {
			if(arr[i]>maxTillNow) maxTillNow = arr[i];
			
			left[i] = maxTillNow;
		}
		
		int minTillNow = Integer.MAX_VALUE;
		
		for(int i=n-1; i>=0; i--) {
			if(arr[i]<minTillNow) minTillNow = arr[i];
			
			right[i] = minTillNow;
		}
		
		System.out.println("L: "+Arrays.toString(left));
		System.out.println("R: "+Arrays.toString(right));
		
		for(int i=1; i<n-1; i++) {
			if(left[i]<=arr[i] && arr[i]<=right[i]) return arr[i];
		}
		
		return -1;
    }

}
