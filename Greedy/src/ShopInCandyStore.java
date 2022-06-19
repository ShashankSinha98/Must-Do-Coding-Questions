import java.util.*;
public class ShopInCandyStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candies = new int[] {3, 2, 1, 4};
		int K=2;
		List<Integer> res = candyStore(candies, candies.length, K);
		System.out.println(res.get(0)+", "+res.get(1));

	}
	
	static ArrayList<Integer> candyStore(int candies[],int N,int K){
     
		Arrays.sort(candies);
		ArrayList<Integer> res = new ArrayList<>();
		
		int cost = 0;
		int left = N;
		int i=0;
		
		while(i<N && left>0) {
			cost += candies[i];
			left -= (K+1);
			i++;
		}
		
		res.add(cost);
		
		cost=0; left=N; i=N-1;
		
		while(i>=0 && left>0) {
			cost += candies[i];
			left -= (K+1);
			i--;
		}
		
		res.add(cost);
		
		return res;
    }

}
