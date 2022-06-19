import java.util.*;

public class MinimumNumberOfCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ans = minPartition(11);
		System.out.println("Ans: "+ans);
	}
	
	
	private static int[] coins;
	private static List<Integer> res;
	
	static {
		coins = new int[] {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
	}
	
	static List<Integer> minPartition(int N) {
		res = new ArrayList<>();
		
		int i = coins.length;
		while(i>0) {
			if(coins[i-1]<=N) {
				res.add(coins[i-1]);
				N = N-coins[i-1];
			} else {
				i--;
			}
		}
		
		return res;
    }
	
}
