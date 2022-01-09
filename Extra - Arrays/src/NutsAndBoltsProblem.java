import java.util.Arrays;
import java.util.HashMap;

public class NutsAndBoltsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] nuts = new char[]{'^', '&', '%', '@', '#', '*', '$', '~', '!'};
		char[] bolts = new char[] {'~', '#', '@', '%', '&', '*', '$' ,'^', '!'};
		
		new NutsAndBoltsProblem().matchPairs(nuts, bolts, nuts.length);
		
		System.out.println(Arrays.toString(nuts));
		System.out.println(Arrays.toString(bolts));

	}
	
	void matchPairs(char nuts[], char bolts[], int n) {
        init();
        
        quickSort(nuts, 0, n-1);
        quickSort(bolts, 0, n-1);
    }
	

	
	private void quickSort(char[] arr, int l, int r) {
		if(l<r) {
			int pi = partition(arr,l,r);
			
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, r);
		}
	}
	
	private int partition(char[] arr, int l, int r) {
		
		int leftEnd=l-1;
		char pivot = arr[r];
		
		for(int curr=l; curr<r; curr++) {
			
			if(compare(arr[curr], pivot)) {
				leftEnd++;
				swap(arr, leftEnd, curr);
			}
		}
		
		swap(arr, leftEnd+1, r);
		return leftEnd+1;
		
	}
	
	private void swap(char[] arr, int idx1, int idx2) {
		char temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

	private HashMap<Character, Integer> map;
	
	private void init() {
		map = new HashMap<>();
		map.put('!', 0);
		map.put('#', 1);
		map.put('$', 2);
		map.put('%', 3);
		map.put('&', 4);
		map.put('*', 5);
		map.put('@', 6);
		map.put('^', 7);
		map.put('~', 8);
	}
	
	
	// return true if c1 has high priority than c2
	private boolean compare(char c1, char c2) {
		int idx1 = map.get(c1);
		int idx2 = map.get(c2);
		
		return idx1 < idx2;
	}

}
