import java.util.*;

public class StockBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new StockBuyAndSell().stockBuySell(new int[] {10,20,15,30,1,75,65,55,45,53,54}, 11));
	}
	
	
    public ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
    	
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    	int i=0, j=1, bestSellDay=-1, bestPurchaseDay=i;
    	
    	while(i<n && j<n) {
    		
    		if(A[i]<A[j]) {
    			bestSellDay = j++;
    			i++;
    			
    		} else {
    			
    			if(bestSellDay!=-1) {
    				res.add(new ArrayList<>(Arrays.asList(bestPurchaseDay, bestSellDay)));
    				i=j++;
    				bestSellDay=-1;
    				bestPurchaseDay = i;
    			} else {
    				i = j++;
    				bestPurchaseDay = i;
    			}
    			
    		}
    	}
    	
    	if(bestSellDay!=-1) {
    		res.add(new ArrayList<>(Arrays.asList(bestPurchaseDay,bestSellDay)));
    	}
    	
    	return res;
    }

}
