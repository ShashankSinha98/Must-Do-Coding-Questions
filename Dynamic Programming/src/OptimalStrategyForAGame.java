import java.util.Arrays;

public class OptimalStrategyForAGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {8,15,3,7};
		System.out.println("Ans: "+countMaximum(arr, arr.length));
	}
	
	
	static int[][] T;
	static long countMaximum(int arr[], int n) {
        T = new int[n+1][n+1];
        for(int[] ti: T) Arrays.fill(ti, -1);;
        
		return solve(arr, 0, n-1);
    }
	
	private static int solve(int[] arr, int i, int j) {
		
		if(i>j) return 0;
		if(T[i][j]!=-1) return T[i][j];
		
		int left = arr[i] + Math.min(solve(arr, i+2, j), solve(arr, i+1, j-1));
		int right = arr[j] + Math.min(solve(arr, i+1, j-1), solve(arr, i, j-2));
		
		return T[i][j] = Math.max(left, right);
	}

}
