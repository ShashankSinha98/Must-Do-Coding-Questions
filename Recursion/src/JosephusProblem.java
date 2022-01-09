import java.util.ArrayList;

public class JosephusProblem {

	public static void main(String[] args) {
		
		int res = josephus(5, 3);
		System.out.println("res: "+res);

	}
	
	public static int josephus(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
        	arr.add(i);
        }
        
        return recc(arr, 0, k);
    }
	
	private static int recc(ArrayList<Integer> arr, int i, int k) {
		
		// base case
		if(arr.size()==1) return arr.get(0);
		
		i = (i+(k-1)) % arr.size();
		
		arr.remove(i);
		
		return recc(arr, i, k);
	}


}
