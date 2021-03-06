import java.util.*;
public class SecondMostRepeatedStringInASequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[] {"ghi", "ghi", "aaa", "ghi", "ghi", "ghi", "ghi"};
		
		System.out.println(secFrequent(arr, arr.length));
		
	}
	
	static String secFrequent(String arr[], int N)
    {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String si: arr) {
			
			if(map.containsKey(si)) {
				int count = map.get(si);
				map.put(si, count+1);
			} else {
				map.put(si, 1);
			}
		}
		
		int maxCount = Integer.MIN_VALUE;
		int secondMaxCount = Integer.MIN_VALUE;
		String maxStr = "";
		String secondMaxStr = ""; 
		
		
		for(String s: map.keySet()) {
			
			int count = map.get(s);
			
			if(count>maxCount) {
				if(maxCount==Integer.MIN_VALUE) {
					maxCount = count;
					maxStr = s;
				} else {
					secondMaxStr = maxStr;
					secondMaxCount = maxCount;
					maxCount = count;
					maxStr = s;
				}
			
			} else if(count<maxCount && count>secondMaxCount) {
				secondMaxCount = count;
				secondMaxStr = s;
			}
		}
		
		return secondMaxStr;
    }

}
