
public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int longestCommonSubstr(String S1, String S2, int n, int m){
		
		int res = 0;
		int[][] T = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				
				if(S1.charAt(i-1)==S2.charAt(j-1)) {
					T[i][j] = T[i-1][j-1]+1;
					res = Math.max(res, T[i][j]);
				} else {
					T[i][j] = 0;
				}
			}
		}
		
		return res;
		
    }

}
