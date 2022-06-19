import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SortingElementsOfAnArrayByFrequency {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		while(T--!=0) {
			int N = Integer.parseInt(br.readLine());
			
			String[] strArr = br.readLine().split("\\s+");
			int[] arr = new int[N];
			for(int i=0; i<N; i++) arr[i] = Integer.parseInt(strArr[i]); 
			
			int[] res = solve(arr, N);
			StringBuilder resStr = new StringBuilder();
			for(int ri: res) resStr.append(ri+" ");
			
			System.out.println(resStr.toString().trim());	
		}

	}
	
	static HashMap<Integer, Integer> map;
	private static int[] solve(int[] arr, int N) {
		map = new HashMap<>();
		
		for(int ai: arr) {
			if(map.containsKey(ai)) {
				map.put(ai, map.get(ai)+1);
			} else {
				map.put(ai, 1);
			}
		}
		
		List<Integer> temp = new ArrayList<>();
		for(int ai: arr) temp.add(ai);
		
		Collections.sort(temp, new CustomCompare());
		
		for(int i=0; i<N; i++) arr[i] = temp.get(i);
		
		return arr;
	}

	private static class CustomCompare implements Comparator<Integer> {
		
		public int compare(Integer i1, Integer i2) {
			int f1 = map.get(i1);
			int f2 = map.get(i2);
			
			if(f1<f2) return 1;
			else if(f1>f2) return -1;
			else return (i1<i2)?-1:1;
		}
	}
}
