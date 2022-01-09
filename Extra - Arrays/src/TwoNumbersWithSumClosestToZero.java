import java.util.Arrays;

public class TwoNumbersWithSumClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(closestToZero(new int[] {-8,-66,-60}, 3));
	}
	
	public static int closestToZero(int arr[], int n)
    {
        Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
        
        
		int l, r, minSum;
        l=0; r=n-1; minSum=Integer.MAX_VALUE;
        
        while(l<r) {
        	int _sum = arr[l] + arr[r];
        	if(Math.abs(_sum)<Math.abs(minSum)) { minSum = _sum;}
        	else if(Math.abs(_sum)==Math.abs(minSum) && _sum>0) {minSum = _sum;}
        	
        	if(_sum>0) r--; else l++;
        }
        
        return minSum;
    }

}
