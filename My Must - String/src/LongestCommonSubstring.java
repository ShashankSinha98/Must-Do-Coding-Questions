
public class LongestCommonSubstring {
	
	public static void main(String[] args) {
		String S1 = "ABCDGH", S2 = "ACDGHR";
		
		int res = longestCommonSubstr(S1, S2, S1.length(), S2.length());
		System.out.println("res: "+res);
	}
	
	static int maxLength;
	static int T[][];
	static int LIM = 7;
	
	static int longestCommonSubstr(String S1, String S2, int n, int m) {
		maxLength = Integer.MIN_VALUE;
		
		T = new int[LIM][LIM];
		
		return lcs(S1, S2, S1.length(), S2.length());
		
    }
	
	static int lcs(String S1, String S2, int n, int m) {
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				
				if(S1.charAt(i-1)==S2.charAt(j-1)) {
					T[i][j] = T[i-1][j-1] + 1;
					if(T[i][j]>maxLength) maxLength = T[i][j];
				
				} else {
					T[i][j] = 0;
				}
				
			}
		}
		
		return maxLength;
    }
	
	static void display(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
	}
}
