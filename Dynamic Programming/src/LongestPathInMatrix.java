import java.util.*;
public class LongestPathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
static int[][] T;
	
	static int longestIncreasingPath(int[][] mat) {
		
		int res = 1;
		int n = mat.length;
		int m = mat[0].length;
		T = new int[n+1][m+1];
		for(int[] ti: T) Arrays.fill(ti, -1);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int ans = solve(i, j, mat, n, m) + 1;
				res = Math.max(res, ans);
			}
		}
		
		return res;
	}
	
	private static int solve(int i, int j, int[][] mat, int n, int m) {
		
		// Base case - Out of matrix
		if(i<0 || j<0 ||  i>=n || j>=m) return 0;
		
		if(T[i][j]!=-1) return T[i][j];
		
		int left=0, right=0, top=0, bottom=0;
		
		// check left
		if(j>0 && mat[i][j-1]-mat[i][j]>0) left = 1 + solve(i, j-1, mat, n, m);
		
		// check right
		if(j<m-1 && mat[i][j+1]-mat[i][j]>0) right = 1 + solve(i, j+1, mat, n, m);
		
		// check top
		if(i>0 && mat[i-1][j]-mat[i][j]>0) top = 1 + solve(i-1, j, mat, n, m);
		
		// check bottom
		if(i<n-1 && mat[i+1][j]-mat[i][j]>0) bottom = 1 + solve(i+1, j, mat, n, m);
		
		return T[i][j] = Math.max(left, Math.max(right, Math.max(top, bottom)));
	}

}
