import java.util.*;
public class FindAllFourSumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {10,2,3,4,5,7,8};
		int x = 23;
		ArrayList<ArrayList<Integer>> res = fourSum(arr,x);
		
		for(ArrayList<Integer> a: res) {
			System.out.println(a);
		}

	}
	
	public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int x) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		int n = arr.length;
		Arrays.sort(arr);
		
		for(int i=0; i<n; i=next(i,arr)) {
			for(int j=i+1; j<n; j=next(j,arr)) {
				int l = j+1;
				int r = n-1;
				int target = x - (arr[i] + arr[j]);
				
				while(l<r) {
					int currSum = arr[l]+arr[r];
					if(currSum==target) {
						res.add(toArrayList(new int[] {arr[i],arr[j],arr[l],arr[r]}));
						l = next(l, arr);
						r = prev(r, arr);
					} else if(currSum>target) {
						r = prev(r, arr);
					} else {
						l = next(l, arr);
					}
				}
			}
		}
		
		return res;
    }
	
	private static ArrayList<Integer> toArrayList(int[] arr) {
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int ai: arr) {
			temp.add(ai);
		}
		return temp;
	}
	
	private static int next(int cIdx, int[] arr) {
		int currElem = arr[cIdx];
		for(int i=cIdx+1; i<arr.length; i++) {
			if(arr[i]!=currElem) return i;
		}
		return arr.length;
	}
	
	private static int prev(int cIdx, int[] arr) {
		int currElem = arr[cIdx];
		for(int i=cIdx-1; i>=0; i--) {
			if(arr[i]!=currElem) return i;
		}
		return 0;
	}

}
