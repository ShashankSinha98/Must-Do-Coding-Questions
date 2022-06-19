import java.util.Arrays;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geek";
		String t = "geek";
		
		int ans = editDistance(s, t);
		System.out.println("Ans: "+ans);

	}
	
	static int[][] T;
	public static int editDistance(String s, String t) {
		T = new int[s.length()+1][t.length()+1];
		for(int[] a: T) 
			Arrays.fill(a, -1);
		
        return fn(s,t,s.length(), t.length());
    }
	
	static int fn(String s, String t, int i, int j) {
		//System.out.println("i: "+i+", j: "+j);
		if(i==0 || j==0) return i+j;
		
		if(T[i][j]!=-1) return T[i][j];
		
		if(s.charAt(i-1)==t.charAt(j-1)) {
			return T[i][j] = fn(s,t,i-1,j-1);
		} else {
			int add = fn(s,t,i,j-1);
			int remove = fn(s,t,i-1,j);
			int replace = fn(s,t,i-1,j-1);
			
			return T[i][j] = Math.min(add, Math.min(replace, remove)) + 1;
		}
	}

}
