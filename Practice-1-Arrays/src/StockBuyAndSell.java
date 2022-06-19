import java.util.*;
public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {10,20,15,17,11,20};
		ArrayList<ArrayList<Integer>> res = stockBuySell(A, A.length);
		System.out.println("Res: "+res);
	}
	
	
	static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int buy=0, sell=-1;
		int i=0, j=1;
		
		while(j<n) {
			if(A[j-1]<A[j]) {
				sell = j;
				j++;
			} else {
				if(sell!=-1) {
					res.add(new ArrayList<>(Arrays.asList(buy, sell)));
				}
				sell = -1;
				buy = j;
				j++;
			}
		}
		
		if(sell!=-1) {
			res.add(new ArrayList<>(Arrays.asList(buy, sell)));
		}
		
		return res;
		
    }

}
