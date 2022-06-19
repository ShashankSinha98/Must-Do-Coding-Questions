import java.util.*;

public class ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String isSubset(long a1[], long a2[], long n, long m) {
	      
		 Set<Long> set = new HashSet<>();
	     for(long a1i: a1) {
	    	 set.add(a1i);
	     }
	     
	     for(long a2i: a2) {
	    	 if(!set.contains(a2i)) return "No";
	     }
	     
	     return "Yes";
	 }

}
