import java.util.*;

public class FindMissingAndRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
	
		int[] ans = new FindMissingAndRepeating().findTwoElement(arr, n);
		System.out.println(Arrays.toString(ans));
	}
	
	int[] findTwoElement(int arr[], int n) {
        
		int res = 0;
		for(int i=1; i<=n; i++) {
			res ^= i;
			res ^= arr[i-1];
		}
		// System.out.println(res);
		int pos = 0;
		int temp = res;
		while(temp!=0) {
			if((temp&1)==1) break;
			
			pos++;
			temp = temp>>1;
		}
		
		// System.out.println("pos: "+pos);
		
		int A = 0; // 1
		int B = 0; // 0
		
		for(int i=1; i<=n; i++) {
			if(((i&(1<<pos))>0)) 
				A ^= i;
			 else 
				B ^= i;
			
			
			if((arr[i-1]&(1<<pos))>0) 
				A ^= arr[i-1];
			else 
				B ^= arr[i-1];	
		}
		
		int missing = !contains(arr, A) ? A: B;
		int repeating = (missing==A) ? B : A;
		
		// System.out.println("A: "+A+", B: "+B);
		
		return new int[] {repeating, missing};
    }
	
	private boolean contains(int[] arr, int x) {
		for(int xi: arr) {
			if(xi==x) return true;
		}
		return false;
	}
	
	

}
