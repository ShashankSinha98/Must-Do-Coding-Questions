import java.util.Arrays;

public class CountTheTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = new CountTheTriplets().countTriplet(new int[] {2,3,4}, 3);
		System.out.println(ans);
	}
	
	int countTriplet(int arr[], int n) {
        // code here
		
		Arrays.sort(arr);
		
		int count = 0;
		
		for(int i=n-1; i>=2; i--) {	
			int l=0, r=i-1, sum=0;

			while(l<r) {
				
				sum = arr[l] + arr[r];
				
				if(sum<arr[i]) l++;
				else if(sum>arr[i]) r--;
				else {
					count++;
					l++;
					r--;
				}
			}
			
		}
		
		return count;
	}

}
