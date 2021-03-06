
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		String s1 = "ABCDGH";
		String s2 = "AEDFHR";
		
		int res = lcs(s1.length(), s2.length(), s1, s2);
		System.out.println("res: "+res);
	}
	
	
	static int LIM = 1001;
	static int T[][];

	//Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
    	// init
		T = new int[LIM][LIM];
		for(int r=0; r<LIM; r++) {
			for(int c=0; c<LIM; c++) {
				T[r][c] = -1;
			}
		}
		
        return find_lcs(s1, s2, x-1, y-1);
    }
    
    static int find_lcs(String s1, String s2, int x, int y) {
    	
    	// base case
    	if(x==-1 || y==-1) return 0;
    	
    	// check memory
    	if(T[x][y]!=-1) return T[x][y];
    	
    	// Choice diagram
    	if(s1.charAt(x)==s2.charAt(y)) {
    		T[x][y] = find_lcs(s1, s2, x-1, y-1) + 1;
    		return T[x][y];
    		
    	} else {
    		T[x][y] = Math.max(find_lcs(s1, s2, x-1, y), find_lcs(s1, s2, x, y-1));
    		return T[x][y];
    	}
    }

}
