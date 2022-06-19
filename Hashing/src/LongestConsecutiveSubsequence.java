import java.util.*;
public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr = new int[] {1,9,3,10,4,20,2};
		int res = findLongestConseqSubseq(arr, arr.length);
		System.out.println("Res: "+res);
	}
	
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   Set<Integer> set = new HashSet<>();
	   for(int ai: arr) { set.add(ai); }
	   
	   Map<Integer, Boolean> map = new HashMap<>();
	   for(int ai: set) {
		   if(!set.contains(ai-1)) {
			   map.put(ai, true);
		   }
	   }
	   
	   int res = 1;
	   for(int key: map.keySet()) {
		   if(map.get(key)) {
			   int count=1;
			   while(set.contains(key+1)) {
				   count++;
				   res = Math.max(count, res);
				   key = key+1;
			   }
		   }
	   }
	   
	   return res;
	}

}
