import java.util.ArrayList;

public class SpirallyTraversingaMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[][] {{1}};
	           
		System.out.println(spirallyTraverse(matrix, 1, 1));
	}
	
	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int noOfLoops = r/2 + r%2;
        ArrayList<Integer> res = new ArrayList<>();
        
        int ts=0, te=c-1, rs=1, re=r-2, bs=c-1, be=0, ls=r-2, le=1;
        
        for(int l=0; l<noOfLoops; l++) {
        	
        	if(ts<=te && res.size()<(r*c)) {
        		for(int j=ts; j<=te; j++)
        			res.add(matrix[l][j]);
        		ts++; te--;
        	}
        	
        	if(rs<=re && res.size()<(r*c)) {
        		for(int j=rs; j<=re; j++)
        			res.add(matrix[j][c-l-1]);
        		rs++; re--;
        	} 
        	
        	if(bs>=be && res.size()<(r*c)) {
        	
        		for(int j=bs; j>=be; j--) 
        			res.add(matrix[r-l-1][j]);
        		bs--; be++;
        	}
        	
        	if(ls>=le && res.size()<(r*c)) {
        		for(int j=ls; j>=le; j--) 
        			res.add(matrix[j][l]);
        		ls--; le++;
        	}
        	
        	
        }
        
        return res;
    }

}
