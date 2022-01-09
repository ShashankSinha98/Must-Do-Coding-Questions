import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Combination_Sum_Part_2 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {10,1,2,7,6,1,5};
		List<List<Integer>> res = combinationSum2(arr, 8);
		System.out.println(res);

	}
	
	static List<List<Integer>> res;
	static ArrayList<Integer> temp;
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		
		res = new ArrayList<>();
		temp = new ArrayList<>();
		
		Arrays.sort(candidates);
		
		recc(candidates, 0, target);
		
		return res;
    }
	
	static void recc(int[] A, int idx, int T) {
		
		if(T==0) {
			res.add(new ArrayList<>(temp));
			return;
		}
		
		if(idx>=A.length) return;
		
		for(int i=idx; i<A.length; i++) {
			
			if(i!=idx && A[i]==A[i-1]) continue;
			
			if(A[i]>T) break;
			
			temp.add(A[i]);
			recc(A, i+1, T-A[i]);
			temp.remove(temp.size()-1);
		}
	}

}
