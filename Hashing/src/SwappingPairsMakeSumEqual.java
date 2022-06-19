import java.util.*;
public class SwappingPairsMakeSumEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long[] A = new long[] {5, 7, 4, 6};
		long[] B = new long[] {1, 2, 3, 8};
		
		long ans = findSwapValues(A, A.length, B, B.length);
		System.out.println("Ans: "+ans);
	}
	
	static long findSwapValues(long A[], int n, long  B[], int m)
    {
        HashSet<Long> set = new HashSet<>();
        for(long bi: B) { set.add(bi); }
        
        long S1=0, S2=0;
        for(long ai: A) {S1+=ai;}
        for(long bi: B) {S2+=bi;}
        
        if((S1-S2)%2!=0) {// System.out.println("Odd Difference");
        return -1;}
        
        long k = (S1-S2)/2;
        
        for(long ai: A) {
        	long bi = ai - k;
        	if(set.contains(bi)) return 1;
        }
        
        return -1;
    }

}
