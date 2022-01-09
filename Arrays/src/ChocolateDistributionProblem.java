import java.util.*;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Long> a = new ArrayList<>(Arrays.asList(3l, 4l, 1l, 9l, 56l, 7l, 9l, 1l));
		System.out.println(new ChocolateDistributionProblem().findMinDiff(a,
				 8, 5));
	}
	
	public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        Collections.sort(a);
        
        int st = 0, end=(int)(m-1);
        
        long min = Long.MAX_VALUE;
        
        while(end<n) {
        	if(a.get(end)-a.get(st)<min) min = a.get(end)-a.get(st);
        	
        	st++;
        	end++;
        }
     
        return min;   
    }

}
