import java.util.*;

public class ReverseArrayInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		new ReverseArrayInGroups().reverseInGroups(arr, 4, 2);
		
		System.out.println(arr);

	}
	
	
	void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        
		int noOfItr = n/k;
		
		int left = 0, right = k-1;
		
		for(int i=0; i<noOfItr; i++) {
			
			int tl = left, tr = right;
			
			while(tl<tr) {
				swap(arr,tl,tr);
				tl++;
				tr--;
			}
			
			left+=k;
			right+=k;
		}
		
		if(n%k!=0) {
			right = n-1;
			left = (n/k) * k;
			
			while(left<right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		
    }
	
	private void swap(ArrayList<Integer> arr, int p1, int p2) {
		int temp = arr.get(p1);
		arr.set(p1, arr.get(p2));
		arr.set(p2, temp);
	}

}
