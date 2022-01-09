
public class SpecialKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = optimalKeys(74);
		System.out.println(res);
	}
	
	static int optimalKeys(int N){
		
		if(N<7) return N;
		
		int[] dp = new int[N+1];
		for(int i=0; i<=6; i++) dp[i] = i;
	
		// we are finding optimal point from N-3 to 1, after which if we select, copy
		// and paste - we will get max length
		for(int cn=7; cn<=N; cn++) {
			for(int b=cn-3; b>=1; b--) {
				int x = dp[b] * (cn-b-1);
				
				if(x>dp[cn])
					dp[cn] = x;	
			}
		}
		
		return dp[N];
    }
	


}
