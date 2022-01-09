import java.util.*;
public class FindDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        
		ArrayList<Integer> res = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			arr[arr[i]%n] += n;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>=2*n) res.add(i);
		}
		
		if(res.size()==0) res.add(-1);
		
		return res;
    }

}
