import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;



public class SortAnArrayAccordingToTheOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A1 = new int[] {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
		int[] A2 = new int[] {2, 1, 8, 3};
		
		int[] ans = sortA1ByA2(A1, A1.length, A2, A2.length);
		System.out.println("Ans: "+Arrays.toString(ans));
		
		
	}
	
	static HashMap<Integer, Integer> map;
	public static int[] sortA1ByA2(int A1[], int N, int A2[], int M) {
		map = new HashMap<>();
		
		for(int i=0; i<M; i++) { map.put(A2[i], i); }
		
		ArrayList<Integer> temp = new ArrayList<>();
		for(int ai: A1) temp.add(ai);
		
		Collections.sort(temp, new CustomCompare());
		
		int j=0;
		for(int i=N-1; i>=0; i--) {
			int n = temp.get(i);
			A1[j++] = n;
		}
		
		return A1;
    }
	
	private static class CustomCompare implements Comparator<Integer> {
		
		@Override
		public int compare(Integer i1, Integer i2) {
			
			if(map.containsKey(i1) && map.containsKey(i2)) {
				int n1 = map.get(i1);
				int n2 = map.get(i2);
				
				return (n1<=n2)? 1:-1;
			} else if(map.containsKey(i1)){
				return 1;
			} else if(map.containsKey(i2)) {
				return -1;
			} else {
				return i1<=i2? 1:-1;
			}
		}
	}

}
