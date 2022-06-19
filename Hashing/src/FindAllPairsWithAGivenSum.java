import java.util.*;
public class FindAllPairsWithAGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] A = new long[]{-1, -2, 4, -6, 5, 7};
		long[] B = new long[]{6, 3, 4, 0};
		long X = 8;
		
		pair[] res = allPairs(A, B, A.length, B.length, X);
		System.out.println(Arrays.toString(res));

	}
	
	public static pair[] allPairs(long A[], long B[], long N, long M, long X) {
		Arrays.sort(A);
		Set<Long> set = new HashSet<>();
		for(long bi: B) { set.add(bi);}

		List<pair> pairs = new ArrayList<>();
		for(long ai: A) {
			long target = X - ai;
			
			if(set.contains(target)) {
				pairs.add(new pair(ai, target));
			}
		}
		
		pair[] res = new pair[pairs.size()];
		int i=0;
		for(pair p: pairs) { res[i++]=p; }
		return res;
    }
	
	static class pair  {  
	    long first, second;  
	    public pair(long first, long second)  
	    {  
	        this.first = first;  
	        this.second = second;  
	    }  
	    
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "("+first+", "+second+")";
	    }
	}

}
