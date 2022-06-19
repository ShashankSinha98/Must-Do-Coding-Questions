import java.util.*;
public class LargestSubarrayWith0Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {15,-2,2,-8,1,7,10,23};
		int ans = maxLen(arr, arr.length);
		System.out.println("Ans: "+ans);

	}
	
	static HashMap<Integer, ArrayList<Integer>> map;
	static int maxLen(int arr[], int n)
    {
		map = new HashMap();
		ArrayList<Integer> t = new ArrayList<>();
		t.add(0);
		map.put(0, t);
		
		int sum=0;
		int maxLen = 0;
		
		for(int i=1; i<=n; i++) {
			sum+= arr[i-1];
			ArrayList<Integer> temp;
			if(!map.containsKey(sum)) {
				temp = new ArrayList<>();
				temp.add(i);
				map.put(sum, temp);
				
			} else {
				temp = map.get(sum);
				maxLen = Math.max(maxLen, i-temp.get(0));
				temp.add(i);
			}
		}
		
		return maxLen;
    }

}
