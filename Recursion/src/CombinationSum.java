import java.util.*;


public class CombinationSum {

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<>();
		A.add(7);
		A.add(2);
		A.add(6);
		A.add(5);
		
		
		
		ArrayList<ArrayList<Integer>> res = combinationSum(A, 16);
		System.out.println(res);

	}
	
	static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
		HashSet<Integer> set = new HashSet<>(A);
		ArrayList<Integer> arr = new ArrayList<>();
		arr.addAll(set);
		Collections.sort(arr);
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		recc(arr, 0, B, new ArrayList<>(), res);
		
		return res;
    }
	
	
	static void recc(ArrayList<Integer> A, int i, int target, ArrayList<Integer> temp,
			ArrayList<ArrayList<Integer>> res) {
		
		if(target==0) {
			res.add(new ArrayList<>(temp));
			return;
		}
		
		if(i>=A.size()) return;
		
		if(A.get(i)<=target) {
			temp.add(A.get(i));
			recc(A, i, target-A.get(i), temp, res);
			temp.remove(temp.size()-1);
		}
		
		recc(A, i+1, target, temp, res);
	}

}
