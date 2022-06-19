
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    static int lcs(int x, int y, String s1, String s2) {
    	
    	int[][] T = new int[x+1][y+1];
    	
    	for(int i=1; i<=x; i++) {
    		for(int j=1; j<=y; j++) {
    			
    			if(s1.charAt(i-1)==s2.charAt(j-1)) {
    				T[i][j] = T[i-1][j-1]+1;
    			} else {
    				T[i][j] = Math.max(T[i][j-1], T[i-1][j]);
    			}
    		}
    	}
    	
    	return T[x][y];
    }

}
