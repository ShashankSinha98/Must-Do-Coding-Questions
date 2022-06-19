import java.util.HashMap;

public class CountPairsWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 5, 7, 1};
		int x = 6;
		
		int ans = getPairsCount(arr, arr.length, x);
		System.out.println("Ans: "+ans);
	}
	
	static int getPairsCount(int[] arr, int n, int x) {
		
		int[] map = new int[2000006];
		
		int count = 0;
		for(int i=n-1; i>=0; i--) {
			int target = x - arr[i];
			
			if(target>0) count+= map[target];
			map[arr[i]]++;
		}

		return count;
    }

}
