public class CountNumberOfHops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long ans = countWays(100);
		System.out.println(ans);

	}
	
	static long countWays(int n)
    {
		if(n<=2) return n;
		if(n==3) return 4;
		
		long a=1, b=2, c=4;
		long res = 0L;
		int MOD = 1000000007;
		while(n-3!=0) {
			res = (a + b + c) % MOD;
			n--;
			a = b % MOD;
			b = c % MOD;
			c = res % MOD;
		}
		
		return res % MOD;
    }

}
