// https://practice.geeksforgeeks.org/problems/key-pair5616/1/

import java.util.*;
public class KeyPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {2,1,3};
		int x = 4;
		
		boolean ans = hasArrayTwoCandidates(arr, arr.length, x);
		System.out.println("Ans: "+ans);

	}
	
	static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int ai: arr) {
	    	if(map.containsKey(ai)) {
	    		map.put(ai, map.get(ai)+1);
	    	} else {
	    		map.put(ai, 1);
	    	}
	    }
	    
	    for(int ai: arr) {
	    	int target = x-ai;
	    	
	    	if(map.containsKey(target)) {
	    		if(target==ai) {
	    			if(map.get(target)>1) return true;
	    		} else return true;
	    	}
	    }
	    
	    return false;
	}

}
