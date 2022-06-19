
public class CoinChange {

	public static void main(String[] args) {
		
		int[] S = new int[] {2,5,3,6};
		int N = 10;
		int m = S.length;
		
		long ans = count(S, m, N);
		System.out.println("Ans: "+ans);

	}
	
	public static long countRecc(int S[], int m, int n) {
        
		if(n==0) return 1;
		
		if(m==0) return 0;
		
		if(S[m-1]<=n) {
			return countRecc(S, m, n-S[m-1]) + countRecc(S, m-1, n);
		} else {
			return countRecc(S, m-1, n);
		}
		
    }
	
	public static long count(int S[], int m, int n) {
        
		int[][] T = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) T[i][0] = 1;
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				
				if(S[i-1] <= j) {
					T[i][j] = T[i][j-S[i-1]] + T[i-1][j];
				} else {
					T[i][j] = T[i-1][j];
				}
			}
		}
		
		return T[m][n];
    }

}
