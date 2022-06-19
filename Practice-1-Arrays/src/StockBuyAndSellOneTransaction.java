
public class StockBuyAndSellOneTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {3, 3, 5, 0, 0, 3, 1, 4 };
		int profit = maxProfit(arr, arr.length);
		System.out.println("Profit: "+profit);

	}
	
	static int maxProfit(int[] arr, int n) {
		int min = arr[0];
		int maxProfit = 0;
		
		for(int ai: arr) {
			if(ai<min) min = ai;
			
			maxProfit = Math.max(ai-min, maxProfit);
		}
		
		return maxProfit;
	}

}
