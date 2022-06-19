import java.util.*;
public class ArrayPairSumDivisibilityProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {13, 11, 9, 3, 7, 1};
		int k = 4;
		boolean ans = canPair(nums, k);
		System.out.println("Ans: "+ans);

	}
	
	static int MAX = (int)Math.pow(10, 5) + 5;
	public static boolean canPair(int[] nums, int k) {
        
		int[] T = new int[MAX];
		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i] % k;
			T[nums[i]]++;
		}
		
		for(int i=0; i<k;) {
			if(T[i]>0) {
				int target = (k-i) % k;
				if(i==target) { if(T[i]%2!=0) return false; else T[i]=0; }
				else {
					if(T[target]==0) return false;
					else {
						T[target]--;
						T[i]--;
					}
				}
				
			} else i++;
		}
		
		//for(int i=0; i<k; i++) if(T[i]!=0) return false;
		return true;
    }

}
