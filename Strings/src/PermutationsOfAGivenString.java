import java.util.*;
public class PermutationsOfAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PermutationsOfAGivenString().find_permutation("ABC");
	}
	
	private ArrayList<String> res;
	public List<String> find_permutation(String S) {
        
		res = new ArrayList<>();
		getPermutations(0, S.toCharArray());
		
		// System.out.println(res);
		Collections.sort(res);
		
		return res;
		
    }
	
	private void getPermutations(int i, char[] arr) {
		
		if(i==arr.length-1) {
			res.add(new String(arr));
			return;
		}
		
		for(int j=i; j<arr.length; j++) {
			swap(arr, i, j);
			getPermutations(i+1, arr);
			swap(arr, i, j);
		}
	}
	
	private void swap(char[] arr, int p1, int p2) {
		char temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
	}
	

}
