
public class FormAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countMin("babba"));
		 
	}
	
	static int countMin(String str)
    {
		
        return str.length() - longestPalindromeSubsequence(str.toCharArray());
    }
	
	private static int longestPalindromeSubsequence(char[] s) {
		
		int n = s.length;
		int[][] dp = new int[n][n];
		
		for(int i=0; i<n; i++) dp[i][i] = 1;
		
		for(int i=0; i<n-1; i++) dp[i][i+1] = (s[i]==s[i+1])? 2:1;
		
		for(int g=2; g<n; g++) {
			
			for(int i=0; i<n-g; i++) {
				
				if(s[i]==s[i+g]) {
					dp[i][i+g] = 2 + dp[i+1][i+g-1];
				} else {
					dp[i][i+g] = Math.max(dp[i][i+g-1], dp[i+1][i+g]);
				}
			}
		}
		
		return dp[0][n-1];
	}
	
	

}
